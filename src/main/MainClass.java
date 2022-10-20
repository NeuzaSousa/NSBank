package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import components.Accounts;
import components.Client;
import components.Credit;
import components.CurrentAccount;
import components.Debit;
import components.SavingsAccount;
import components.Transfer;

public class MainClass {
	static Hashtable<Integer, String> accountInformation;
	static List<String> array = new ArrayList<>();

	public static void main(String[] args) {
		int clients = 3;
		createClients(clients);

		LocalDate today = LocalDate.now();
		LocalDate transactionDate = today.plusDays(2);

		makeFlow(" ", "debit", 50.0, 1, true, transactionDate);

		for (int i = 1; i <= clients * 2; i += 2) {
			makeFlow(" ", "credit", 100.50, i, true, transactionDate); // since each client has a current account and a
																		// balance account and currentAccounts are
																		// created prior to balanceAccounts, all current
																		// accounts have odd numbers
		}
		for (int i = 2; i <= clients * 2; i += 2) {
			makeFlow(" ", "credit", 1500, 2, true, transactionDate); // since each client has a current account and a
																		// balance account and currentAccounts are
																		// created prior to balanceAccounts, all balance
																		// accounts have even numbers
		}

		makeFlow("", "transfer", 50, 1, true, transactionDate, 2);

	}

	public static <T> List<T> createClients(int number) {
		List<T> clients = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			String name = "name" + String.valueOf(i);
			String firstName = "firstname" + String.valueOf(i);
			Client client = new Client(name, firstName);
			generateAccounts(client);
			clients.add((T) client);
			printClients(clients);
		}
		return clients;
	}

	private static <T> String printClients(List<T> clients) {
		return clients.toString();
	}

	public static <T> void generateAccounts(Client client) {
		List<T> accounts = new ArrayList<>();
		String savings = "Savings Account: " + 0;
		String current = " Current Account: " + 0;
		CurrentAccount currentAccount = new CurrentAccount(client, current);
		accounts.add((T) currentAccount);
		createHashtable(currentAccount);
		SavingsAccount savingsAccount = new SavingsAccount(client, savings);
		accounts.add((T) savingsAccount);
		createHashtable(savingsAccount);
		showAccounts(accounts);
	}

	private static <T> String showAccounts(List<T> accounts) {
		return accounts.toString();

	}

	static Hashtable<Integer, String> createHashtable(Accounts account) {
		accountInformation = new Hashtable<>();
		accountInformation.put(account.getAccountNumber(), account.toString());
		showHashtable(accountInformation);
		return accountInformation;
	}

	private static String showHashtable(Hashtable<Integer, String> accountInformation) {
		// could not sort because could not update balance
		return accountInformation.toString();

	}

	private static List<String> makeFlow(String comment, String identifier, double ammount, int targetAccountNumber,
			boolean effect, LocalDate dateOfFlow, int... accountNumber) {
		if (identifier == "credit") {
			Credit credit = new Credit(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
			Accounts.setBalance(credit);
		} else if (identifier == "debit") {
			Debit debit = new Debit(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
			Accounts.setBalance(debit);
		} else if (identifier == "transfer") {
			Transfer transfer = new Transfer(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow,
					accountNumber[0]);
			Accounts.setBalance(transfer);
		}

		List<String> flow = new ArrayList<>();
		flow.add("Comment: " + comment.toString() + " Identifyer: " + identifier.toString() + " Ammount: "
				+ String.valueOf(ammount) + String.valueOf(targetAccountNumber) + " Effect: " + String.valueOf(effect)
				+ " Date of Transaction: " + String.valueOf(dateOfFlow) + " Account Number: "
				+ String.valueOf(accountNumber));
		return flow;
	}

	static void updateAccounts(List<String> flow, Hashtable<Integer, String> accountInformation) {
		double balance = Accounts.getBalance();
		Set<Integer> setOfKeys = accountInformation.keySet();
		for (Integer key : setOfKeys) {
			// accountInformation.get(key).stream().filter(balance -> balance <
			// 0).forEach(System.out::println); // this is not working
		}

	}
}

package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import components.Accounts;
import components.Client;
import components.CurrentAccount;
import components.SavingsAccount;

public class MainClass {

	public static void main(String[] args) {
		createClients(3);
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
		// System.out.println(clients);
		return clients;
	}

	private static <T> String printClients(List<T> clients) {
		// System.out.println(clients.toString());
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
		// System.out.println(accounts);
	}

	private static <T> String showAccounts(List<T> accounts) {
		// System.out.println(accounts.toString());
		return accounts.toString();

	}

	static void createHashtable(Accounts account) {
		Hashtable<Integer, String> accountInformation = new Hashtable<>();
		accountInformation.put(account.getAccountNumber(), account.toString());
		// System.out.println(accountInformation);
		showHashtable(accountInformation);

	}

	private static String showHashtable(Hashtable<Integer, String> accountInformation) {
		// System.out.println(accountInformation.toString());
		return accountInformation.toString();

	}
}

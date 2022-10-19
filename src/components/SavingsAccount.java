package components;

public class SavingsAccount extends Accounts {
	String name;
	String firstName;

	Client client = new Client(name, firstName);

	public SavingsAccount(Client client, String label) {
		super(client, label);
	}

}

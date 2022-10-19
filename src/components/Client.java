package components;

public class Client {
	private String name;
	private String firstName;
	private static int clientNumber = 0;

	public Client(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
		Client.clientNumber++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		Client.clientNumber = clientNumber;
	}

	public String toString() {
		return "Name: " + name + " First Name: " + firstName + " Client Number: " + String.valueOf(clientNumber);
	}

}

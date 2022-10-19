package main;

import java.util.ArrayList;
import java.util.List;

import components.Client;

public class ClientsRunner {

	public static <T> void main(String[] args) {
		createClients(3);
	}

	public static <T> void createClients(int number) {
		for (int i = 1; i <= number; i++) {
			String name = "name" + String.valueOf(i);
			String firstName = "firstname" + String.valueOf(i);
			Client client = new Client(name, firstName);
			List<T> clients = new ArrayList<>();
			clients.add((T) client);
			// System.out.println(clients);
			printClients(clients);
		}
	}

	private static <T> String printClients(List<T> clients) {
		System.out.println(clients.toString());
		return clients.toString();
	}
}

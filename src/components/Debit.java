package components;

import java.time.LocalDate;

public class Debit extends Flow {

	public Debit(String comment, String identifier, double ammount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
	}
}

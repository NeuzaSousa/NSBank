package components;

import java.time.LocalDate;

public class Credit extends Flow {

	public Credit(String comment, String identifier, double ammount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
	}
}

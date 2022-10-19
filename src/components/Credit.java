package components;

import java.util.Date;

public class Credit extends Flow {

	protected Credit(String comment, int identifier, double ammount, int targetAccountNumber, boolean effect,
			Date dateOfFlow) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
	}
}

package components;

import java.time.LocalDate;

public abstract class Flow {
	private String comment;
	private String identifier;
	private double ammount;
	private int targetAccountNumber;
	private boolean effect;
	private LocalDate dateOfFlow;

	protected Flow(String comment, String identifier, double ammount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow) {
		super();
		this.comment = comment;
		this.identifier = identifier;
		this.ammount = ammount;
		this.targetAccountNumber = targetAccountNumber;
		this.effect = effect;
		this.dateOfFlow = dateOfFlow;

	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public int getTargetAccountNumber() {
		return targetAccountNumber;
	}

	public void setTargetAccountNumber(int targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}

	public boolean isEffect() {
		return effect;
	}

	public void setEffect(boolean effect) {
		this.effect = effect;
	}

	public LocalDate getDateOfFlow() {
		return dateOfFlow;
	}

	public void setDateOfFlow(LocalDate dateOfFlow) {
		this.dateOfFlow = dateOfFlow;
	}

	public String toString() {
		return "Comment: " + comment + " Identifier: " + identifier + "Ammount: " + ammount + " targetAccountNumber: "
				+ targetAccountNumber + "effect: " + effect + " date of flow: " + dateOfFlow;
	}

}

package components;

import java.util.Date;

public abstract class Flow {
	private String comment;
	private int identifier;
	private double ammount;
	private int targetAccountNumber;
	private boolean effect;
	private Date dateOfFlow;

	protected Flow(String comment, int identifier, double ammount, int targetAccountNumber, boolean effect,
			Date dateOfFlow) {
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

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
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

	public Date getDateOfFlow() {
		return dateOfFlow;
	}

	public void setDateOfFlow(Date dateOfFlow) {
		this.dateOfFlow = dateOfFlow;
	}

}

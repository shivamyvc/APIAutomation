package models.request.transaction;

public class ReqDeposite {

	private String accountNumber;
	private String description;
	private int amount;

	public ReqDeposite(String accountNumber, String description, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.description = description;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static class Builder {
		private String accountNumber;
		private String description;
		private int amount;

		public Builder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder amount(int amount) {
			this.amount = amount;
			return this;
		}

		public ReqDeposite build() {
			return new ReqDeposite(accountNumber, description, amount);
		}
	}

}

package models.request.account.controller;

public class ReqAccounts {

	// accounts Create
	private String accountType;
	private String branch;

	public ReqAccounts(String accountType, String branch) {
		super();
		this.accountType = accountType;
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static class Builder {

		// accounts Create
		private String accountType;
		private String branch;

		public Builder accountType(String accountType) {
			this.accountType = accountType;
			return this;
		}

		public Builder branch(String branch) {
			this.branch = branch;
			return this;
		}

		public ReqAccounts build() {
			return new ReqAccounts(accountType, branch);
		}

	}

}

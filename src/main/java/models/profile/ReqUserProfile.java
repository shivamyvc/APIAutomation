package models.profile;

public class ReqUserProfile {

	// User Profile Model ===================

	protected String firstName;
	protected String lastName;
	protected String email;
	protected String mobileNumber;
	protected String address;

	// User Profile Model END ===================

	public ReqUserProfile() {

	}

	private ReqUserProfile(String firstName, String lastName, String email, String mobileNumber, String address) {
		this.address = address;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static class Builder {
		// Success Response Model ===================

		protected String firstName;
		protected String lastName;
		protected String email;
		protected String mobileNumber;
		protected String address;

		// Success Response Model END ===================

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public ReqUserProfile build() {
			return new ReqUserProfile(firstName, lastName, email, mobileNumber, address);
		}

	}

}

package models.response.profile;

import java.util.ArrayList;

public class RespProfile {

	// Success Get Response Model ===================
	protected int id;
	protected String username;
	protected String password; // -- Add this
	protected String email;
	protected String firstName;
	protected String lastName;
	protected String mobileNumber;

	// Success Response Model END ===================

	// User Profile Patch Response params
	protected ArrayList<String> roles; // -- Add this
	protected boolean active; // -- Add this
	protected String createdAt; // -- Add this
	protected String updatedAt; // -- Add this
	protected String address; // -- Add this
	protected String fullName; // -- Add this

	// Fail Response Model ===================

	protected String timestamp;
	protected int status;
	protected String error;
	protected String message;
	protected String path;
	protected String solution;
	protected String errorCode;

	public RespProfile() {

	}

	public RespProfile(int id, String username, String password, String email, String firstName, String lastName,
			String mobileNumber, ArrayList<String> roles, boolean active, String createdAt, String updatedAt,
			String address, String fullName, String timestamp, int status, String error, String message, String path,
			String solution, String errorCode) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.roles = roles;
		this.active = active;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.address = address;
		this.fullName = fullName;
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
		this.solution = solution;
		this.errorCode = errorCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	// Fail Response Model END ===================

//	public RespProfile(int id, String username, String email, String firstName, String lastName, String mobileNumber,
//			String timestamp, int status, String error, String message, String path, String solution,
//			String errorCode
//			//Patch Response
//			,String address
//			,String createdAt
//			,String updatedAt
//			,String createdAt
//			,boolean active) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.email = email;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.mobileNumber = mobileNumber;
//		this.timestamp = timestamp;
//		this.status = status;
//		this.error = error;
//		this.message = message;
//		this.path = path;
//		this.solution = solution;
//		this.errorCode = errorCode;
//		
//		//-- Patch Response
//		
//		this.address=address;
//		this.active=active;
//		this.createdAt=createdAt;
//		this.updatedAt=updatedAt;
//		this.fullName=fullName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public String getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(String timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}
//
//	public String getError() {
//		return error;
//	}
//
//	public void setError(String error) {
//		this.error = error;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public String getPath() {
//		return path;
//	}
//
//	public void setPath(String path) {
//		this.path = path;
//	}
//
//	public String getSolution() {
//		return solution;
//	}
//
//	public void setSolution(String solution) {
//		this.solution = solution;
//	}
//
//	public String getErrorCode() {
//		return errorCode;
//	}
//
//	public void setErrorCode(String errorCode) {
//		this.errorCode = errorCode;
//	}

}

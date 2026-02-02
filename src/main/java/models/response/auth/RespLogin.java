package models.response.auth;

import java.util.ArrayList;

public class RespLogin {

	// ===================================Success Response
	// Model=============================================//
	protected String token;
	protected String type;
	protected int id;
	protected String username;
	protected String email;
	protected ArrayList<String> roles;
	// ===================================Success Response Model
	// END=============================================//

	// ===================================Error Response
	// Model=============================================//

	protected String timestamp;
	protected int status;
	protected String error;
	protected String message;
	protected String path;
	protected String solution;
	protected String errorCode;

	// ===================================Error Response
	// Model=============================================//
	public RespLogin() {

	}

	public RespLogin(String token, String type, int id, String username, String email, ArrayList<String> roles,
			String timestamp, int status, String error, String message, String path, String solution,
			String errorCode) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
		this.solution = solution;
		this.errorCode = errorCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
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



}

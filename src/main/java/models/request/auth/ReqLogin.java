package models.request.auth;

public class ReqLogin {

	protected String username;
	protected String password;
	public ReqLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
	
	public static class Builder{
		protected String username;
		protected String password;
		
		public Builder username(String username) {
			this.username=username;
			return this;
		}
		
		public Builder password(String password) {
			this.password=password;
			return this;
		}
		
		public ReqLogin build() {
			
			return new ReqLogin(username, password);
		}
		
	}
	
	
	
}

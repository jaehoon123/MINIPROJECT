package ojc.login.dto;

public class Login {
	private String userId;
	private String password;
	private String error;
	public final String getUserId() {
		return userId;
	}
	public final void setUserId(String userId) {
		this.userId = userId;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final String getError() {
		return error;
	}
	public final void setError(String error) {
		this.error = error;
	}  
	
	
	
}

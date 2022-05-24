package ojc.board.model;


public class BoardVo {
	private String userId;  
	private String password;
	
	public final String getEmail() {
		return userId;
	}
	public final void setEmail(String userId) {
		this.userId = userId;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
}

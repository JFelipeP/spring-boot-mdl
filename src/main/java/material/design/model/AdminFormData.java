package material.design.model;

public class AdminFormData {
	
	private String username;
	private String password;
	private String authority;
	private boolean enabled;
	
	public AdminFormData() {}

	public AdminFormData(String username, String password, String authority, boolean enabled) {		
		this.username = username;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "AdminFormData [username=" + username + ", password=" + password + ", authority=" + authority
				+ ", enabled=" + enabled + "]";
	}
	
	
	
		

}

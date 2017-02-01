package material.design.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authorities {
	
	@Id
	public String username;
	public String authority;
	
	public Authorities() {}

	public Authorities(String username, String authority) {		
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
	

}

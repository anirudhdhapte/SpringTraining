package trng.sprmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USERNPWD")
public class UsernPWD {

	@Column(name = "USERNAME", length = 30)
	@Id
	private String username;
	
	@Column(name="PASSWORD",length = 30)
	private String password;

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
}

package trng.sprjpa.entity;

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
}

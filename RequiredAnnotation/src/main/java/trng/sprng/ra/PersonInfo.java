package trng.sprng.ra;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	private String pid;
	private String pname;
	private String padd;
	@Required
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + "]";
	}
}

package sprng.trng.lb.bo;

import java.time.LocalDate;

public class BaseBean {
private int sid;
private String name;
private LocalDate DoJ;
public int getsid() {
	return sid;
}
public void setsid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDoJ() {
	return DoJ;
}
public void setDoJ(LocalDate doJ) {
	this.DoJ = doJ;
}
@Override
public String toString() {
	return "BaseBean [sid=" + sid + ", name=" + name + ", DoJ=" + DoJ + "]";
}
}

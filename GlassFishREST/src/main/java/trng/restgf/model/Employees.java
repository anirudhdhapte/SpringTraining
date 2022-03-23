package trng.restgf.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
private Integer Eid;
private String Ename;
public Employees(Integer eid, String ename) {
	Eid = eid;
	Ename = ename;
}
public Employees() {
}
public Integer getEid() {
	return Eid;
}
public void setEid(Integer eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
}

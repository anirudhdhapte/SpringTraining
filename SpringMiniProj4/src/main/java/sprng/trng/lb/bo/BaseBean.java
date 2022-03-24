package sprng.trng.lb.bo;

import java.time.LocalDate;

public class BaseBean {
private int id;
private String name;
private LocalDate DoJ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	DoJ = doJ;
}
@Override
public String toString() {
	return "BaseBean [id=" + id + ", name=" + name + ", DoJ=" + DoJ + "]";
}
}

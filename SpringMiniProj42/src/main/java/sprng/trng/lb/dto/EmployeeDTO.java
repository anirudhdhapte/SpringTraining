package sprng.trng.lb.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sprng.trng.lb.bo.BaseBean;

@Component("empdto")
@Scope("prototype")
public class EmployeeDTO extends BaseBean {
private String company;
private float salary;
private float grosssalary;
private float netsalary;
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public float getGrosssalary() {
	return grosssalary;
}
public void setGrosssalary(float grosssalary) {
	this.grosssalary = grosssalary;
}
public float getNetsalary() {
	return netsalary;
}
public void setNetsalary(float netsalary) {
	this.netsalary = netsalary;
}
@Override
public String toString() {
	return "EmployeeBO [company=" + company + ", salary=" + salary + ", grosssalary=" + grosssalary + ", netsalary="
			+ netsalary + ", toString()=" + super.toString() + "]";
}
}

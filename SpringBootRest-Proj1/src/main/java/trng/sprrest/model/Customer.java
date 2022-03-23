package trng.sprrest.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
private String cname;
private String cadd;
private Double billamt;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public Double getBillamt() {
	return billamt;
}
public void setBillamt(Double billamt) {
	this.billamt = billamt;
}
public Customer(String cname, String cadd, Double billamt) {
	super();
	this.cname = cname;
	this.cadd = cadd;
	this.billamt = billamt;
}
public Customer() {
	super();
}
@Override
public String toString() {
	return "Customer [cname=" + cname + ", cadd=" + cadd + ", billamt=" + billamt + "]";
}
}

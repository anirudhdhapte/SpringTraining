package sprng.trng.lb.bo;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stdbo")
@Scope("prototype")
public class StudentBO extends BaseBean {
private String sadd;
private String course;
private int m1,m2,m3,total;
private float avg;
public String getSadd() {
	return sadd;
}
public void setSadd(String sadd) {
	this.sadd = sadd;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public float getAvg() {
	return avg;
}
public void setAvg(float avg) {
	this.avg = avg;
}
@Override
public String toString() {
	return "StudentBO [sadd=" + sadd + ", course=" + course + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", total="
			+ total + ", avg=" + avg + ", toString()=" + super.toString() + "]";
}

}

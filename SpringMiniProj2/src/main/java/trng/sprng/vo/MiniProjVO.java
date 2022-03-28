package trng.sprng.vo;

public class MiniProjVO {
	private String sno;
	private String empno;
	private String empname;
	private String job;
	private String manager;
	private String hiredate;
	private String salary;
	private String commission;
	private String deptno;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "MiniProjVO [sno=" + sno + ", empno=" + empno + ", empname=" + empname + ", job=" + job + ", manager="
				+ manager + ", hiredate=" + hiredate + ", salary=" + salary + ", commission=" + commission + ", deptno="
				+ deptno + "]";
	}
}

package trng.sprms;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import trng.sprms.dao.EmployeeDAO;
import trng.sprms.dao.IEmployeeDAO;

@SpringBootApplication
public class SpringBootProj1Application {

	public static void main(String[] args) throws SQLException {
	ApplicationContext ctx=	SpringApplication.run(SpringBootProj1Application.class, args);
	IEmployeeDAO dao= ctx.getBean(EmployeeDAO.class);
	dao.GetEmployeeDetails();
	((ConfigurableApplicationContext) ctx).close();
	}
}

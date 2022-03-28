package trng.prcdcall.springprcdcall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProcedureCall {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	HibernateDAO dao=ctx.getBean("DAOhb",HibernateDAO.class);
	dao.procedurecall();
}
}

package trng.sprng.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAC {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("trng/sprng/beans/ApplicationContext.xml");
	LoanCalc lc=ctx.getBean("lc",LoanCalc.class);
		lc.calcinterestamt();
		((AbstractApplicationContext) ctx).close();
	}
}

package trng.sprng.ra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext cont=new ClassPathXmlApplicationContext("trng/sprng/ra/appcont.xml");
	PersonInfo pi=cont.getBean("pinfo",PersonInfo.class);
	System.out.println(pi);
	((AbstractApplicationContext) cont).close();
}
}

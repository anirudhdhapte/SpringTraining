package sprng.trng.lb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sprng.trng.lb.ctrl.MainController;

public class MiniProjTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("sprng/trng/lb/cfgs/ApplicationContext.xml");
	MainController mc=ctx.getBean("controller",MainController.class);
	mc.fetchstudent(5523,"Anirudh", "Chennai", "B.Tech",98,97,96);
	((AbstractApplicationContext) ctx).close();
}
}

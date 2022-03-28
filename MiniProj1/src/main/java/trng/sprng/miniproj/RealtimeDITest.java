package trng.sprng.miniproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RealtimeDITest {

	public static void main(String[] args) {
		String name = null, cadd = null, pamt = null, rate = null, time = null;
		CustomerVO vo = null;
		MainController controller = null;
		String result = null;
		// read inputs
		name="Anirudh";
		cadd="Chennai";
		pamt="100000";
		rate="2.5";
		time="10";
		/*
		 * System.out.println("enter Customername :: "); name = sc.next();
		 * System.out.println("Enter customer Addrs::"); cadd = sc.next();
		 * System.out.println("Enter Principle  amount::"); pamt = sc.next();
		 * System.out.println("Enter rate of intrest::"); rate = sc.next();
		 * System.out.println("Enter time   ::"); time = sc.next();
		 */
		// Store inputs in VO class object
		vo = new CustomerVO();
		vo.setCname(name);
		vo.setCadd(cadd);
		vo.setpAmt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		// create BEanFacory IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("trng/sprng/miniproj/applicationContext.xml");
		// get Controller Bean class object..
		controller = ctx.getBean("controller", MainController.class);
		// invoke the method
		try {
			result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
	((AbstractApplicationContext) ctx).close();
	}
}

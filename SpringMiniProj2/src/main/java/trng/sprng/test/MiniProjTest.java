package trng.sprng.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import trng.sprng.cfgs.ChildConfigClass;
import trng.sprng.cfgs.ParentConfigClass;
import trng.sprng.cntrlr.MiniProjController;
import trng.sprng.vo.MiniProjVO;

public class MiniProjTest {
	public static void main(String[] args) throws Exception {
		MiniProjController ctrl = null;
		List<MiniProjVO> emplist = null;
		AnnotationConfigApplicationContext pcont=new AnnotationConfigApplicationContext(ParentConfigClass.class);
		AnnotationConfigApplicationContext ccont=new AnnotationConfigApplicationContext();
		ccont.setParent(pcont);
		ccont.register(ChildConfigClass.class);
		ccont.refresh();
		ctrl = ccont.getBean("ctrl", MiniProjController.class);
		emplist = ctrl.getEmp("clerk","salesman","manager");
		emplist.forEach(vo->System.out.println(vo));
		pcont.close();
		ccont.close();
	}
}

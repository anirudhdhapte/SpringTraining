package trng.sprng.beans;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class TestBF1 {

	public static void main(String[] args) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader read=new XmlBeanDefinitionReader(factory);
	read.loadBeanDefinitions("trng/sprng/beans/ApplicationContext.xml");
	factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(LoanAmtDetails.class,new LCPropertyEditor());	
		}
	}
			);
	LoanCalc lc=factory.getBean("lc",LoanCalc.class);
		lc.calcinterestamt();
	}
}

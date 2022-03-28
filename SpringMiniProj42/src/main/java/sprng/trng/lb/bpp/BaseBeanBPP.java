package sprng.trng.lb.bpp;

import java.time.LocalDate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import sprng.trng.lb.bo.BaseBean;

@Component
public class BaseBeanBPP implements BeanPostProcessor {
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	if(bean instanceof BaseBean)
	{
		((BaseBean) bean).setDoJ(LocalDate.now());
	}
	return bean;//BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
}
}

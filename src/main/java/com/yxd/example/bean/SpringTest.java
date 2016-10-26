package com.yxd.example.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(BlockJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringTest {
	
	@Test
	public void enumBeans() {
		//获取spring装配的bean个数  
		int beanCount = ContextHelper.getInstance().getBeanDefinitionNames().length;  
		//逐个打印出spring自动装配的bean。根据我的测试，类名第一个字母小写即bean的名字  
		for(int i=0; i<beanCount; i++){  
		    System.out.println(ContextHelper.getInstance().getBeanDefinitionNames()[i]);  
		}
	}
	
	@Test
	public void test() {	
		try {
			Hello bean = ContextHelper.getInstance().getBean("helloBean", Hello.class);
			if (bean == null)
				System.out.println("bean is null.");
			else {
				bean.sayEasy();
				bean.sayByeBye();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

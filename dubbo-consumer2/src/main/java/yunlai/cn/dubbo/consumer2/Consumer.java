package yunlai.cn.dubbo.consumer2;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import yunlai.cn.dubbo.api.Service;

/**
 * Hello world!
 *
 */
public class Consumer  {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		System.out.println("consumer22 start!");
		Service service = applicationContext.getBean(Service.class);
		System.out.println("consumer22");
		System.out.println(service.getPermissions(2L));
	}
}

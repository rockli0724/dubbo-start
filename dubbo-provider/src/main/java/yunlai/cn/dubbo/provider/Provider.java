package yunlai.cn.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
		System.out.println(applicationContext+":here--->");
		applicationContext.start();
		System.out.println("服务已经启动!");
		System.in.read();// 为保证服务一直开着，利用输入流的阻塞来模拟  
	}
}

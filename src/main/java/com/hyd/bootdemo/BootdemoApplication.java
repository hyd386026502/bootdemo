package com.hyd.bootdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.hyd.bootdemo.*")
@ServletComponentScan
//  @MapperScan("com.hyd.bootdemo.mapper.*")无效 还需要在mapper接口上注解@mapper,   ?
//quetion1: 因为没扫描到config包,所以通过过滤器配置类配置的过滤器不能用
public class BootdemoApplication {

	public static void main(String[] args) {
	/*	for (String a : args){
			System.out.println("run: --"+a);
		}*/

		SpringApplication.run(BootdemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
       /*     System.out.println("let's inspect the beans provides Spring boot");
            String[] beanNames = ctx.getBeanDefinitionNames();
            for (String beanName : beanNames) {
                System.out.println("before order:" + beanName);
            }
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }*/
/*          no lamda
            return new CommandLineRunner() {
                @Override
                public void run(String... args) throws Exception {
                    System.out.println("let's inspect the beans provides Spring boot");
                    String[] beanNames = ctx.getBeanDefinitionNames();
                    for (String beanName : beanNames) {
                        System.out.println("before order:" + beanName);
                    }
                    Arrays.sort(beanNames);
                    for (String beanName : beanNames) {
                        System.out.println(beanName);
                    }
                }*/
        };

}
}

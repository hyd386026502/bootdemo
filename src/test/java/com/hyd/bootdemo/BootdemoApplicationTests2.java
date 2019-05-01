package com.hyd.bootdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)//spring boot 默认app启动类应该在主包下面,如果修改默认启动类,那么需要加测试类的类名在哪里(classes = BootdemoApplication.class)
public class BootdemoApplicationTests2 {
    /**
     *private final Logger logger = Logger
     */


	@LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate template;

	@Before
	public void setUp() throws Exception {

		System.out.println("start:----------------");
		System.out.println(port);
		this.base = new URL("http://localhost:" + port + "/");
        System.out.println(port);
	}

	/**
     * 模拟随机端口测试
	 */
	@Test
	public void getHello() throws Exception {
        System.out.println(port);
		ResponseEntity<String> response = template.getForEntity(base.toString(),
				String.class);
		assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
        System.out.println(port);
		System.out.println("end:----------------");
	}

}

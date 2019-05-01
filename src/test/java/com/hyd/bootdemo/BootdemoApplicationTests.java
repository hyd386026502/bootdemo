package com.hyd.bootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest//spring boot 默认app启动类应该在主包下面,如果修改默认启动类,那么需要加测试类的类名在哪里(classes = BootdemoApplication.class)
@AutoConfigureMockMvc
public class BootdemoApplicationTests {
    @Autowired
	private MockMvc mvc;
	@Test
	public void contextLoads() throws Exception {
        System.out.println("test start:");
	/* 	MockHttpServletRequestBuilder bulder = MockMvcRequestBuilders.get("/a");
		MockHttpServletRequestBuilder accept = bulder.accept(MediaType.APPLICATION_JSON);
        ResultActions mvcAction = mvc.perform(accept).andExpect(status().isOk());
        mvcAction.andExpect(content().string(equalTo("Greetings from Spring Boot!")));*/
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
        System.out.println("test end:");

	}

}

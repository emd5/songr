package com.mahoneyliz.Java.Songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongrApplicationTests {

	@Autowired
	HelloController helloController;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testControllerIsAutowired() {
		assertNotNull(helloController);
	}

	@Test
	public void testRequestToRootGivesHelloWorld() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Hello World!")));
	}

	@Test
	public void testRequestToCapitalize() throws Exception {
		mockMvc.perform(get("/capitalize/hello")).andExpect(content().string(containsString("HELLO")));
	}
	@Test
	public void testRequestToReverse() throws Exception {
		mockMvc.perform(get("/reverse?word=hello world")).andExpect(content().string(containsString("world hello")));
	}


}

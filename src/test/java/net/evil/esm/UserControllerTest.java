package net.evil.esm;

import net.evil.esm.domain.User;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import sun.reflect.annotation.ExceptionProxy;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void login()throws Exception {
        RequestBuilder param = MockMvcRequestBuilders.post("/api/v1/user/login")
                .param("username", "admin")
                .param("password", "12345");
        MvcResult mvcResult = mockMvc.perform(param).andReturn();
        System.out.print(mvcResult.getResponse().getContentAsString());
        System.out.print("------");


    }
}


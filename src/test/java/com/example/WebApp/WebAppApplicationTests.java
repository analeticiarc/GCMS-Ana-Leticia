package com.example.WebApp;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, World!")));
    }

    @Test
    public void shouldReturnMessageForAnaLeticia() throws Exception {
        this.mockMvc.perform(get("/AnaLeticia"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, Ana Leticia!")));
    }

    @Test
    public void shouldReturnMessageForAnaLeticiaAge() throws Exception {
        this.mockMvc.perform(get("/AnaLeticia/age"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, I am Ana Leticia! I am 19 years old.")));
    }

    @Test
    public void shouldReturnMessageForAnaLeticiaLocation() throws Exception {
        this.mockMvc.perform(get("/AnaLeticia/location"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, I am Ana Leticia! I live in Brazil.")));
    }

    @Test
    public void shouldReturnMessageForHotfix() throws Exception {
        this.mockMvc.perform(get("/hotfix"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("This is a hotfix endpoint.")));
    }

}

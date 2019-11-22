package com.trial.web.rest;

import com.trial.Test345App;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the HelloworldResource REST controller.
 *
 * @see HelloworldResource
 */
@SpringBootTest(classes = Test345App.class)
public class HelloworldResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        HelloworldResource helloworldResource = new HelloworldResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(helloworldResource)
            .build();
    }

    /**
     * Test hello
     */
    @Test
    public void testHello() throws Exception {
        restMockMvc.perform(get("/api/helloworld/hello"))
            .andExpect(status().isOk());
    }
}

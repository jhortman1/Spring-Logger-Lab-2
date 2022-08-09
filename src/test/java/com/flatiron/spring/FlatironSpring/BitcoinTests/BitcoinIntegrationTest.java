package com.flatiron.spring.FlatironSpring.BitcoinTests;

import com.flatiron.spring.FlatironSpring.Controller.BitCoinController;
import com.flatiron.spring.FlatironSpring.Service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BitCoinController.class)
public class BitcoinIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    BitcoinService bitcoinService;

    @Test
    void getPriceOfBitcoin() throws Exception {
        mockMvc.perform(get("/price"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello the current price of Bitcoin is:")));
    }
}

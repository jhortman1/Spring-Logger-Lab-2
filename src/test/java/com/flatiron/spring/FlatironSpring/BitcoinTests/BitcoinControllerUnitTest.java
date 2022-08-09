package com.flatiron.spring.FlatironSpring.BitcoinTests;

import com.flatiron.spring.FlatironSpring.Controller.BitCoinController;
import com.flatiron.spring.FlatironSpring.Service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BitcoinControllerUnitTest {
    @Test
    void returnPriceStatement(){
        BitcoinService bitcoinService = Mockito.mock(BitcoinService.class);
        String price = "4.00";
        String bitcoinPriceStatement = "Hello the current price of Bitcoin is: "+ price;
        BitCoinController bitCoinController = new BitCoinController(bitcoinService);
        when(bitcoinService.getBitcoinPrice()).thenReturn(price);
        String actual = bitCoinController.price();
        assertEquals(bitcoinPriceStatement,actual);
    }
}

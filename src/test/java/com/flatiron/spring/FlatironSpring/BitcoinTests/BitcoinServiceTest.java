package com.flatiron.spring.FlatironSpring.BitcoinTests;

import com.flatiron.spring.FlatironSpring.Service.BitcoinService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BitcoinServiceTest {
    @Test
    void priceNotNull()
    {
        BitcoinService bitcoinService = new BitcoinService();
        String price = bitcoinService.getBitcoinPrice();
        assertThat(price).isNotNull();
    }

}

package com.flatiron.spring.FlatironSpring.Controller;

import com.flatiron.spring.FlatironSpring.Service.BitcoinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitCoinController {
    private BitcoinService bitcoinService;
    public BitCoinController(BitcoinService bitcoinService)
    {
        this.bitcoinService = bitcoinService;
    }
    @GetMapping("/price")
    public @ResponseBody String price(String price)
    {
        return "Hello the current price of Bitcoin is: " + bitcoinService.getBitcoinPrice();

    }
}

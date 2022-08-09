package com.flatiron.spring.FlatironSpring.Service;

import lombok.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.crypto.Data;
import java.util.Arrays;

@Service
public class BitcoinService {
    public String getBitcoinPrice(){
        String apiURL = "http://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
        return result.getData().getVwap24Hr();
    }
    @Getter
    @Setter
    class Bitcoin{
        private String id;
        private String rank;
        private String symbol;
        private String name;
        private String supply;
        private String maxSupply;
        private String marketCapUsd;
        private String volumeUsd24Hr;
        private String priceUsd;
        private String changePercent24Hr;
        private String vwap24Hr;
        private String explorer;

    }
    @Getter
    @Setter
    class Data{
        Bitcoin data;
    }
}

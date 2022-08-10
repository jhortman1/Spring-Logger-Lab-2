package com.flatiron.spring.FlatironSpring.Service;

import lombok.*;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {
    private Logger logger = LoggerFactory.getLogger(BitcoinService.class);
        public String getBitcoinPrice(){
        logger.trace("In BitcoinService getBitCoinPrice() - begin...");
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
        logger.trace("Leaving BitcoinService getBitCoinPrice() - end.");
        return result.getData().getVwap24Hr();
    }

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
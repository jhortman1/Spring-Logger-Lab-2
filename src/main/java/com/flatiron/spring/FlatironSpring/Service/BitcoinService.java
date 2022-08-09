package com.flatiron.spring.FlatironSpring.Service;

import lombok.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {
    public String getBitcoinPrice(){
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
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
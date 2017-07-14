package com.danielpacak.seed.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class Config {

    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return servers;
    }

}

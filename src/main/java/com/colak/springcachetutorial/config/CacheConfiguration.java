package com.colak.springcachetutorial.config;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@EnableCaching

@RequiredArgsConstructor
@Slf4j
public class CacheConfiguration {
    @Bean
    public ClientConfig clientConfig() throws IOException {
        XmlClientConfigBuilder xmlClientConfigBuilder = new XmlClientConfigBuilder("client.xml");
        return xmlClientConfigBuilder.build();
    }
}
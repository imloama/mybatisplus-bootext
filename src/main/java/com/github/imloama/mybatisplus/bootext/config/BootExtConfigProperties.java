package com.github.imloama.mybatisplus.bootext.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "bootext")
public class BootExtConfigProperties {

    private String cacheName = "BOOTEXT_CACHE";

}

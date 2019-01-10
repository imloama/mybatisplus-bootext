package com.github.imloama.mybatisplus.bootext;

import com.github.imloama.mybatisplus.bootext.config.BootExtConfigProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BootExtConfigProperties.class)
public class MybatisPlusBootExtAutoConfigure {
}

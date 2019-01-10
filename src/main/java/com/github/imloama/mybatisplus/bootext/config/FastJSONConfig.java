package com.github.imloama.mybatisplus.bootext.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 配置fastjson替换jackson
 * 
 * @author 马兆永
 */
@Configuration
public class FastJSONConfig {

	@Bean
	public HttpMessageConverters customConverters() {
		FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fjc = new FastJsonConfig();
		// 配置序列化策略
		fjc.setSerializerFeatures(SerializerFeature.BrowserCompatible,
				SerializerFeature.PrettyFormat,
				SerializerFeature.DisableCircularReferenceDetect,
				SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteNullListAsEmpty);
		fastJsonConverter.setFastJsonConfig(fjc);

		return new HttpMessageConverters(fastJsonConverter);
	}

}

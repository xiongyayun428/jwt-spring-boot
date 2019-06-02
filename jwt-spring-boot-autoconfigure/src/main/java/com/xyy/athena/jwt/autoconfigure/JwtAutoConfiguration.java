package com.xyy.athena.jwt.autoconfigure;

import com.xyy.athena.jwt.properties.JwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * JwtAutoConfiguration
 *
 * @author Yayun.Xiong
 * @date 2019-06-02
 */
@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class JwtAutoConfiguration {
}

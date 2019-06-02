package com.xyy.athena.jwt.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * JwtProperties
 *
 * @author Yayun.Xiong
 * @date 2019-06-02
 */
@Data
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    /**
     * 签发者
     */
    private String issuer;

    /**
     * 过期事件
     */
    private Long expire;

    /**
     * 头部信息
     */
    private Map<String, String> header;

    /**
     * 载体
     */
    private Map<String, String> payload;
}

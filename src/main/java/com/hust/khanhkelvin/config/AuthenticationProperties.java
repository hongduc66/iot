package com.hust.khanhkelvin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


// khởi tạo các giá trị JWTSuperSecretKey và thời gian sống của authorization String
@Configuration
@ConfigurationProperties(prefix = "security.authentication.jwt")
public class AuthenticationProperties {
    private String base64Secret;
    private Integer tokenValidityInSeconds;
    private Integer tokenValidityInSecondsForRememberMe;

    public String getBase64Secret() {
        return base64Secret;
    }

    public void setBase64Secret(String base64Secret) {
        this.base64Secret = base64Secret;
    }

    public Integer getTokenValidityInSeconds() {
        return tokenValidityInSeconds;
    }

    public void setTokenValidityInSeconds(Integer tokenValidityInSeconds) {
        this.tokenValidityInSeconds = tokenValidityInSeconds;
    }

    public Integer getTokenValidityInSecondsForRememberMe() {
        return tokenValidityInSecondsForRememberMe;
    }

    public void setTokenValidityInSecondsForRememberMe(Integer tokenValidityInSecondsForRememberMe) {
        this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
    }
}

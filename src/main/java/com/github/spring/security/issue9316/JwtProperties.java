package com.github.spring.security.issue9316;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties("jwt")
@Data
public class JwtProperties {
    private RSAPublicKey  publicKey;
    private RSAPrivateKey privateKey;
}

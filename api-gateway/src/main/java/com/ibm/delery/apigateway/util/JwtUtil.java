package com.ibm.delery.apigateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.security.Key;

//@Component
//public class JwtUtil {
//
//    @Autowired
//    Environment env;
//
//    private String secret;
//
//    public JwtUtil(Environment env) {
//        this.secret = env.getProperty("jwt.secret");
//        if (this.secret == null) {
//            throw new IllegalStateException("jwt.secret property not found in environment");
//        }
//    }
//
//    private String getSecret() {
//        return this.secret;
//    }
//
//    public void validateToken(final String token) {
//        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
//    }
//
//
//
//    private Key getSignKey() {
//        byte[] keyBytes = Decoders.BASE64.decode(secret);
//        return Keys.hmacShaKeyFor(keyBytes);
//
//    }
//
//}



import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.security.Key;

@Component
public class JwtUtil {

    private final String jwtSecret;

    public JwtUtil(@Value("${app.jwt-secret}") String jwtSecret) {
        this.jwtSecret = jwtSecret;
        if (this.jwtSecret == null) {
            throw new IllegalStateException("app.jwt-secret property not found in configuration");
        }
    }

    public String getJwtSecret() {
        return jwtSecret;
    }

    public void validateToken(final String token) {
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtSecret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
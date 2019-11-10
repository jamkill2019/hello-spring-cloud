package com.cxytiandi.spring_boot_starter_demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {
    private String name;
}

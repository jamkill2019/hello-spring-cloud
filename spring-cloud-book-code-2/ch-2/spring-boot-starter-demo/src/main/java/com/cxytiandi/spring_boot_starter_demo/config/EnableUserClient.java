package com.cxytiandi.spring_boot_starter_demo.config;

import org.springframework.boot.context.annotation.UserConfigurations;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 这段代码的核心是@Import({UserConfigurations.class})
 * 通过导入的方式实现把UserConfigurations.class加入到IOC容器中
 * 这样就可以开启自动配置了
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserConfigurations.class})
public @interface EnableUserClient {
}


package com.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {

}
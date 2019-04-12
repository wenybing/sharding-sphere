package com.example.shardingsphere.config;

import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import com.dangdang.ddframe.rdb.sharding.id.generator.self.CommonSelfIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wenyabing
 * @Date 2019/4/1 15:50
 */
@Configuration
public class KeyConfiguration {
    @Bean
    public IdGenerator idGenerator() {
        return new CommonSelfIdGenerator();
    }
}

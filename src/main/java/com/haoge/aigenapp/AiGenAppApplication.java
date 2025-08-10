package com.haoge.aigenapp;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.haoge.aigenapp.mapper")
public class AiGenAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiGenAppApplication.class, args);
    }

}

package com.assac453.vigener.config;

import com.assac453.vigener.file.FileKey;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileKeyConfig {

    @Value("${file.key}")
    private String key;

    @Bean
    public FileKey fileKey(){
        return new FileKey(key);
    }
}

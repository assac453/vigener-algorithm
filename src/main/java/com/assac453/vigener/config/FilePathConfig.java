package com.assac453.vigener.config;

import com.assac453.vigener.file.FilePath;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilePathConfig {

    @Value("${file.input.path}")
    private String inputFilePath;

    @Value("${file.encrypted.path}")
    private String encryptedFilePath;

    @Value("${file.decrypted.path}")
    private String decryptedFilePath;

    @Bean
    public FilePath filePath() {
        return new FilePath(inputFilePath, encryptedFilePath, decryptedFilePath);
    }
}

package com.assac453.vigener.config;

import com.assac453.vigener.algorithm.VigenerAlgorithm;
import com.assac453.vigener.algorithm.VigenerAlgorithmImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VigenerAlgorithmConfig {

    @Value("${vigener.bias}")
    private int bias;

    @Value("${vigener.letters}")
    private int letters;

    @Bean
    public VigenerAlgorithm vigenerAlgorithm(){
        return new VigenerAlgorithmImpl(bias, letters);
    }

}

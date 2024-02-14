package com.assac453.vigener.algorithm;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

public class VigenerAlgorithmTest {

    @Mock
    VigenerAlgorithm algorithm;
    @Test
    public void EncryptTestShouldReturnEncryptedString(){
        String toEncrypt = "loves cat";
        String key = "dog";
        when(this.algorithm.encrypt(toEncrypt, key)).thenReturn("ocbhg foz");

    }
}

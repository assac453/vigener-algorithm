package com.assac453.vigener.algorithm;

public interface VigenerAlgorithm{
    String decrypt(final String cypher, final String key);
    String encrypt(final String text, final String key);
}

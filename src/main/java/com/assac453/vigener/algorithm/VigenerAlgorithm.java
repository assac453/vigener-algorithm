package com.assac453.vigener.algorithm;
public class VigenerAlgorithm {
    final private int bias;
    final private int letters;
    public VigenerAlgorithm(int bias, int letters) {
        this.bias = bias;
        this.letters = letters;
    }

    public String encrypt(final String text, final String key){
        StringBuilder resultString = new StringBuilder();
        StringBuilder encrypt = new StringBuilder();
        for (String phrase: text.split(" ")) {
            final int keyLen = key.length();
            for (int i = 0, len = phrase.length(); i < len; i++) {
                encrypt.append((char) (((phrase.charAt(i) + key.charAt(i % keyLen) - 2 * this.bias) % this.letters) + this.bias));
            }
            resultString.append(encrypt.toString());
            resultString.append(" ");
            encrypt.setLength(0);
        }
        return resultString.toString();
    }

    public String decrypt(final String cipher, final String key) {
        StringBuilder resultString = new StringBuilder();
        StringBuilder decrypt = new StringBuilder();
        for (String phrase: cipher.split(" ")) {
            final int keyLen = key.length();
            for (int i = 0, len = phrase.length(); i < len; i++) {
                decrypt.append((char) (((phrase.charAt(i) - key.charAt(i % keyLen) + this.letters) % this.letters) + this.bias));
            }
            resultString.append(decrypt.toString());
            resultString.append(" ");
            decrypt.setLength(0);
        }
        return resultString.toString();
    }

}

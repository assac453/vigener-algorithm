package com.assac453.vigener.file.pathprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EncryptedFilePathProvider extends AbstractFilePathProvider{
    @Value("${file.encrypted.path}")
    private String encryptedFilePath;
    @Override
    public String getPath() {
        return encryptedFilePath;
    }
}

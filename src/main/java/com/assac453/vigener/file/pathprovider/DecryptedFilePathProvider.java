package com.assac453.vigener.file.pathprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DecryptedFilePathProvider extends AbstractFilePathProvider{

    @Value("${file.decrypted.path}")
    private String decryptedFilePath;
    @Override
    public String getPath() {
        return decryptedFilePath;
    }
}

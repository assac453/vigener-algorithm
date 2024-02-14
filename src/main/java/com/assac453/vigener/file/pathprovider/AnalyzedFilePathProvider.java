package com.assac453.vigener.file.pathprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnalyzedFilePathProvider extends AbstractFilePathProvider{

    @Value("${file.analyzed.path}")
    private String analyzedFilePath;

    @Override
    public String getPath() {
        return analyzedFilePath;
    }
}

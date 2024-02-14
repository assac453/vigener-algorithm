package com.assac453.vigener.file.pathprovider;

import com.assac453.vigener.file.pathprovider.AbstractFilePathProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InputFilePathProvider extends AbstractFilePathProvider {

    @Value("${file.input.path}")
    private String inputFilePath;
    @Override
    public String getPath() {
        return inputFilePath;
    }
}

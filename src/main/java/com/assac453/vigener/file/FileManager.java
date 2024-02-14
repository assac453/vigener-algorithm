package com.assac453.vigener.file;

import com.assac453.vigener.algorithm.FrequencyAnalysis;
import com.assac453.vigener.algorithm.VigenerAlgorithm;
import com.assac453.vigener.file.pathprovider.AnalyzedFilePathProvider;
import com.assac453.vigener.file.pathprovider.DecryptedFilePathProvider;
import com.assac453.vigener.file.pathprovider.EncryptedFilePathProvider;
import com.assac453.vigener.file.pathprovider.InputFilePathProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileManager {

    private final VigenerAlgorithm vigenerAlgorithm;
    private final FileWork fileWork;
    private final FileKey fileKey;


    private final AnalyzedFilePathProvider analyzedFilePath;
    private final EncryptedFilePathProvider encryptedFilePath;
    private final DecryptedFilePathProvider decryptedFilePath;
    private final InputFilePathProvider inputFilePath;

    public void encrypt() {
        String readFile = fileWork.readFile(inputFilePath.getPath());
        String encrypted = vigenerAlgorithm.encrypt(readFile, fileKey.key());
        fileWork.saveFile(encrypted, encryptedFilePath.getPath());
    }

    public void decrypt() {
        String readFile = fileWork.readFile(encryptedFilePath.getPath());
        String decrypted = vigenerAlgorithm.decrypt(readFile, fileKey.key());
        fileWork.saveFile(decrypted, decryptedFilePath.getPath());
    }

    public void analyze(){
        String readFile = fileWork.readFile(encryptedFilePath.getPath());
        FrequencyAnalysis analysis = new FrequencyAnalysis(readFile);
        String analyzed = analysis.analyze();
        fileWork.saveFile(analyzed, analyzedFilePath.getPath());
    }

}

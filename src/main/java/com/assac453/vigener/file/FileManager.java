package com.assac453.vigener.file;

import com.assac453.vigener.algorithm.VigenerAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileManager {

    private final VigenerAlgorithm vigenerAlgorithm;
    private final FileWork fileWork;
    private final FilePath filePath;
    private final FileKey fileKey;

    public void encrypt() {
        String readFile = fileWork.readFile(filePath.inputFilePath());
        String encrypted = vigenerAlgorithm.encrypt(readFile, fileKey.key());
        fileWork.saveFile(encrypted, filePath.encryptedFilePath());
    }

    public void decrypt() {
        String readFile = fileWork.readFile(filePath.encryptedFilePath());
        String decrypted = vigenerAlgorithm.decrypt(readFile, fileKey.key());
        fileWork.saveFile(decrypted, filePath.decryptedFilePath());
    }

}

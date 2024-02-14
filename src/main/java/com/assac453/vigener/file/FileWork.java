package com.assac453.vigener.file;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Scanner;

@Component
public class FileWork {
    public void saveFile(String file, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))) {
            writer.write(file);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public String readFile(String filename)  {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine())!=null){
                builder.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}

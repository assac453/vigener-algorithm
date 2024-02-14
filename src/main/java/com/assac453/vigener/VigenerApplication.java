package com.assac453.vigener;

import com.assac453.vigener.file.FileManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class VigenerApplication implements CommandLineRunner {

	private final FileManager fileManager;
	public static void main(String[] args) {
		SpringApplication.run(VigenerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		fileManager.encrypt();
		fileManager.decrypt();
	}
}

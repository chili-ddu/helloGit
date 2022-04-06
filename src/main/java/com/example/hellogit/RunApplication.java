package com.example.hellogit;

import com.example.hellogit.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Slf4j
public class RunApplication {

	private final static String filePath = "src/main/resources/database/database.csv";

	public static void main(String[] args) {
//		SpringApplication.run(RunApplication.class, args);

		FileService fileService = new FileService(filePath);

		fileService.writeLine("abcd");

		List<String> file = fileService.readLine();

		log.info(file.toString());

	}

}

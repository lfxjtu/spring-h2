package dev.lfxjtu.h2demo;

import dev.lfxjtu.h2demo.model.Book;
import dev.lfxjtu.h2demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DemoApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return args -> bookRepository.save(new Book(null, "Spring Boot: Up and Running", 999, "Mark L"));
    }

}

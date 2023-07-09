package dev.lfxjtu.h2demo.repository;

import dev.lfxjtu.h2demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}

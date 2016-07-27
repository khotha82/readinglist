package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by krishna_hotha on 7/27/16.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}

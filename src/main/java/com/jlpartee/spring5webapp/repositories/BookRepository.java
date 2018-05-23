package com.jlpartee.spring5webapp.repositories;

import com.jlpartee.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jpartee on 5/23/18.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

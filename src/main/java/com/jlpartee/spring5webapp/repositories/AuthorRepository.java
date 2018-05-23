package com.jlpartee.spring5webapp.repositories;

import com.jlpartee.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jpartee on 5/23/18.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}



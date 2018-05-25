package com.jlpartee.spring5webapp.bootstrap;

import com.jlpartee.spring5webapp.model.Author;
import com.jlpartee.spring5webapp.model.Book;
import com.jlpartee.spring5webapp.model.Publisher;
import com.jlpartee.spring5webapp.repositories.AuthorRepository;
import com.jlpartee.spring5webapp.repositories.BookRepository;
import com.jlpartee.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jpartee on 5/23/18.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher pubOne = new Publisher();
        pubOne.setName("Glenview Publishing Co.");
        pubOne.setAddress1("2500 Lehigh Ave");
        pubOne.setAddress2("Corp Office");
        pubOne.setCity("Glenview");
        pubOne.setState("IL");
        pubOne.setZipcode(60026);
        publisherRepository.save(pubOne);

        Publisher pubTwo = new Publisher();
        pubTwo.setName("Backwaters Book Co.");
        pubTwo.setAddress1("12944 S Commercial Ave");
        pubTwo.setAddress2("publishing div");
        pubTwo.setCity("Hegewisch");
        pubTwo.setState("IL");
        pubTwo.setZipcode(60633);
        publisherRepository.save(pubTwo);

        // Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", pubOne);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", pubTwo);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}

package dh.meli.relationships.repository.service;

import dh.meli.relationships.model.Author;
import dh.meli.relationships.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    @Transactional
    public Author save(Author author) {
        author.getAddress().setAuthor(author);
        return authorRepo.save(author);

    }
}

package dh.meli.relationships.controller;

import dh.meli.relationships.model.Subject;
import dh.meli.relationships.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subeject")
public class SubjectController {

    @Autowired
    public SubjectRepo repo;

    @RequestMapping("/{id}")
    public ResponseEntity<Subject> getByid(@PathVariable long id) {
        return ResponseEntity.ok(repo.findById(id).get());
    }

}

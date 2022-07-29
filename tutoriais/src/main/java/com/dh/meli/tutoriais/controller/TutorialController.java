package com.dh.meli.tutoriais.controller;

import com.dh.meli.tutoriais.dto.TutorialDto;
import com.dh.meli.tutoriais.dto.TutorialFoundDto;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.repository.TutorialRepo;
import com.dh.meli.tutoriais.service.TutorialService;
import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    TutorialService service;

    @PostMapping
    public ResponseEntity<Tutorial> saveNewTutorial(@RequestBody Tutorial newTutorial) {
        return ResponseEntity.ok(service.saveTutorial(newTutorial));
    }

    @GetMapping
    public ResponseEntity<List<Tutorial>> getAllTutorial() {
        return ResponseEntity.ok(service.getAllTutorial());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable long id) {
        return ResponseEntity.ok(service.getTutorialById(id));
    }

    @GetMapping("/published")
    public ResponseEntity<TutorialFoundDto> getByPublished(
            @RequestParam boolean publish) {
        return ResponseEntity.ok(service.getTutorialByPublished(publish));
    }

    @GetMapping("/title")
    public ResponseEntity<List<TutorialDto>> getTutorialByTitle(@RequestParam String title) {
        return ResponseEntity.ok(service.getTutorialByTitle(title));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> updateTutorial(
            @PathVariable long id,
            @RequestBody Tutorial updateTutorial
    ) {
        return ResponseEntity.ok(service.updateTutorial(id, updateTutorial));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTutorial(@PathVariable long id) {
        service.deleteTutorialById(id);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllData() {
        return ResponseEntity.ok(service.deleteAllTutorial());
    }

}

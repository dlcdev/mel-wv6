package com.dh.meli.tutoriais.service;


import com.dh.meli.tutoriais.dto.TutorialDto;
import com.dh.meli.tutoriais.dto.TutorialFoundDto;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.repository.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorialService implements ITutorialService {

    @Autowired
    TutorialRepo repo;

    @Override
    public Tutorial saveTutorial(Tutorial newTutorial) {
        return repo.save(newTutorial);
    }

    @Override
    public List<Tutorial> getAllTutorial() {
        return (List<Tutorial>) repo.findAll();
    }

    @Override
    public Tutorial getTutorialById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public TutorialFoundDto getTutorialByPublished(boolean published) {


        List<TutorialDto> tutorialList = repo.findTutorialByPublished(published)
                .stream()
                .map(t -> TutorialDto
                        .builder()
                        .title(t.getTitle())
                        .description(t.getDescription())
                        .build())
                .collect(Collectors.toList());
        return new TutorialFoundDto(tutorialList, tutorialList.size());

//        return tutorialList.stream()
//                .map(TutorialDto::new)
//                .collect(Collectors.toList());
    }

    @Override
    public List<TutorialDto> getTutorialByTitle(String title) {
        List<TutorialDto> tutorialDtoList =  repo.findTutorialByTitle(title)
                .stream()
                .map(t -> TutorialDto
                        .builder()
                        .title(t.getTitle())
                        .description(t.getDescription())
                        .build()
                )
                .collect(Collectors.toList());
        System.out.println(tutorialDtoList);

        return tutorialDtoList;
    }

    @Override
    public Tutorial updateTutorial(long id, Tutorial updateTutorial) {
        Tutorial foundTutorial = getTutorialById(id);
        foundTutorial = updateTutorial;

        return repo.save(foundTutorial);
    }

    @Override
    public void deleteTutorialById(long id) {
        repo.deleteById(id);
    }

    @Override
    public String deleteAllTutorial() {
        repo.deleteAll();
        return "All data deleted!";
    }

}

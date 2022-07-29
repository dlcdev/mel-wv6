package com.dh.meli.tutoriais.service;

import com.dh.meli.tutoriais.dto.TutorialDto;
import com.dh.meli.tutoriais.dto.TutorialFoundDto;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.repository.TutorialRepo;

import java.util.List;

public interface ITutorialService {

    Tutorial saveTutorial(Tutorial newTutorial);

    List<Tutorial> getAllTutorial();

    Tutorial getTutorialById(long id);

    TutorialFoundDto getTutorialByPublished(boolean published);

    List<TutorialDto> getTutorialByTitle(String title);

    Tutorial updateTutorial(long id, Tutorial updateTutorial);

    void deleteTutorialById(long id);

    String deleteAllTutorial();



}

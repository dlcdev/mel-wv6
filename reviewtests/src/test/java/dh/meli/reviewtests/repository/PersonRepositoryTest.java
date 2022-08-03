package dh.meli.reviewtests.repository;

import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.util.GeneratePerson;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    // Given-when-then

    @Test
    public void save_returnSavedPerson_WhenValidPerson() {
        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = repository.save(person);

        assertThat(personSaved.getName()).isEqualTo(person.getName());

    }







}

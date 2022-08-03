package dh.meli.reviewtests.integration;

import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.repository.PersonRepository;
import dh.meli.reviewtests.util.GeneratePerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PersonRepositoryITTest {

    @Autowired
    private PersonRepository repository;

    @Test
    public void save_returnSavedPerson_WhenValidPerson() {
        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = repository.save(person);

        assertThat(personSaved.getName()).isEqualTo(person.getName());
    }

}
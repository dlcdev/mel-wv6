package dh.meli.reviewtests.service;

import dh.meli.reviewtests.exception.InvalidPersonParam;
import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.repository.PersonRepository;
import dh.meli.reviewtests.util.GeneratePerson;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Test
    public void save_savePerson_whenValidPerson() {
        BDDMockito.when(personRepository.save(ArgumentMatchers.any(Person.class)))
                .thenReturn(GeneratePerson.validPerson1());

        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = personService.save(person); // ação

        assertThat(personSaved).isNotNull();
        assertThat(personSaved.getId()).isPositive();
        assertThat(personSaved.getName()).isEqualTo(person.getName());
        verify(personRepository, Mockito.times(1)).save(person);
    }

    @Test
    public void save_throwException_whenPersonHasId() {
        Person person = GeneratePerson.validPerson1();

        assertThrows(InvalidPersonParam.class, () -> {
            personService.save(person);
        });

        verify(personRepository, Mockito.never()).save(person);
    }

    @Test
    public void getAllPerson() {

        List<Person> persons = List.of(
                GeneratePerson.newPerson1ToSave(),
                GeneratePerson.newPerson2ToSave()
        );

        BDDMockito.when(personRepository.findAll()).thenReturn(persons);
        List<Person> response = personService.getAll();
        System.out.println(response);
        assertThat(response).isNotNull();
        assertThat(response.size()).isEqualTo(2);
        verify(personRepository, Mockito.times(1)).findAll();


    }

    @Test
    public void getPersonById_When_IdIsValid() {
        BDDMockito.when(personRepository.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.ofNullable(GeneratePerson.validPerson1()));

        Person person = GeneratePerson.validPerson1();
        Optional<Person> response = personService.getById(person.getId());

        assertThat(response).isNotNull();
        assertThat(response.get().getId()).isEqualTo(person.getId());

    }

}


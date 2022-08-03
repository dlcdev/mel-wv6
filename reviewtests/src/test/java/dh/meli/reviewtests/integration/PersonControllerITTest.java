package dh.meli.reviewtests.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.repository.PersonRepository;
import dh.meli.reviewtests.util.GeneratePerson;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PersonControllerITTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setup() {
        personRepository.deleteAll();
    }

    @Test
    public void create_insertNewPerson_whenNewPerson() throws Exception {
        Person person = GeneratePerson.newPerson1ToSave();

        ResultActions response =  mockMvc.perform(post("/person")
                .content(objectMapper.writeValueAsString(person))
                .contentType(MediaType.APPLICATION_JSON)
        );

        response.andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", CoreMatchers.is(person.getName())));
    }

}
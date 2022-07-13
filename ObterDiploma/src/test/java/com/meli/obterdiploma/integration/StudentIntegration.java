package com.meli.obterdiploma.integration;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.repository.StudentDAO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class StudentIntegration {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    @BeforeEach
    public void setup(){
        TestUtilsGenerator.emptyUsersFile();
    }

    @Test
    public void registerStudent_saveStudent_whenNewStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        String baseUrl = "http://localhost:" + port + "/student";
        HttpEntity<StudentDTO> httpEntity = new HttpEntity<>(newStudent);

        //exchange(URL, metodo http, body, tipo de objeto)
        ResponseEntity<StudentDTO> retorno = testRestTemplate.exchange(
                baseUrl + "/registerStudent",
                HttpMethod.POST,
                httpEntity,
                StudentDTO.class
        );

        StudentDTO studentReturned = retorno.getBody();

        assertThat(retorno.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(studentReturned).isNotNull();
        assertThat(studentReturned.getId()).isPositive();
        assertThat(studentReturned.getStudentName()).isEqualTo(newStudent.getStudentName());

    }

    @Test
    public void registerStudent_returnBadRequest_whenStudentHasId() {
        StudentDTO newStudent = TestUtilsGenerator.getStudentWithId();
        String baseUrl = "http://localhost:" + port + "/student";
        HttpEntity<StudentDTO> httpEntity = new HttpEntity<>(newStudent);

        //exchange(URL, metodo http, body, tipo de objeto)
        ResponseEntity<StudentDTO> retorno = testRestTemplate.exchange(
                baseUrl + "/registerStudent",
                HttpMethod.POST,
                httpEntity,
                StudentDTO.class
        );

        assertThat(retorno.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);

    }

    @Test
    public void getStudent_returnStatusNotFound_whenStudentNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();
        String baseUrl = "http://localhost:" + port + "/student/" + student.getId();

        //exchange(URL, metodo http, body, tipo de objeto enviado)
        ResponseEntity<StudentDTO> retorno = testRestTemplate.exchange(
                baseUrl + "/registerStudent",
                HttpMethod.GET,
                null,
                StudentDTO.class
        );

        assertThat(retorno.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);

    }

    @Test
    public void getStudent_returnStatus_whenStudentExist() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        String baseUrl = "http://localhost:" + port + "/student/getStudent/";
        StudentDAO dao = new StudentDAO();
        StudentDTO studentSave = dao.save(newStudent);

        String url = String.format(baseUrl + "%d", studentSave.getId());
        log.info(url);

        //exchange(URL, metodo http, body, tipo de objeto enviado)
        ResponseEntity<StudentDTO> retorno = testRestTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                StudentDTO.class
        );

        assertThat(retorno.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(retorno.getBody().getId()).isEqualTo(studentSave.getId());
        assertThat(retorno.getBody().getStudentName()).isEqualTo(studentSave.getStudentName());
    }

    @Test
    public void modifyStudent_returnStatusNoContent_whenStudentExist() {
        String baseUrl = "http://localhost:" + port + "/student/modifyStudent/";

        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDAO dao = new StudentDAO();
        StudentDTO studentSave = dao.save(newStudent);

        studentSave.setStudentName("New name");

        HttpEntity<StudentDTO> httpEntity = new HttpEntity<>(studentSave);


        log.info(baseUrl);

        //exchange(URL, metodo http, body, tipo de objeto enviado)
        ResponseEntity<Void> retorno = testRestTemplate.exchange(
                baseUrl,
                HttpMethod.PUT,
                httpEntity,
                Void.class
        );

        assertThat(retorno.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
        StudentDTO studentFound = dao.findById(studentSave.getId());

        assertThat(studentFound.getStudentName()).isEqualTo(studentSave.getStudentName());
    }


}

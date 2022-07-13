package com.meli.obterdiploma.controller;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.service.IStudentService;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@SpringBootTest
//@MockitoSettings(strictness = )
class StudentControllerTest {

    @InjectMocks
    StudentController studentController;

    @Mock
    IStudentService studentService;

    @BeforeEach @AfterEach
    void setup(){
        BDDMockito.when(studentService.create(ArgumentMatchers.any(StudentDTO.class)))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

        BDDMockito.when(studentService.read(ArgumentMatchers.anyLong()))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

        BDDMockito.doNothing().when(studentService).delete(ArgumentMatchers.anyLong());
        
    }

    @Test
    void registerStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        ResponseEntity<StudentDTO> response = studentController.registerStudent(newStudent);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
//        assertThat()
        verify(studentService, atLeastOnce()).create(newStudent);

    }

    @Test
    void getStudent() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();
        ResponseEntity<StudentDTO> response = studentController.getStudent(studentDTO.getId());

        verify(studentService, atLeastOnce());
        assertThat(response.getBody().getId()).isEqualTo(studentDTO.getId());
    }

    @Test
    void modifyStudent() {
    }

    @Test
    void removeStudent() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();
        ResponseEntity<Void> response = studentController.removeStudent(studentDTO.getId());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
        

    }

    @Test
    void listStudents() {
    }
}
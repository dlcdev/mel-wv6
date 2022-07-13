package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.repository.StudentDAO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class StudentServiceTest {

    @InjectMocks
    StudentService service;

    @Mock
    StudentDAO studentDAO;

    @BeforeEach
    public void setup(){
        BDDMockito.when(studentDAO.save(ArgumentMatchers.any(StudentDTO.class)))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

                BDDMockito.when(studentDAO.findById(ArgumentMatchers.anyLong()))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

        BDDMockito.doNothing().when(studentDAO).delete(ArgumentMatchers.anyLong());


    }

    @Test
    void create_returnStudent_whenNewStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = service.create(newStudent);

        assertThat(savedStudent.getId()).isPositive();
        assertThat(savedStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
        verify(studentDAO, atLeastOnce()).save(newStudent);

    }

    @Test
    void read_returnStudent_whenStudentExist() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();
        StudentDTO studentFound = service.read(studentDTO.getId());

        assertThat(studentFound.getId()).isEqualTo(studentDTO.getId());
        assertThat(studentFound.getStudentName()).isEqualTo(studentDTO.getStudentName());
        verify(studentDAO, atLeastOnce()).findById(studentDTO.getId());

    }

    @Test
    void delete_deleteStudent_whenStudentExist() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();
        service.delete(studentDTO.getId());

        assertThatCode(() -> {
            service.delete(studentDTO.getId());
        }).doesNotThrowAnyException();

        verify(studentDAO, atLeastOnce()).delete(studentDTO.getId());
    }

    @Test
    void update_() {
        StudentDTO studentOldName = TestUtilsGenerator.getStudentWithId();
        StudentDTO updatedStudent = TestUtilsGenerator.getStudentWithId();
        updatedStudent.setStudentName("New Name");
        service.update(updatedStudent);

        assertThat(updatedStudent).isNotNull();
        assertThat(updatedStudent.getId()).isEqualTo(updatedStudent.getId());
        assertThat(updatedStudent.getStudentName()).isEqualTo(updatedStudent.getStudentName());
        assertThat(updatedStudent.getId()).isEqualTo(studentOldName.getId());
        assertThat(updatedStudent.getStudentName()).isNotEqualTo(studentOldName.getStudentName());
        verify(studentDAO, atLeastOnce()).save(updatedStudent);
    }

//    @Test
//    void getAll() {
//        StudentDTO studentDTO = TestUtilsGenerator.getNewStudentWithOneSubject();
//        StudentDTO studentFound = (StudentDTO) service.getAll();
//
//        assertThat(studentFound.getClass()).isEqualTo(studentDTO.getClass());
//
//    }
}
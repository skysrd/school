package Skysrd.school.repository;

import Skysrd.school.domain.Student;
import lombok.Builder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    Student findById(Long id);
    Student findByPhoneNumber (String phoneNumber);
    List<Student> findAll();

}

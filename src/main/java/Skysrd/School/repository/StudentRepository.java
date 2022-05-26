package Skysrd.School.repository;

import Skysrd.School.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {

    Optional<Student> findById(Long id);
    Optional<Student> findByPhoneNumber (String phoneNumber);
    List<Student> findAll();

}

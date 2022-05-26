package Skysrd.school.repository;

import Skysrd.school.domain.Student;
import lombok.Builder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {

    Optional<Student> findById(Long id);
    Optional<Student> findByPhoneNumber (String phoneNumber);
    List<Student> findAll();

}

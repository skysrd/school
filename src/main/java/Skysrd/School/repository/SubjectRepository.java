package Skysrd.School.repository;

import Skysrd.School.domain.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository {

    Optional<Subject> findById(Long id);
    List<Subject> findAll();
}

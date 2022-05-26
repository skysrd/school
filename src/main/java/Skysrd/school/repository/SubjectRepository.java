package Skysrd.school.repository;

import Skysrd.school.domain.Subject;
import jdk.internal.loader.AbstractClassLoaderValue;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface SubjectRepository {

    Optional<Subject> findById(Long id);
    List<Subject> findAll();
}

package Skysrd.school.controller;

import Skysrd.school.domain.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SubjectController {

    @PostMapping("/subjects")

    @GetMapping("/subjects")

    @DeleteMapping("/subjects/{subjectId}")
}

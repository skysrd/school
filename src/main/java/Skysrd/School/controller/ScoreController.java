package Skysrd.School.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ScoreController {

    @PostMapping("/students/{studentId}/subjects/{subjectId}/scores")

    @PutMapping("/students/{studentId}/subjects/{subjectId}/scores")

    @DeleteMapping("/students/{studentId}/subjects/{subjectId}/scores")

    @GetMapping("/students/{studentId}/average-score")

    @GetMapping("/subjects/{subjectId}/average-score")

}

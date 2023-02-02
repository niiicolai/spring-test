package dat3.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dat3.demo.entity.Test;
import dat3.demo.repository.TestRepository;

@RestController
public class TestController {
    
    private TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/")
    public List<Test> home() {
        return testRepository.findAll();
    }
}

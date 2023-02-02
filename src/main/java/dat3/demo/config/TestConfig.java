package dat3.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import dat3.demo.entity.Test;
import dat3.demo.repository.TestRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    private TestRepository testRepository;

    public TestConfig(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        testRepository.save(new Test("Hello World"));
        testRepository.save(new Test("Hello World"));
        testRepository.save(new Test("Hello World"));
        testRepository.save(new Test("Hello World"));        
    }
}

package edu.polytech.ch6_tp3;

import edu.polytech.ch6_tp3.entity.User;
import edu.polytech.ch6_tp3.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch6Tp3Application {

    private static final Logger log = LoggerFactory.getLogger(Ch6Tp3Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ch6Tp3Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(UserRepository userRepository) throws Exception {
//        return args -> {
//            userRepository.save(new User(1, "Chloe", "michelle@example.com"));
//            userRepository.save(new User(2, "Kim", "michelle@example.com"));
//            userRepository.save(new User(3, "David", "michelle@example.com"));
//            userRepository.save(new User(4, "Michelle", "michelle@example.com"));
//
//            userRepository.findAll().forEach(user -> log.info(String.valueOf(user)));
//        };
//    }
}

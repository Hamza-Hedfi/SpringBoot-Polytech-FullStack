package edu.polytech.ch6_tp3;

import edu.polytech.ch6_tp3.entity.Groupe;
import edu.polytech.ch6_tp3.entity.Log;
import edu.polytech.ch6_tp3.entity.User;
import edu.polytech.ch6_tp3.repository.GroupRepository;
import edu.polytech.ch6_tp3.repository.LogRepository;
import edu.polytech.ch6_tp3.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class Ch6Tp3Application {

    private static final Logger log = LoggerFactory.getLogger(Ch6Tp3Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ch6Tp3Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository, LogRepository logRepository, GroupRepository groupRepository) throws Exception {
        return args -> {
//            User usr1 = new User("Hamza Hadfi", "01101000.hedfi@gmail.com");
//            ArrayList<User> users = new ArrayList<>();
//            Groupe grp = new Groupe("Grp1", 7);
//            Log log = new Log(new Date(), "Nothing", usr1);
//
//            usr1.getGroups().add(grp);
//            usr1.getLogs().add(log);
//
//            userRepository.save(usr1);
//            logRepository.save(log);
//            groupRepository.save(grp);

            User userById = userRepository.findById(11).get();
            System.out.println(userById);

        };
    }
}

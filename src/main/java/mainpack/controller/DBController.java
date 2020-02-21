package mainpack.controller;

import mainpack.model.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static tools.Tool.out;

@SpringBootApplication
@EnableJpaRepositories
public class DBController {
    @Autowired
    private UsersRepository usersRepository;

    public static void main(String[] args) {
        SpringApplication.run(DBController.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void test() {
        out("DBController", "Start");
        System.out.println(123);
    }
}

package net.zerhouani.jpafsm;

import net.zerhouani.jpafsm.entities.Role;
import net.zerhouani.jpafsm.entities.User;
import net.zerhouani.jpafsm.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JpaFsmApplication {

    public static void main(String[] args) {

        SpringApplication.run(JpaFsmApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserService userService) {
        return args -> {
            User user = new User();
            user.setUsername("user1");
            user.setPassword("123");
            userService.addNewUser(user);

            User user2 = new User();
            user2.setUsername("admin");
            user2.setPassword("123");
            userService.addNewUser(user2);

            Stream.of("STUDENT", "USER", "ADMIN").forEach(r -> {
                Role role1 = new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);
            });


            userService.addRoleToUser("user1", "STUDENT");
            userService.addRoleToUser("user1", "USER");
            userService.addRoleToUser("admin", "USER");
            userService.addRoleToUser("admin", "ADMIN");


            try{
                User user1= userService.authenticate("user12", "123");
                System.out.println(user1.getUserId());
                System.out.println(user1.getUsername());
                System.out.println("Roles =>");
                user1.getRoles().forEach(role -> {
                    System.out.println("Role =>"+role.toString() );
                });
            }catch (Exception e){
                e.printStackTrace();
            }
        };
    }

}

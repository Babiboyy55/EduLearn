package com.edutrack.config;

import com.edutrack.entity.Course;
import com.edutrack.entity.Lecture;
import com.edutrack.entity.Module;
import com.edutrack.entity.User;
import com.edutrack.repository.CourseRepository;
import com.edutrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        String encodedPassword = passwordEncoder.encode("password123");

        User admin = userRepository.findByEmail("admin@edutrack.com").orElseGet(() ->
            userRepository.save(User.builder()
                .name("Admin User")
                .email("admin@edutrack.com")
                .password(encodedPassword)
                .role(User.Role.ADMIN)
                .active(true)
                .build())
        );

        User instructor = userRepository.findByEmail("instructor@edutrack.com").orElseGet(() ->
            userRepository.save(User.builder()
                .name("Dr. Jane Doe")
                .email("instructor@edutrack.com")
                .password(encodedPassword)
                .role(User.Role.INSTRUCTOR)
                .active(true)
                .build())
        );

        User student1 = userRepository.findByEmail("student@edutrack.com").orElseGet(() ->
            userRepository.save(User.builder()
                .name("Alice Smith")
                .email("student@edutrack.com")
                .password(encodedPassword)
                .role(User.Role.STUDENT)
                .active(true)
                .build())
        );

        User student2 = userRepository.findByEmail("bob@edutrack.com").orElseGet(() ->
            userRepository.save(User.builder()
                .name("Bob Johnson")
                .email("bob@edutrack.com")
                .password(encodedPassword)
                .role(User.Role.STUDENT)
                .active(true)
                .build())
        );

        System.out.println(">>> Demo Users Verified/Seeded in PostgreSQL <<<");

        if (courseRepository.count() == 0) {
            Course course1 = Course.builder()
                    .title("Introduction to React & Tailwind CSS")
                    .description("Learn how to build beautiful, modern, and responsive user interfaces using React and Tailwind CSS.")
                    .instructorId(instructor.getId())
                    .instructorName(instructor.getName())
                    .category("Web Development")
                    .price(99.99)
                    .thumbnail("https://images.unsplash.com/photo-1633356122544-f134324a6cee?w=500&auto=format&fit=crop&q=60")
                    .status("APPROVED")
                    .build();

            Module mod1 = Module.builder()
                    .title("Module 1: Getting Started with React")
                    .orderIndex(1)
                    .course(course1)
                    .build();

            Lecture lec1 = Lecture.builder()
                    .title("1.1 Introduction to the Course")
                    .contentUrl("https://www.youtube.com/embed/dQw4w9WgXcQ")
                    .type("VIDEO")
                    .module(mod1)
                    .build();

            Lecture lec2 = Lecture.builder()
                    .title("1.2 Setting Up Your Environment")
                    .contentUrl("Open terminal and bootstrap with Vite.")
                    .type("TEXT")
                    .module(mod1)
                    .build();

            mod1.setLectures(List.of(lec1, lec2));
            course1.setModules(List.of(mod1));

            Course course2 = Course.builder()
                    .title("Advanced Java Programming & Spring Boot")
                    .description("Deep dive into Java 21 features, Spring Framework 6, JPA/Hibernate, Spring Security with JWT tokens.")
                    .instructorId(instructor.getId())
                    .instructorName(instructor.getName())
                    .category("Backend Development")
                    .price(149.99)
                    .thumbnail("https://images.unsplash.com/photo-1555066931-4365d14bab8c?w=500&auto=format&fit=crop&q=60")
                    .status("APPROVED")
                    .build();

            courseRepository.saveAll(List.of(course1, course2));
            System.out.println(">>> Sample Courses Seeded Successfully into PostgreSQL <<<");
        }
    }
}

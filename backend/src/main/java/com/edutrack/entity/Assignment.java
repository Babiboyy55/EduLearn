package com.edutrack.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(length = 20)
    private String type; // ASSIGNMENT, QUIZ

    public Assignment() {
    }

    public Assignment(Long id, Long courseId, String title, String description, LocalDate dueDate, String type) {
        this.id = id;
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static AssignmentBuilder builder() {
        return new AssignmentBuilder();
    }

    public static class AssignmentBuilder {
        private Long id;
        private Long courseId;
        private String title;
        private String description;
        private LocalDate dueDate;
        private String type;

        AssignmentBuilder() {
        }

        public AssignmentBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AssignmentBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public AssignmentBuilder title(String title) {
            this.title = title;
            return this;
        }

        public AssignmentBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AssignmentBuilder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public AssignmentBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Assignment build() {
            return new Assignment(id, courseId, title, description, dueDate, type);
        }
    }
}

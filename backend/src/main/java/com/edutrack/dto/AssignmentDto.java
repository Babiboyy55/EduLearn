package com.edutrack.dto;

import java.time.LocalDate;

public class AssignmentDto {
    private Long id;
    private Long courseId;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String type; // ASSIGNMENT, QUIZ

    public AssignmentDto() {
    }

    public AssignmentDto(Long id, Long courseId, String title, String description, LocalDate dueDate, String type) {
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

    public static AssignmentDtoBuilder builder() {
        return new AssignmentDtoBuilder();
    }

    public static class AssignmentDtoBuilder {
        private Long id;
        private Long courseId;
        private String title;
        private String description;
        private LocalDate dueDate;
        private String type;

        AssignmentDtoBuilder() {
        }

        public AssignmentDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AssignmentDtoBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public AssignmentDtoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public AssignmentDtoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AssignmentDtoBuilder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public AssignmentDtoBuilder type(String type) {
            this.type = type;
            return this;
        }

        public AssignmentDto build() {
            return new AssignmentDto(id, courseId, title, description, dueDate, type);
        }
    }
}

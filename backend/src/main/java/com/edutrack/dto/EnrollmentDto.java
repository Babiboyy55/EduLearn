package com.edutrack.dto;

import java.time.LocalDate;
import java.util.List;

public class EnrollmentDto {
    private Long id;
    private Long studentId;
    private Long courseId;
    private Integer progress;
    private LocalDate enrolledDate;
    private List<Long> completedLectures;
    private CourseDto course; // Enriched course details if needed
    private String studentName;
    private String studentEmail;

    public EnrollmentDto() {
    }

    public EnrollmentDto(Long id, Long studentId, Long courseId, Integer progress, LocalDate enrolledDate, List<Long> completedLectures, CourseDto course, String studentName, String studentEmail) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.progress = progress;
        this.enrolledDate = enrolledDate;
        this.completedLectures = completedLectures;
        this.course = course;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(LocalDate enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public List<Long> getCompletedLectures() {
        return completedLectures;
    }

    public void setCompletedLectures(List<Long> completedLectures) {
        this.completedLectures = completedLectures;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public static EnrollmentDtoBuilder builder() {
        return new EnrollmentDtoBuilder();
    }

    public static class EnrollmentDtoBuilder {
        private Long id;
        private Long studentId;
        private Long courseId;
        private Integer progress;
        private LocalDate enrolledDate;
        private List<Long> completedLectures;
        private CourseDto course;
        private String studentName;
        private String studentEmail;

        EnrollmentDtoBuilder() {
        }

        public EnrollmentDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EnrollmentDtoBuilder studentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }

        public EnrollmentDtoBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public EnrollmentDtoBuilder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        public EnrollmentDtoBuilder enrolledDate(LocalDate enrolledDate) {
            this.enrolledDate = enrolledDate;
            return this;
        }

        public EnrollmentDtoBuilder completedLectures(List<Long> completedLectures) {
            this.completedLectures = completedLectures;
            return this;
        }

        public EnrollmentDtoBuilder course(CourseDto course) {
            this.course = course;
            return this;
        }

        public EnrollmentDtoBuilder studentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public EnrollmentDtoBuilder studentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }

        public EnrollmentDto build() {
            return new EnrollmentDto(id, studentId, courseId, progress, enrolledDate, completedLectures, course, studentName, studentEmail);
        }
    }
}

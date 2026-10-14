package com.edutrack.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(nullable = false)
    private Integer progress = 0; // % completed

    @Column(name = "enrolled_date")
    private LocalDate enrolledDate;

    @ElementCollection
    @CollectionTable(name = "completed_lectures", joinColumns = @JoinColumn(name = "enrollment_id"))
    @Column(name = "lecture_id")
    private List<Long> completedLectures = new ArrayList<>();

    public Enrollment() {
    }

    public Enrollment(Long id, Long studentId, Long courseId, Integer progress, LocalDate enrolledDate, List<Long> completedLectures) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.progress = progress != null ? progress : 0;
        this.enrolledDate = enrolledDate;
        this.completedLectures = completedLectures != null ? completedLectures : new ArrayList<>();
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

    public static EnrollmentBuilder builder() {
        return new EnrollmentBuilder();
    }

    public static class EnrollmentBuilder {
        private Long id;
        private Long studentId;
        private Long courseId;
        private Integer progress = 0;
        private LocalDate enrolledDate;
        private List<Long> completedLectures = new ArrayList<>();

        EnrollmentBuilder() {
        }

        public EnrollmentBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EnrollmentBuilder studentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }

        public EnrollmentBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public EnrollmentBuilder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        public EnrollmentBuilder enrolledDate(LocalDate enrolledDate) {
            this.enrolledDate = enrolledDate;
            return this;
        }

        public EnrollmentBuilder completedLectures(List<Long> completedLectures) {
            this.completedLectures = completedLectures;
            return this;
        }

        public Enrollment build() {
            return new Enrollment(id, studentId, courseId, progress, enrolledDate, completedLectures);
        }
    }
}

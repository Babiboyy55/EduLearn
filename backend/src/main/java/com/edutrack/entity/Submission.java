package com.edutrack.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "submissions")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "assignment_id", nullable = false)
    private Long assignmentId;

    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @Column(name = "file_url", length = 2048)
    private String fileUrl; // file path, GitHub URL, or quiz answer text

    private String grade;

    @Column(length = 20, nullable = false)
    private String status = "PENDING"; // PENDING, GRADED

    @Column(name = "submission_date")
    private LocalDateTime submissionDate;

    public Submission() {
    }

    public Submission(Long id, Long assignmentId, Long studentId, String fileUrl, String grade, String status, LocalDateTime submissionDate) {
        this.id = id;
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.fileUrl = fileUrl;
        this.grade = grade;
        this.status = status != null ? status : "PENDING";
        this.submissionDate = submissionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDateTime submissionDate) {
        this.submissionDate = submissionDate;
    }

    public static SubmissionBuilder builder() {
        return new SubmissionBuilder();
    }

    public static class SubmissionBuilder {
        private Long id;
        private Long assignmentId;
        private Long studentId;
        private String fileUrl;
        private String grade;
        private String status = "PENDING";
        private LocalDateTime submissionDate;

        SubmissionBuilder() {
        }

        public SubmissionBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SubmissionBuilder assignmentId(Long assignmentId) {
            this.assignmentId = assignmentId;
            return this;
        }

        public SubmissionBuilder studentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }

        public SubmissionBuilder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public SubmissionBuilder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public SubmissionBuilder status(String status) {
            this.status = status;
            return this;
        }

        public SubmissionBuilder submissionDate(LocalDateTime submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }

        public Submission build() {
            return new Submission(id, assignmentId, studentId, fileUrl, grade, status, submissionDate);
        }
    }
}

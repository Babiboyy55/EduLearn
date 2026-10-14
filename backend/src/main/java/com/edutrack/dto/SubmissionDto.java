package com.edutrack.dto;

import java.time.LocalDateTime;

public class SubmissionDto {
    private Long id;
    private Long assignmentId;
    private Long studentId;
    private String fileUrl;
    private String grade;
    private String status;
    private LocalDateTime submissionDate;
    private String studentName;
    private String studentEmail;
    private String assignmentTitle;

    public SubmissionDto() {
    }

    public SubmissionDto(Long id, Long assignmentId, Long studentId, String fileUrl, String grade, String status, LocalDateTime submissionDate, String studentName, String studentEmail, String assignmentTitle) {
        this.id = id;
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.fileUrl = fileUrl;
        this.grade = grade;
        this.status = status;
        this.submissionDate = submissionDate;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.assignmentTitle = assignmentTitle;
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

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public static SubmissionDtoBuilder builder() {
        return new SubmissionDtoBuilder();
    }

    public static class SubmissionDtoBuilder {
        private Long id;
        private Long assignmentId;
        private Long studentId;
        private String fileUrl;
        private String grade;
        private String status;
        private LocalDateTime submissionDate;
        private String studentName;
        private String studentEmail;
        private String assignmentTitle;

        SubmissionDtoBuilder() {
        }

        public SubmissionDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SubmissionDtoBuilder assignmentId(Long assignmentId) {
            this.assignmentId = assignmentId;
            return this;
        }

        public SubmissionDtoBuilder studentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }

        public SubmissionDtoBuilder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public SubmissionDtoBuilder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public SubmissionDtoBuilder status(String status) {
            this.status = status;
            return this;
        }

        public SubmissionDtoBuilder submissionDate(LocalDateTime submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }

        public SubmissionDtoBuilder studentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public SubmissionDtoBuilder studentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }

        public SubmissionDtoBuilder assignmentTitle(String assignmentTitle) {
            this.assignmentTitle = assignmentTitle;
            return this;
        }

        public SubmissionDto build() {
            return new SubmissionDto(id, assignmentId, studentId, fileUrl, grade, status, submissionDate, studentName, studentEmail, assignmentTitle);
        }
    }
}

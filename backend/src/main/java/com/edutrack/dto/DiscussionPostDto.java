package com.edutrack.dto;

import java.time.LocalDateTime;

public class DiscussionPostDto {
    private Long id;
    private Long courseId;
    private Long userId;
    private String userName;
    private String message;
    private Long parentId;
    private LocalDateTime createdAt;

    public DiscussionPostDto() {
    }

    public DiscussionPostDto(Long id, Long courseId, Long userId, String userName, String message, Long parentId, LocalDateTime createdAt) {
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
        this.userName = userName;
        this.message = message;
        this.parentId = parentId;
        this.createdAt = createdAt;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static DiscussionPostDtoBuilder builder() {
        return new DiscussionPostDtoBuilder();
    }

    public static class DiscussionPostDtoBuilder {
        private Long id;
        private Long courseId;
        private Long userId;
        private String userName;
        private String message;
        private Long parentId;
        private LocalDateTime createdAt;

        DiscussionPostDtoBuilder() {
        }

        public DiscussionPostDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public DiscussionPostDtoBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public DiscussionPostDtoBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public DiscussionPostDtoBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public DiscussionPostDtoBuilder message(String message) {
            this.message = message;
            return this;
        }

        public DiscussionPostDtoBuilder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        public DiscussionPostDtoBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public DiscussionPostDto build() {
            return new DiscussionPostDto(id, courseId, userId, userName, message, parentId, createdAt);
        }
    }
}

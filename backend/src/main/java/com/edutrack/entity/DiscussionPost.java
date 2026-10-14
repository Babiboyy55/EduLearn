package com.edutrack.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "discussion_posts")
public class DiscussionPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String message;

    @Column(name = "parent_id")
    private Long parentId; // null for original post, otherwise ID of top-level post

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public DiscussionPost() {
    }

    public DiscussionPost(Long id, Long courseId, Long userId, String userName, String message, Long parentId, LocalDateTime createdAt) {
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

    public static DiscussionPostBuilder builder() {
        return new DiscussionPostBuilder();
    }

    public static class DiscussionPostBuilder {
        private Long id;
        private Long courseId;
        private Long userId;
        private String userName;
        private String message;
        private Long parentId;
        private LocalDateTime createdAt;

        DiscussionPostBuilder() {
        }

        public DiscussionPostBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public DiscussionPostBuilder courseId(Long courseId) {
            this.courseId = courseId;
            return this;
        }

        public DiscussionPostBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public DiscussionPostBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public DiscussionPostBuilder message(String message) {
            this.message = message;
            return this;
        }

        public DiscussionPostBuilder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        public DiscussionPostBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public DiscussionPost build() {
            return new DiscussionPost(id, courseId, userId, userName, message, parentId, createdAt);
        }
    }
}

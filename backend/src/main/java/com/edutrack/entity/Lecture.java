package com.edutrack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "lectures")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id")
    @JsonIgnore
    private Module module;

    @Column(nullable = false)
    private String title;

    @Column(name = "content_url", length = 4096)
    private String contentUrl;

    @Column(length = 20)
    private String type; // VIDEO, TEXT

    public Lecture() {
    }

    public Lecture(Long id, Module module, String title, String contentUrl, String type) {
        this.id = id;
        this.module = module;
        this.title = title;
        this.contentUrl = contentUrl;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static LectureBuilder builder() {
        return new LectureBuilder();
    }

    public static class LectureBuilder {
        private Long id;
        private Module module;
        private String title;
        private String contentUrl;
        private String type;

        LectureBuilder() {
        }

        public LectureBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public LectureBuilder module(Module module) {
            this.module = module;
            return this;
        }

        public LectureBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LectureBuilder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        public LectureBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Lecture build() {
            return new Lecture(id, module, title, contentUrl, type);
        }
    }
}

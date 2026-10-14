package com.edutrack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    @JsonIgnore
    private Course course;

    @Column(nullable = false)
    private String title;

    @Column(name = "order_index")
    private Integer orderIndex;

    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lecture> lectures = new ArrayList<>();

    public Module() {
    }

    public Module(Long id, Course course, String title, Integer orderIndex, List<Lecture> lectures) {
        this.id = id;
        this.course = course;
        this.title = title;
        this.orderIndex = orderIndex;
        this.lectures = lectures != null ? lectures : new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public static ModuleBuilder builder() {
        return new ModuleBuilder();
    }

    public static class ModuleBuilder {
        private Long id;
        private Course course;
        private String title;
        private Integer orderIndex;
        private List<Lecture> lectures = new ArrayList<>();

        ModuleBuilder() {
        }

        public ModuleBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ModuleBuilder course(Course course) {
            this.course = course;
            return this;
        }

        public ModuleBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ModuleBuilder orderIndex(Integer orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }

        public ModuleBuilder lectures(List<Lecture> lectures) {
            this.lectures = lectures;
            return this;
        }

        public Module build() {
            return new Module(id, course, title, orderIndex, lectures);
        }
    }
}

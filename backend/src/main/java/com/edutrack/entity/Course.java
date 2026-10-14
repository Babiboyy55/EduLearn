package com.edutrack.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "instructor_id", nullable = false)
    private Long instructorId;

    @Column(name = "instructor_name")
    private String instructorName;

    private String category;

    private Double price;

    @Column(length = 2048)
    private String thumbnail;

    @Column(length = 20, nullable = false)
    private String status = "PENDING"; // PENDING, APPROVED, REJECTED

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("orderIndex ASC")
    private List<Module> modules = new ArrayList<>();

    public Course() {
    }

    public Course(Long id, String title, String description, Long instructorId, String instructorName, String category, Double price, String thumbnail, String status, List<Module> modules) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.category = category;
        this.price = price;
        this.thumbnail = thumbnail;
        this.status = status != null ? status : "PENDING";
        this.modules = modules != null ? modules : new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public static CourseBuilder builder() {
        return new CourseBuilder();
    }

    public static class CourseBuilder {
        private Long id;
        private String title;
        private String description;
        private Long instructorId;
        private String instructorName;
        private String category;
        private Double price;
        private String thumbnail;
        private String status = "PENDING";
        private List<Module> modules = new ArrayList<>();

        CourseBuilder() {
        }

        public CourseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CourseBuilder title(String title) {
            this.title = title;
            return this;
        }

        public CourseBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CourseBuilder instructorId(Long instructorId) {
            this.instructorId = instructorId;
            return this;
        }

        public CourseBuilder instructorName(String instructorName) {
            this.instructorName = instructorName;
            return this;
        }

        public CourseBuilder category(String category) {
            this.category = category;
            return this;
        }

        public CourseBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public CourseBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public CourseBuilder status(String status) {
            this.status = status;
            return this;
        }

        public CourseBuilder modules(List<Module> modules) {
            this.modules = modules;
            return this;
        }

        public Course build() {
            return new Course(id, title, description, instructorId, instructorName, category, price, thumbnail, status, modules);
        }
    }
}

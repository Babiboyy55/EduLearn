package com.edutrack.dto;

import java.util.List;

public class CourseDto {
    private Long id;
    private String title;
    private String description;
    private Long instructorId;
    private String instructorName;
    private String category;
    private Double price;
    private String thumbnail;
    private String status;
    private List<ModuleDto> modules;

    public CourseDto() {
    }

    public CourseDto(Long id, String title, String description, Long instructorId, String instructorName, String category, Double price, String thumbnail, String status, List<ModuleDto> modules) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.category = category;
        this.price = price;
        this.thumbnail = thumbnail;
        this.status = status;
        this.modules = modules;
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

    public List<ModuleDto> getModules() {
        return modules;
    }

    public void setModules(List<ModuleDto> modules) {
        this.modules = modules;
    }

    public static CourseDtoBuilder builder() {
        return new CourseDtoBuilder();
    }

    public static class CourseDtoBuilder {
        private Long id;
        private String title;
        private String description;
        private Long instructorId;
        private String instructorName;
        private String category;
        private Double price;
        private String thumbnail;
        private String status;
        private List<ModuleDto> modules;

        CourseDtoBuilder() {
        }

        public CourseDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CourseDtoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public CourseDtoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CourseDtoBuilder instructorId(Long instructorId) {
            this.instructorId = instructorId;
            return this;
        }

        public CourseDtoBuilder instructorName(String instructorName) {
            this.instructorName = instructorName;
            return this;
        }

        public CourseDtoBuilder category(String category) {
            this.category = category;
            return this;
        }

        public CourseDtoBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public CourseDtoBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public CourseDtoBuilder status(String status) {
            this.status = status;
            return this;
        }

        public CourseDtoBuilder modules(List<ModuleDto> modules) {
            this.modules = modules;
            return this;
        }

        public CourseDto build() {
            return new CourseDto(id, title, description, instructorId, instructorName, category, price, thumbnail, status, modules);
        }
    }
}

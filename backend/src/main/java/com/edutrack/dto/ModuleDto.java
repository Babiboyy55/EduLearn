package com.edutrack.dto;

import java.util.List;

public class ModuleDto {
    private Long id;
    private String title;
    private Integer order;
    private List<LectureDto> lectures;

    public ModuleDto() {
    }

    public ModuleDto(Long id, String title, Integer order, List<LectureDto> lectures) {
        this.id = id;
        this.title = title;
        this.order = order;
        this.lectures = lectures;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<LectureDto> getLectures() {
        return lectures;
    }

    public void setLectures(List<LectureDto> lectures) {
        this.lectures = lectures;
    }

    public static ModuleDtoBuilder builder() {
        return new ModuleDtoBuilder();
    }

    public static class ModuleDtoBuilder {
        private Long id;
        private String title;
        private Integer order;
        private List<LectureDto> lectures;

        ModuleDtoBuilder() {
        }

        public ModuleDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ModuleDtoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ModuleDtoBuilder order(Integer order) {
            this.order = order;
            return this;
        }

        public ModuleDtoBuilder lectures(List<LectureDto> lectures) {
            this.lectures = lectures;
            return this;
        }

        public ModuleDto build() {
            return new ModuleDto(id, title, order, lectures);
        }
    }
}

package com.edutrack.dto;

public class LectureDto {
    private Long id;
    private String title;
    private String contentUrl;
    private String type; // VIDEO, TEXT

    public LectureDto() {
    }

    public LectureDto(Long id, String title, String contentUrl, String type) {
        this.id = id;
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

    public static LectureDtoBuilder builder() {
        return new LectureDtoBuilder();
    }

    public static class LectureDtoBuilder {
        private Long id;
        private String title;
        private String contentUrl;
        private String type;

        LectureDtoBuilder() {
        }

        public LectureDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public LectureDtoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LectureDtoBuilder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        public LectureDtoBuilder type(String type) {
            this.type = type;
            return this;
        }

        public LectureDto build() {
            return new LectureDto(id, title, contentUrl, type);
        }
    }
}

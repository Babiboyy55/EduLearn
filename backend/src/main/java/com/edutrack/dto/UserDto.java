package com.edutrack.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String role;
    private boolean active;

    public UserDto() {
    }

    public UserDto(Long id, String name, String email, String role, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static UserDtoBuilder builder() {
        return new UserDtoBuilder();
    }

    public static class UserDtoBuilder {
        private Long id;
        private String name;
        private String email;
        private String role;
        private boolean active;

        UserDtoBuilder() {
        }

        public UserDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserDtoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserDtoBuilder role(String role) {
            this.role = role;
            return this;
        }

        public UserDtoBuilder active(boolean active) {
            this.active = active;
            return this;
        }

        public UserDto build() {
            return new UserDto(id, name, email, role, active);
        }
    }
}

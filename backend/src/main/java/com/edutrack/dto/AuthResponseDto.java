package com.edutrack.dto;

public class AuthResponseDto {
    private String token;
    private UserDto user;

    public AuthResponseDto() {
    }

    public AuthResponseDto(String token, UserDto user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public static AuthResponseDtoBuilder builder() {
        return new AuthResponseDtoBuilder();
    }

    public static class AuthResponseDtoBuilder {
        private String token;
        private UserDto user;

        AuthResponseDtoBuilder() {
        }

        public AuthResponseDtoBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthResponseDtoBuilder user(UserDto user) {
            this.user = user;
            return this;
        }

        public AuthResponseDto build() {
            return new AuthResponseDto(token, user);
        }
    }
}

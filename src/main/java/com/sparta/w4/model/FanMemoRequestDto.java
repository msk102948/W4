package com.sparta.w4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
public class FanMemoRequestDto {

    private String title;
    private String username;
    private String content;

    public FanMemoRequestDto(String title, String username, String content) {
        this.title = title;
        this.username = username;
        this.content = content;
    }

    @Override
    public String toString() {
        return "FanMemoRequestDto{" +
                "title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

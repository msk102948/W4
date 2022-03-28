package com.sparta.w4.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class FanMemoRequestDto {

    private String title;
    private String username;
    private String content;

    @Override
    public String toString() {
        return "FanMemoRequestDto{" +
                "title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

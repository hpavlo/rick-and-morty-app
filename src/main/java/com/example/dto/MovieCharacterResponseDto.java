package com.example.dto;

import com.example.model.MovieCharacter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieCharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private MovieCharacter.Status status;
    private MovieCharacter.Gender gender;
}

package com.example.dto.mapper;

import com.example.dto.MovieCharacterResponseDto;
import com.example.dto.external.ApiCharacterDto;
import com.example.model.MovieCharacter;
import org.springframework.stereotype.Component;

@Component
public class MovieCharacterMapper {
    public MovieCharacter parseApiCharacterResponseDto(ApiCharacterDto dto) {
        MovieCharacter movieCharacter = new MovieCharacter();
        movieCharacter.setExternalId(dto.getId());
        movieCharacter.setName(dto.getName());
        movieCharacter.setStatus(MovieCharacter.Status.valueOf(dto.getStatus().toUpperCase()));
        movieCharacter.setGender(MovieCharacter.Gender.valueOf(dto.getGender().toUpperCase()));
        return movieCharacter;
    }

    public MovieCharacterResponseDto toResponseDto(MovieCharacter movieCharacter) {
        MovieCharacterResponseDto responseDto = new MovieCharacterResponseDto();
        responseDto.setId(movieCharacter.getId());
        responseDto.setExternalId(movieCharacter.getExternalId());
        responseDto.setName(movieCharacter.getName());
        responseDto.setStatus(movieCharacter.getStatus());
        responseDto.setGender(movieCharacter.getGender());
        return responseDto;
    }
}

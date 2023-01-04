package com.example.controller;

import com.example.dto.MovieCharacterResponseDto;
import com.example.dto.mapper.MovieCharacterMapper;
import com.example.model.MovieCharacter;
import com.example.service.MovieCharacterService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-characters")
public class MovieCharacterController {
    private final MovieCharacterService movieCharacterService;
    private final MovieCharacterMapper movieCharacterMapper;

    public MovieCharacterController(MovieCharacterService movieCharacterService,
                                    MovieCharacterMapper movieCharacterMapper) {
        this.movieCharacterService = movieCharacterService;
        this.movieCharacterMapper = movieCharacterMapper;
    }

    @GetMapping("/random")
    @ApiOperation("Get random character from DB")
    public MovieCharacterResponseDto getRandom() {
        MovieCharacter character = movieCharacterService.getRandomCharacter();
        return movieCharacterMapper.toResponseDto(character);
    }

    @GetMapping("/by-name")
    @ApiOperation("Get character by part of name")
    public List<MovieCharacterResponseDto> findAllByName(@RequestParam("name") String namePart) {
        return movieCharacterService.findAllByNameContains(namePart)
                .stream()
                .map(movieCharacterMapper::toResponseDto)
                .toList();
    }
}

package com.example.dto.external;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDto {
    private ApiInfoDto info;
    private ApiCharacterDto[] results;
}

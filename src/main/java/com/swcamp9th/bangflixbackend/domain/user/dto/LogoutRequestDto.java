package com.swcamp9th.bangflixbackend.domain.user.dto;

import lombok.Getter;

@Getter
public class LogoutRequestDto {
    String refreshToken;
}

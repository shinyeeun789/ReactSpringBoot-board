package com.example.board.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String userID;
    private String email;
    private String password;
    private String nickname;
}

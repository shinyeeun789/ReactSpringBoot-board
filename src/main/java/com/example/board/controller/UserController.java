package com.example.board.controller;

import com.example.board.dto.Users;
import com.example.board.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

// FrontEnd와 BackEnd를 분리하게 되면 통신할 때 응답 값으로 주로 JSON을 사용하기 때문에 RestController 사용이 좋음
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public List<Users> user() {
        List<Users> userList = userService.getUserList();
        for (int i=0; i<userList.size(); i++) {
            System.out.println(userList.get(i).getNickname());
        }
        return userService.getUserList();
    }

    @GetMapping("/authentication/sign-up")
    public boolean idCheck() {

        return true;
    }

}

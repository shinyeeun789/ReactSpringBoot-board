package com.example.board.service;

import com.example.board.dao.UserDAO;
import com.example.board.dto.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceImpl {
    private final UserDAO userDAO;

    @Override
    public List<Users> getUserList() {
        return userDAO.getUserList();
    }
}

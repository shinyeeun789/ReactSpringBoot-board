package com.example.board.dao;

import java.util.List;

import com.example.board.dto.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {
    List<Users> getUserList();
}

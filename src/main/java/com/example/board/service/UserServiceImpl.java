// 인터페이스명은 mapper.xml에 선언해준 ID와 맞춰줄 것

package com.example.board.service;

import com.example.board.dto.Users;
import java.util.List;

public interface UserServiceImpl {
    
    public List<Users> getUserList();

}

package com.song.demo.service;

import com.song.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User regUser(String uerId);
}

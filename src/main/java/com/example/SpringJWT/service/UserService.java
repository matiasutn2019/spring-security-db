package com.example.SpringJWT.service;

import com.example.SpringJWT.domain.AppUser;
import com.example.SpringJWT.domain.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}

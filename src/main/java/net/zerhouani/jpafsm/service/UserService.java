package net.zerhouani.jpafsm.service;

import net.zerhouani.jpafsm.entities.Role;
import net.zerhouani.jpafsm.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
}

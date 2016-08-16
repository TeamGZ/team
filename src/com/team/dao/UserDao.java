package com.team.dao;

import java.util.List;

import com.team.entity.User;

public interface UserDao {
    public int insert(User user);
    
    public int update(User user);
   
    public int delete(String userName);
   
    public List selectAll();
   
    public int countAll();
   
    public User findByUserName(String userName);

}
package com.jcc.traval.service;

import com.jcc.traval.entity.User;
import com.jcc.traval.vo.UserConditionVO;

import java.util.List;


public interface IUserService {
    public List<User> list(UserConditionVO userConditionVO) ;

    public User load(int userId) ;

    public int insert(User user) ;

    public int delete(Integer userId) ;

    public int update(User user) ;

//    public int deletes(Integer[] userIds) ;
}

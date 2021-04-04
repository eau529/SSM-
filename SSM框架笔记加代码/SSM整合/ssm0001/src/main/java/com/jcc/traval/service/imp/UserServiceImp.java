package com.jcc.traval.service.imp;

import com.jcc.traval.dao.IUserDao;
import com.jcc.traval.entity.User;
import com.jcc.traval.service.IUserService;
import com.jcc.traval.vo.UserConditionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    IUserDao userDao ;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    public List<User> list(UserConditionVO userConditionVO) {

        System.out.println("UserServiceImp.list()");
        return userDao.list(userConditionVO);
    }

    @Override
    public User load(int userId) {
        return null;
    }

    @Override
    public int insert(User user)  {
        return userDao.insert(user) ;
    }

    @Override
    public int delete(Integer userId) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}

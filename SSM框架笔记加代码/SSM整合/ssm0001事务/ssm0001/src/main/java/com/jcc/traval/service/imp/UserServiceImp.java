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

    public List<User> list(UserConditionVO userConditionVO) {

        System.out.println("UserServiceImp.list()");
        return userDao.list(userConditionVO);
    }

    @Override
    public User load(int userId) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class ,propagation = Propagation.REQUIRED)
    public int insert(User user) throws Exception {
        int result = userDao.insert(user) ;
        if(true)
            throw new Exception("模拟抛异常") ;
        return result ;
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

package com.jcc.traval.service.imp;

import com.jcc.traval.dao.IUserDao;
import com.jcc.traval.entity.User;
import com.jcc.traval.service.IInnerUserService;
import com.jcc.traval.service.IOutUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class OutUserServiceImp implements IOutUserService {
    @Autowired
    IUserDao userDao ;

    @Autowired
    IInnerUserService innerUserService ;

    @Override
    @Transactional(rollbackFor = Throwable.class ,propagation = Propagation.REQUIRED)
    public int insert(User user) throws Exception {
        System.out.println("外部事务名称:" + TransactionSynchronizationManager.getCurrentTransactionName());
        int result = userDao.insert(user) ;

        User innerUser = new User() ;
        innerUser.setName("ssm inner001");
        try {
            innerUserService.insert(innerUser);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        if(true){
            throw new Exception("外部事务回滚") ;
        }
        return result ;
    }

}

package com.jcc.traval.service.imp;

import com.jcc.traval.dao.IUserDao;
import com.jcc.traval.entity.User;
import com.jcc.traval.service.IInnerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class InnerUserServiceImp implements IInnerUserService {
    @Autowired
    IUserDao userDao ;

    @Override
    @Transactional(rollbackFor = Throwable.class ,propagation = Propagation.NESTED)
    public int insert(User user) throws Exception {
        System.out.println("内部事务名称:" + TransactionSynchronizationManager.getCurrentTransactionName());
        int result = userDao.insert(user) ;

        if(true){
            throw new Exception("内部事务回滚") ;
        }

        return result ;
    }

}

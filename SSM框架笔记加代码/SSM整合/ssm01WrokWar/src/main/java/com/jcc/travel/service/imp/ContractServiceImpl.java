package com.jcc.travel.service.imp;

import com.jcc.travel.dao.IContractDao;
import com.jcc.travel.entity.BasContract;
import com.jcc.travel.service.IContractService;
import com.jcc.travel.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    IContractDao iContractDao;



    @Override
    public int create(ContractVo contractVo) {
        System.out.println ( "这是create方法" );
        return iContractDao.create ( contractVo );
    }

    @Override
    public int update(ContractVo contractVo) {
        System.out.println ( "这是update方法" );
        return iContractDao.update (contractVo);
    }

    @Override
    public int delete(ContractVo contractVo) {
        System.out.println ( "这是delete方法" );
        return iContractDao.delete (contractVo);
    }

    @Override
    public BasContract read(ContractVo contractVo) {
        System.out.println ( "这是read方法" );
        return iContractDao.read (contractVo);
    }
}

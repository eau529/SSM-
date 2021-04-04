package com.jcc.travel.service;

import com.jcc.travel.entity.BasContract;
import com.jcc.travel.vo.ContractVo;

import java.util.List;


public interface IContractService {
    public int create(ContractVo contractVo);
    public int update(ContractVo contractVo);
    public int delete(ContractVo contractVo);
    public BasContract read(ContractVo contractVo);
}

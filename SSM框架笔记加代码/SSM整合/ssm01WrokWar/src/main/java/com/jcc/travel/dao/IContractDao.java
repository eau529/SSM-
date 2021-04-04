package com.jcc.travel.dao;

import com.jcc.travel.entity.BasContract;
import com.jcc.travel.vo.ContractVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContractDao {

   public int create(ContractVo contractVo);
   public int delete(ContractVo contractVo);
   public int update(ContractVo contractVo);
   public BasContract read(ContractVo contractVo);

}

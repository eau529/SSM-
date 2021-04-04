package com.jcc.travel.controller;

import com.jcc.travel.entity.BasContract;
import com.jcc.travel.service.IContractService;
import com.jcc.travel.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BasContractControll {
    @Autowired
    IContractService iContractService ;


}

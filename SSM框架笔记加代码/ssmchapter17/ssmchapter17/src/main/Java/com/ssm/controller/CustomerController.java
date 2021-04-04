package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssm.po.Customer;
import com.ssm.service.CustomerService;
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    /**
     * 根据id查询客户详情
     */
    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id,Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        //返回客户信息展示页面
        return "customer";
    }
}
//发布项目到Tomcat服务器并启动，在浏览器中访问地址http://localhost:8080/ssmchapter17/findCustomerById?id=1
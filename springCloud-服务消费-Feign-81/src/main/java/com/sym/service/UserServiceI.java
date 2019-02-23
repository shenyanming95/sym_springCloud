package com.sym.service;

import com.sym.entity.UserBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 沈燕明 on 2019/1/16.
 */
@FeignClient(name="${serviceName}",path = "provider/user")
public interface UserServiceI {

    @RequestMapping("get/{id}")
    UserBean getUserById(@PathVariable("id") int UserId);

    @RequestMapping("list")
    List<UserBean> getUserList();
}

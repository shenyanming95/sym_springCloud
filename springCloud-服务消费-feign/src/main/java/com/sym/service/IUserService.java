package com.sym.service;

import com.sym.config.feign.FeignLogConfig;
import com.sym.entity.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 * @author shenhanming
 * @date 2019/1/16
 */
@FeignClient(name = "${sym.service.provider.name}",
        path = "/provider/user",
        configuration = FeignLogConfig.class)
public interface IUserService {

    @RequestMapping("get/{id}")
    UserBean getUserById(@PathVariable("id") int userId);

    @RequestMapping("list")
    List<UserBean> getUserList();

    @RequestMapping("error")
    UserBean error();
}

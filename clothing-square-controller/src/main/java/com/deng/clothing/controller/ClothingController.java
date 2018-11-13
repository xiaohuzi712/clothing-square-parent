/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2018/11/8

*/
package com.deng.clothing.controller;

import com.deng.clothing.DTO.UserDTO;
import com.deng.clothing.api.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class ClothingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClothingController.class);
    @Resource
    private UserInfoService userInfoServiceImpl;

    @RequestMapping("/demo1")
    public String demo1() {
        return "Hello Luis";
    }

    @RequestMapping("/demo2")
    public UserDTO demo2() {
        UserDTO userDTO = userInfoServiceImpl.get(1);
        return userDTO;
    }
}

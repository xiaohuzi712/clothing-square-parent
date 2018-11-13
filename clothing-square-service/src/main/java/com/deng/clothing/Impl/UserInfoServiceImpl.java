/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2018/11/4

*/
package com.deng.clothing.Impl;


import com.deng.clothing.DTO.UserDTO;
import com.deng.clothing.api.UserInfoService;
import com.deng.clothing.entity.UserInfo;
import com.deng.clothing.mapper.UserInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserDTO get(int id) {
        System.out.println("id"+id);
        UserInfo userInfo = userInfoMapper.selectById(id);
        System.out.println(userInfo.toString());
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userInfo,userDTO);
        return userDTO;
    }
}

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
package com.deng.clothing.mapper;

import com.deng.clothing.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    /**
     * 查询用户信息
     *
     * @param id
     * @return
     */
    UserInfo selectById(@Param("id") int id);
}

package com.wyl.mall.permission.cache;


import com.wyl.mall.permission.client.PermissionServiceClient;
import com.wyl.mall.permission.dto.UserDTO;
import com.wyl.zodiac.cache.provider.ITTLCacheProvider;
import com.wyl.zodiac.core.entity.IUser;
import com.wyl.zodiac.web.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @Title: UserCacheProvider 
* @Package com.hoau.leo.business.cache 
* @Description: 用户信息提供者
* @author 陈宇霖  
* @date 2017/8/7 15:21
* @version V1.0   
*/
@Component
public class UserCacheProvider implements ITTLCacheProvider<IUser> {

    @Autowired
    private PermissionServiceClient permissionServiceClient;

    /**
     * 根据用户编码，从权限管理系统获取用户信息
     * @param userCode
     * @return
     * @author 陈宇霖
     * @date 2017年09月18日21:12:14
     */
    @Override
    public IUser get(String userCode) {
//        Response<UserDTO> response = permissionServiceClient.getUser(userCode);
//        if (response != null && response.isSuccess()) {
//            return response.getResult();
//        }
        return null;
    }

}

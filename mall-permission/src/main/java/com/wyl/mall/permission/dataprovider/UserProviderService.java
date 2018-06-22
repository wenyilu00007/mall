package com.wyl.mall.permission.dataprovider;

import com.wyl.mall.permission.cache.UserCache;
import com.wyl.zodiac.cache.CacheManager;
import com.wyl.zodiac.cache.ICache;
import com.wyl.zodiac.core.dataprovider.IUserProvider;
import com.wyl.zodiac.core.entity.IUser;
import org.springframework.stereotype.Service;

/**
* @Title: UserProviderService 
* @Package com.hoau.leo.business.service.impl 
* @Description: 用户信息提供实现服务
* @author 陈宇霖  
* @date 2017/8/3 17:36
* @version V1.0   
*/
@Service
public class UserProviderService implements IUserProvider {

    /**
     * 根据用户id获取用户
     *
     * @param userId
     * @return
     * @author 陈宇霖
     * @date 2017年08月02日21:28:42
     */
    public IUser getUserById(String userId) {
        ICache<String, IUser> cache =  CacheManager.getInstance().getCache(UserCache.UUID);
        return cache.get(userId);
    }
}

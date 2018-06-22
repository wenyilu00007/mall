package com.wyl.mall.permission.dataprovider;


import com.wyl.mall.permission.dto.UserDTO;
import com.wyl.mall.permission.cache.CacheKey;
import com.wyl.mall.permission.cache.UserResourceCache;
import com.wyl.zodiac.cache.CacheManager;
import com.wyl.zodiac.cache.ICache;
import com.wyl.zodiac.core.dataprovider.IUserResourceProvider;
import com.wyl.zodiac.core.entity.IResource;
import com.wyl.zodiac.core.entity.IUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Title: UserResourceProviderService 
* @Package com.hoau.leo.business.service.impl 
* @Description: 用户权限获取服务
* @author 陈宇霖  
* @date 2017/8/6 13:48
* @version V1.0   
*/
@Service
public class UserResourceProviderService implements IUserResourceProvider {

    /**
     * 根据用户获取用户的访问权限
     *
     * @param user
     * @param systemCode
     * @return
     * @author 陈宇霖
     * @date 2017年08月04日17:23:34
     */
    public List<IResource> getResources(IUser user, String systemCode) {
        UserDTO u = (UserDTO) user;
        CacheKey key = new CacheKey(u.getUserCode(), systemCode, null);
        ICache<String, List<IResource>> cache = CacheManager.getInstance().getCache(UserResourceCache.UUID);
        return cache.get(key.generateKey());
    }

}

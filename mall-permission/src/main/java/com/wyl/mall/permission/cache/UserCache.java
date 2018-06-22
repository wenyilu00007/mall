package com.wyl.mall.permission.cache;

import com.wyl.zodiac.cache.redis.DefaultTTLRedisCache;
import com.wyl.zodiac.cache.redis.storage.RedisCacheStorage;
import com.wyl.zodiac.core.entity.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @Title: UserCache 
* @Package com.hoau.leo.business.cache 
* @Description: 用户信息缓存
* @author 陈宇霖  
* @date 2017/8/7 15:17
* @version V1.0   
*/
@Component
public class UserCache extends DefaultTTLRedisCache<IUser> {

    @Autowired
    private RedisCacheStorage redisCacheStorage;

    @Autowired
    private UserCacheProvider userCacheProvider;

    public static final String UUID = UserCache.class.getName();

    @Override
    public String getUUID() {
        return UUID;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();
        setCacheStorage(redisCacheStorage);
        setCacheProvider(userCacheProvider);
        setTimeOut(10 * 60);
    }
}

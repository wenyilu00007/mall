package com.wyl.mall.permission.cache;

import com.wyl.mall.permission.dto.ResourceDTO;
import com.wyl.zodiac.cache.redis.DefaultTTLRedisCache;
import com.wyl.zodiac.cache.redis.storage.RedisCacheStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

;

/**
* @Title: ResourceCache 
* @Package com.hoau.cancer.permission.cache 
* @Description: 权限菜单缓存
* @author 陈宇霖  
* @date 2017/9/18 17:38
* @version V1.0   
*/
@Component
public class UserResourceCache extends DefaultTTLRedisCache<List<ResourceDTO>> {

    @Autowired
    private RedisCacheStorage redisCacheStorage;

    @Autowired
    private UserResourceCacheProvider userResourceCacheProvider;

    public static final String UUID = UserResourceCache.class.getName();
    /**
     * 标记当前Cache的UUID
     *
     * @return
     */
    @Override
    public String getUUID() {
        return UUID;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();
        setCacheStorage(redisCacheStorage);
        setCacheProvider(userResourceCacheProvider);
        setTimeOut(10 * 60);
    }
}

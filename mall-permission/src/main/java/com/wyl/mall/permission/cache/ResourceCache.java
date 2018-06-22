package com.wyl.mall.permission.cache;

import com.wyl.zodiac.cache.redis.DefaultTTLRedisCache;
import com.wyl.zodiac.cache.redis.storage.RedisCacheStorage;
import com.wyl.zodiac.core.entity.IResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 陈宇霖
 * @version V1.0
 * @Title: ResourceCache
 * @Package com.hoau.cancer.permission.cache
 * @Description: 权限菜单缓存
 * @date 2017/9/18 17:38
 */
@Component
public class ResourceCache extends DefaultTTLRedisCache<IResource> {

    @Autowired
    private RedisCacheStorage redisCacheStorage;

    @Autowired
    private ResourceCacheProvider resourceCacheProvider;

    public static final String UUID = ResourceCache.class.getName();

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
        setCacheProvider(resourceCacheProvider);
        setTimeOut(10 * 60);
    }
}

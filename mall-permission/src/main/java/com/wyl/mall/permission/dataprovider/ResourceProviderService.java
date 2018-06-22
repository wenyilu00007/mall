package com.wyl.mall.permission.dataprovider;

import com.wyl.mall.permission.cache.ResourceCache;
import com.wyl.mall.permission.cache.CacheKey;
import com.wyl.zodiac.cache.CacheManager;
import com.wyl.zodiac.cache.ICache;
import com.wyl.zodiac.core.dataprovider.IResourceProvider;
import com.wyl.zodiac.core.entity.IResource;
import org.springframework.stereotype.Service;


/**
* @Title: ResourceProviderService 
* @Package com.hoau.leo.business.service.impl 
* @Description: 权限获取服务
* @author 陈宇霖  
* @date 2017/8/6 13:47
* @version V1.0   
*/
@Service
public class ResourceProviderService implements IResourceProvider {

    /**
     * 根据请求的uri构建resource对象
     *
     * @param accessUri
     * @param systemCode
     * @return
     * @author 陈宇霖
     * @date 2017年08月06日09:26:04
     */
    public IResource getResource(String accessUri, String systemCode) {
        ICache<String, IResource> cache = CacheManager.getInstance().getCache(ResourceCache.UUID);
        CacheKey key = new CacheKey(systemCode, accessUri, "");
        return cache.get(key.generateKey());
    }

}

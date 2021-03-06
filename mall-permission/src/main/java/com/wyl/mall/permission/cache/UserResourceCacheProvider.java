package com.wyl.mall.permission.cache;


import com.wyl.mall.permission.dto.ResourceDTO;
import com.wyl.mall.permission.client.PermissionServiceClient;
import com.wyl.zodiac.cache.provider.ITTLCacheProvider;
import com.wyl.zodiac.web.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Title: ResourceCacheProvider 
* @Package com.hoau.cancer.permission.cache 
* @Description: 权限菜单缓存数据提供者
* @author 陈宇霖  
* @date 2017/9/18 17:50
* @version V1.0   
*/
@Component
public class UserResourceCacheProvider implements ITTLCacheProvider<List<ResourceDTO>> {

    @Autowired
    private PermissionServiceClient permissionServiceClient;

    /**
     * 加载单个元素
     * get
     *
     * @param key
     * @return V
     * @since:
     */
    @Override
    public List<ResourceDTO> get(String key) {
        CacheKey cacheKey = CacheKey.convertToCacheKey(key);
        if (cacheKey == null || cacheKey.length() != 3) {
            return null;
        }
        String userCode = cacheKey.get(0);
        String systemCode = cacheKey.get(1);
        String language = cacheKey.get(2);
//        Response<List<ResourceDTO>> response = permissionServiceClient.getResources(userCode, systemCode, language);
//        if (response != null && response.isSuccess()) {
//            return response.getResult();
//        }
        return null;
    }
}

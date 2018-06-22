package com.wyl.mall.permission.service;


import com.wyl.mall.permission.dto.TreeNodeDTO;

import java.util.List;

/**
* @Title: IResourceService 
* @Package com.hoau.cancer.permission.service 
* @Description: 权限菜单服务接口
* @author 陈宇霖  
* @date 2017/9/18 17:31
* @version V1.0   
*/
public interface IResourceService {

    /**
     * 加载用户所有可用菜单
     * @param userCode
     * @param systemCode
     * @param language
     * @return
     * @author 陈宇霖
     * @date 2017年08月14日08:54:00
     */
    List<TreeNodeDTO> listUserResourceTree(String userCode, String systemCode, String language);
}

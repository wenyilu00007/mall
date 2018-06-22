package com.wyl.mall.permission.service.impl;


import com.google.common.collect.Lists;
import com.wyl.mall.permission.dto.ResourceDTO;
import com.wyl.mall.permission.dto.TreeNodeDTO;
import com.wyl.mall.permission.cache.UserResourceCache;
import com.wyl.mall.permission.cache.CacheKey;
import com.wyl.mall.permission.service.IResourceService;
import com.wyl.zodiac.cache.CacheManager;
import com.wyl.zodiac.cache.ICache;
import com.wyl.zodiac.core.util.string.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
* @Title: ResourceDTOService 
* @Package com.hoau.cancer.permission.service.impl 
* @Description: 权限菜单服务
* @author 陈宇霖  
* @date 2017/9/18 17:35
* @version V1.0   
*/
@Service
public class ResourceService implements IResourceService {

    /**
     * 加载用户所有可用菜单
     *
     * @param systemCode
     * @param userCode
     * @return
     * @author 陈宇霖
     * @date 2017年08月14日08:54:00
     */
    @Override
    public List<TreeNodeDTO> listUserResourceTree(String userCode, String systemCode, String language) {
        CacheKey key = new CacheKey(userCode, systemCode, language);
        ICache<String, List<ResourceDTO>> cache = CacheManager.getInstance().getCache(UserResourceCache.UUID);
        List<ResourceDTO> resources = cache.get(key.generateKey());
        if (CollectionUtils.isEmpty(resources)) {
            return null;
        }
        return convertResourceDTOs2Tree(new HashSet<>(resources));
    }

    /**
     * 将后台资源菜单转换成前台的树结构数据
     * @param resources
     * @return
     * @author 陈宇霖
     * @date 2017年08月14日10:10:47
     */
    private List<TreeNodeDTO> convertResourceDTOs2Tree(Set<ResourceDTO> resources) {
        if (resources == null) {
            return null;
        }
        List<TreeNodeDTO> tree = new ArrayList<TreeNodeDTO>(resources.size());
        setChildren(tree, resources, null, null);
        Collections.sort(tree);
        return tree;
    }

    /**
     * 递归构建前台需要的树, 此方法仅支持加载整棵树，不能从中间加载树下面的某个节点
     * @param tree              最终的树结果
     * @param resources         需要进行构建的菜单列表
     * @param parentResourceDTO    递归使用的上级菜单，外部调用直接给null
     * @param parentNode        递归使用的上级树节点，外部调用直接给null
     * @author 陈宇霖
     * @date 2017年08月14日11:39:03
     */
    private void setChildren(List<TreeNodeDTO> tree, Set<ResourceDTO> resources, ResourceDTO parentResourceDTO, TreeNodeDTO parentNode) {
        for (ResourceDTO resource : resources) {
            //添加第一层目录
            if (parentResourceDTO == null) {
                if (StringUtils.isEmpty(resource.getParentCode())) {
                    TreeNodeDTO node = convertResourceDTO2TreeNode(resource);
                    tree.add(node);
                    //同时递归设置下层目录
                    setChildren(tree, resources, resource, node);
                }
            } else {
                //将节点的上层目录和给的的父级目录相同时，添加为其子节点
                if (StringUtils.equals(parentResourceDTO.getResourceCode(), resource.getParentCode())) {
                    TreeNodeDTO node = convertResourceDTO2TreeNode(resource);
                    parentNode.addChild(node);
                    //如果当前的类型为按钮，则将此权限地址添加到父节点的meta中
                    if (resource.getResourceType() == 3) {
                        parentNode.addAvailableButton(resource.getEntryUri());
                    }
                    //同时递归设置下层
                    setChildren(tree, resources, resource, node);
                }
            }
        }
    }

    /**
     * 将资源转换成树节点
     * @param resource
     * @return
     * @author 陈宇霖
     * @date 2017年08月14日10:16:39
     */
    private TreeNodeDTO convertResourceDTO2TreeNode(ResourceDTO resource) {
        if (resource == null) {
            return  null;
        }
        TreeNodeDTO node = new TreeNodeDTO();
        node.setPath(resource.getEntryUri());
        node.setName(resource.getResourceName());
        node.setComponent(resource.getComponentPath());
        node.setLeaf(1 == resource.getLeaf());
        node.setIcon(resource.getIcon());
        node.setDisplayOrder(resource.getDisplayOrder());
        node.setNodeType(resource.getResourceType());
        node.setId(resource.getResourceCode());
        return node;
    }

}

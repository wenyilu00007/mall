package com.wyl.mall.permission.client;

import com.wyl.mall.permission.Constants;
import com.wyl.mall.permission.dto.ResourceDTO;
import com.wyl.mall.permission.dto.UserDTO;
import com.wyl.zodiac.web.response.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 陈宇霖
 * @version V1.0
 * @Title: PermissionServiceClient
 * @Package com.hoau.cancer.permission.client
 * @Description: 调用权限管理系统接口客户端
 * @date 2017/9/18 18:28
 */
@FeignClient(Constants.PERMISSION_SERVICE_NAME)
public interface PermissionServiceClient {

    /**
     * 获取用户权限菜单接口
     *
     * @param userCode
     * @param systemCode
     * @param language
     * @return
     * @author 陈宇霖
     * @date 2017年09月18日18:37:04
     */
    @RequestMapping(value = Constants.PERMISSION_GET_RESOURCES_URL, method = RequestMethod.GET)
    Response<List<ResourceDTO>> getResources(@RequestParam("userCode") String userCode,
                                             @RequestParam("systemCode") String systemCode,
                                             @RequestParam(value = "language", required = false) String language);

    /**
     * 获取单个菜单接口
     *
     * @param systemCode
     * @param entryUri
     * @param language
     * @return
     * @author 陈宇霖
     * @date 2017年09月18日20:53:41
     */
    @RequestMapping(value = Constants.PERMISSION_GET_RESOURCE_URL, method = RequestMethod.GET)
    Response<ResourceDTO> getResource(@RequestParam("systemCode") String systemCode,
                                      @RequestParam("entryUri") String entryUri,
                                      @RequestParam(value = "language", required = false) String language);

    /**
     * 获取用户信息接口
     *
     * @param userCode
     * @return
     * @author 陈宇霖
     * @date 2017年09月18日21:10:12
     */
    @RequestMapping(value = Constants.PERMISSION_GET_USER_URL, method = RequestMethod.GET)
    Response<UserDTO> getUser(@RequestParam("userCode") String userCode);


}

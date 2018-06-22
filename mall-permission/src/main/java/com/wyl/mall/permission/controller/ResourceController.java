package com.wyl.mall.permission.controller;


import com.wyl.mall.permission.dto.UserDTO;
import com.wyl.mall.permission.service.IResourceService;
import com.wyl.zodiac.web.context.UserContext;
import com.wyl.zodiac.web.controller.BasicController;
import com.wyl.zodiac.web.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
* @Title: ResourceController 
* @Package com.hoau.cancer.permission.controller 
* @Description: 权限菜单接口
* @author 陈宇霖  
* @date 2017/9/18 17:25
* @version V1.0   
*/
@RestController
@RequestMapping("/resources")
@Api(value = "/resources", description = "获取权限信息")
public class ResourceController extends BasicController {

    @Autowired
    private IResourceService resourceService;

    @ApiOperation(value = "列出当前登录用户在指定系统下的所有功能列表", notes = "列出当前登录用户在指定系统下的所有功能列表")
    @RequestMapping(value = "/v1/user/system/{systemCode}", method = RequestMethod.GET)
    public Response listUserResources(HttpServletRequest request, @PathVariable String systemCode) {
        Locale locale = RequestContextUtils.getLocale(request);
        String language = null;
        if (locale != null) {
            language = locale.toLanguageTag();
        }
        return returnSuccess(resourceService.listUserResourceTree(((UserDTO) UserContext.getCurrentUser()).getUserCode(), systemCode, language));
    }
}

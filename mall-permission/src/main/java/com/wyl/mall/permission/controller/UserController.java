package com.wyl.mall.permission.controller;

import com.wyl.zodiac.core.entity.IUser;
import com.wyl.zodiac.web.context.UserContext;
import com.wyl.zodiac.web.controller.BasicController;
import com.wyl.zodiac.web.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
* @Title: UserController 
* @Package com.hoau.cancer.permission.controller 
* @Description: 用户信息接口
* @author 陈宇霖  
* @date 2017/9/18 17:25
* @version V1.0   
*/
@RestController
@RequestMapping("/users")
@Api(value = "/users", description = "获取用户信息")
public class UserController extends BasicController {

    @ApiOperation(value = "获取当前登录的用户", notes = "获取当前登录的用户")
    @RequestMapping(value = "/v1/current", method = RequestMethod.GET)
    public Response listUserResources() {

        IUser user = UserContext.getCurrentUser();

        return returnSuccess(user);
    }

}

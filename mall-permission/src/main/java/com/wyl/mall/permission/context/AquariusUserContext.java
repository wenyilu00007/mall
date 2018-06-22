package com.wyl.mall.permission.context;

import com.wyl.mall.permission.dto.UserDTO;
import com.wyl.zodiac.core.constant.ApplicationConstants;
import com.wyl.zodiac.web.context.UserContext;

/**
* @Title: AquariusUserContext
* @Package AquariusUserContext
* @Description:
* @author 陈宇霖  
* @date 2017/8/17 08:43
* @version V1.0   
*/
public class AquariusUserContext {

    /**
     * 获取当前登录的用户
     * @return
     * @author 陈宇霖
     * @date 2017年08月17日08:46:22
     */
    public static UserDTO getCurrentUser() {
        return (UserDTO) UserContext.getCurrentUser();
    }

    /**
     * 获取当前登录的用户编码
     * @return
     * @author 陈宇霖
     * @date 2017年08月17日08:46:07
     */
    public static String getCurrentUserCode() {
        UserDTO user = getCurrentUser();
        if (user == null) {
            return ApplicationConstants.SYSTEM_OPERATOR;
        }
        return getCurrentUser().getUserCode();
    }

}

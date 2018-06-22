package com.wyl.mall.util;

import com.wyl.zodiac.web.request.BaseVO;
import com.wyl.zodiac.web.response.Response;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author dengyin
 * @Title: DtoValidateUtils
 * @Description: 对表单提交过来的数据进行校验
 * @date: 2017-10-15
 */
public class DtoValidateUtils {


    /**
     * 对表单提交过来的数据进行校验
     * @param vo
     * @param <T>
     * @return
     */
    public static <T extends BaseVO> Response validate(T vo) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(vo);

        if(!CollectionUtils.isEmpty(violations)) {
            Response response = new Response();
            response.setSuccess(false);
            response.setErrorCode(Response.ERROR_CODE_VALIDATE);

            StringBuffer buffer = new StringBuffer();
            for (ConstraintViolation<T> constraintViolation : violations) {
                String message = constraintViolation.getMessage();
                buffer.append(message).append(",");
            }

            String errorMsg = buffer.toString();
            if(errorMsg.endsWith(",")) {
                errorMsg = errorMsg.substring(0,errorMsg.length() - 1);
            }
            response.setErrorMsg(errorMsg);
            return response;
        }
        return null;
    }
}

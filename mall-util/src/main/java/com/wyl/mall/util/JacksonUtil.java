package com.wyl.mall.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Version
 * @Title: JacksonUtil
 * @Package: package com.hoau.gemini.util
 * @Description:
 * @Author: WenJie
 * @Date: 2017/8/8
 */
public class JacksonUtil {
    public static String toJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonInString);
            return jsonInString;
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T toObj(String json, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        T result = (T) mapper.readValue(json, clazz);
        return result;
    }

}

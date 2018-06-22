package com.wyl.mall.util.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
* @Title: VendorTraceFtpConfig 
* @Package com.wyl.mall.util.config
* @Description: 供应商轨迹ftp配置
* @author 陈宇霖  
* @date 2017/10/17 10:27
* @version V1.0   
*/
@Component
@ConfigurationProperties(prefix = "aquarius.trace")
public class VendorTraceFtpConfig {

    /**
     * 多供应商不同ftp配置
     */
    Map<String, FtpConfig> vendorFtps;

    public Map<String, FtpConfig> getVendorFtps() {
        return vendorFtps;
    }

    public void setVendorFtps(Map<String, FtpConfig> vendorFtps) {
        this.vendorFtps = vendorFtps;
    }
}

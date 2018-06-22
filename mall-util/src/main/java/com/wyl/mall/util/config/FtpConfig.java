package com.wyl.mall.util.config;
/**   
* @Title: FtpConfig 
* @Package com.wyl.mall.util.config
* @Description: ftp配置
* @author 陈宇霖  
* @date 2017/10/17 14:34
* @version V1.0   
*/
public class FtpConfig {

    /**
     * 服务器地址
     */
    private String host;

    /**
     * 服务器端口
     */
    private int port;

    /**
     * 用户登录名
     */
    private String username;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 上传到 FTP 文件服务器上的文件路径
     */
    private String ftpServerFilePath;

    /**
     * 正常读取的文件存放目录
     */
    private String processFilePath;

    /**
     * 失败文件的存放目录
     */
    private String errorFilePath;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFtpServerFilePath() {
        return ftpServerFilePath;
    }

    public void setFtpServerFilePath(String ftpServerFilePath) {
        this.ftpServerFilePath = ftpServerFilePath;
    }

    public String getProcessFilePath() {
        return processFilePath;
    }

    public void setProcessFilePath(String processFilePath) {
        this.processFilePath = processFilePath;
    }

    public String getErrorFilePath() {
        return errorFilePath;
    }

    public void setErrorFilePath(String errorFilePath) {
        this.errorFilePath = errorFilePath;
    }
}

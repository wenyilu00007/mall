package com.wyl.mall.util.constant;

/**
 * @Title: AttachmentConstants
 * @Package com.wyl.mall.shared.constant
 * @Description: 附件上传常量
 * @author 于金谷
 * @date 2017/11/14 10:19
 * @version V1.0
 */
public class AttachmentConstants {

    /**
     * 全路径URL
     */
    public static final String SERVER_URL = "http://10.39.251.174/";

    /**
     * 附件上传文件夹
     */
    public static final String UPLOAD_FOLDER = "D:/upload";

    /**
     * SFTP上传图片根目录
     */
    public static final String UPLOAD_SFTP_FOLDER = "upload";


    /**
     * SFTP上传根路径
     */
    public static final String UPLOAD_ROOT_FOLDER = "/opt/data/static/";


    /**
     * 附件上传分割
     */
    public static final String UPLOAD_SEPARATOR = "/";

    /**
     * 缩略图文件夹
     */
    public static final String THUMBNAILS_DIR = "thumbnails";

    /**
     * sftp服务器
     */
    public static final String SFTP_REQ_HOST = "10.39.251.174";
    public static final Integer SFTP_REQ_PORT = 22;
    public static final String SFTP_REQ_USERNAME = "static";
    public static final String SFTP_REQ_PASSWORD = "static";
    public static final String SFTP_REQ_LOC = "location";
    public static final Integer SFTP_TIMEOUT = 300000;

    /**
     * 文件类型 1 身份证 2 护照 3 港澳通行证 4 开户许可证 5 营业执照 6 商业登记证 7 公司注册书
     */
    public static final Integer FILE_TYPE_1 = 1;
    public static final Integer FILE_TYPE_2 = 2;
    public static final Integer FILE_TYPE_3 = 3;
    public static final Integer FILE_TYPE_4 = 4;
    public static final Integer FILE_TYPE_5 = 5;
    public static final Integer FILE_TYPE_6 = 6;
    public static final Integer FILE_TYPE_7 = 7;


    //合同信息
    public static final Integer FILE_TYPE_8 = 8;

    //价卡信息
    public static final Integer FILE_TYPE_9 = 9;

}

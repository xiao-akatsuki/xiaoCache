package com.xiaoCache.cache.simple.method;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * [相关工具](Related tools)
 * @description zh - 相关工具
 * @description en - Related tools
 * @version V1.0
 * @author drh
 * @since 2021-10-20 10：25
 */
public class SimpleMethod {
    /**
     * [md5](md5)
     * @description: zh - 对缓存值进行md5加密
     * @description: en - Md5 encryption of cached values
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021-09-20 11:23:15
     * @param data: 需要加密的字符串
     * @return String
     */
    public static String md5(String data) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] md5 = md.digest(data.getBytes(StandardCharsets.UTF_8));

            // 将字节数据转换为十六进制
            for (byte b : md5) {
                sb.append(Integer.toHexString(b & 0xff));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

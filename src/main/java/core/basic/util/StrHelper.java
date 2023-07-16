package core.basic.util;

import java.util.Random;

/**
 * 字符帮助文件
 */
public class StrHelper
{
    /**
     * 返回随机字符串
     *
     * @param length 长度
     * @return 随机字符串
     */
    public static String randomString(int length)
    {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }

        return sb.toString();
    }
}

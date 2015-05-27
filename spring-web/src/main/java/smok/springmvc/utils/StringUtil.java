package smok.springmvc.utils;

import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;

/**
 * 字符串工具类
 * 
 * @author laf
 * @date 2015年5月27日
 */
public class StringUtil {

	public static void main(String[] args) {
		System.out.println(getRandomString(100));
	}

	/**
	 * 获取指定长度的随机字符串,要求传入的长度为大于0的数
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
		if (length > 0) {
			StringBuilder sb = new StringBuilder();
			int index = 0;
			while (index++ < length) {
				if (RandomUtils.nextBoolean()) {
					sb.append((char) (97 + RandomUtils.nextInt(26))); // 65起是大写，97起是小写
				} else {
					sb.append(String.valueOf(RandomUtils.nextInt(10)));
				}
			}
			return sb.toString();
		}
		return null;
	}
}

package com.base.data;

import com.mysql.jdbc.StringUtils;

/**
 * 
 * @author LLS
 * 
 */
public class CustomerContextHolder {

	/**
	 * 默认数据源
	 */
	public static String defaultDataSource = "defaultDataSource";
	/**
	 * 目标数据源
	 */
	public static String targetDataSource = "targetDataSource";

	private static final ThreadLocal<String> contentHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customerType) {
		contentHolder.set(customerType);
	}

	public static String getCustomerType() {
		String source = contentHolder.get();
		if (StringUtils.isEmptyOrWhitespaceOnly(source)) {
			return defaultDataSource;
		} else {
			return targetDataSource;
		}
	}

}

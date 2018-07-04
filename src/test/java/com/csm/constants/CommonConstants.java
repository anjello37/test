package com.csm.constants;

import com.csm.utils.PropertyUtil;

public class CommonConstants {
	public static final int DEFAULT_WEBDRIVER_TIMEOUT = Integer.parseInt(PropertyUtil.getProp("src/test/resources/properties/config.properties", "webdriver.default.time"));
	public static final int DEFAULT_IMPLICIT_TIMEOUT = Integer.parseInt(PropertyUtil.getProp("src/test/resources/properties/config.properties", "implicit.default.time"));
	public static final String EXTENT_REPORT = PropertyUtil.getProp("src/test/resources/properties/config.properties", "reportConfigPath");

}

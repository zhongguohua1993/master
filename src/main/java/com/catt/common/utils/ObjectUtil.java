package com.catt.common.utils;

import java.util.List;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019/6/2
 */
public class ObjectUtil {
  public static boolean isEmpty(List list) {
    return list == null || list.isEmpty();
  }
}

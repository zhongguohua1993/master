package com.catt.eomsteam.lsdown.utils;

import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019/6/1
 */
public class RedisKeyUtil {
  /**
   * 获取任务列表缓存的key
   *
   * @param programType 任务类型 lsst,lsinst,send_req,do_req
   * @param ip 程序ip
   * @param programPath 程序路径
   * @return
   */
  public static String getTaskCacheKey(ProgramType programType, String ip, String programPath) {
    return String.format("TASK.%s.CACHE.%s.%s", programType.name(), ip, castPath(programPath));
  }

  public static String getTaskCacheRefreshKey() {
    return "TASK.CACHE.REFRESH";
  }

  public static String getTaskChannelKey(ProgramType programType, String ip, String programPath) {
    return String.format("TASK.%s.CHANNEL.%s.%s", programType.name(), ip, castPath(programPath));
  }

  /**
   * 转换文件路径分隔符为 "."。
   *
   * @param path
   * @return
   */
  private static String castPath(String path) {
    path = path.replaceAll("/", ".").replaceAll("\\\\", ".");
    if (path.charAt(0) == '.') path = path.substring(1);
    return path;
  }
}

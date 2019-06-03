package com.catt.common.utils;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019/6/1
 */
public class RedisKeyUtil {
  /**
   * 获取任务队列的key
   *
   * @param taskType 任务类型 lsst,lsinst,send_req,do_req
   * @param ip 程序ip
   * @param programPath 程序路径
   * @return
   */
  public static String getTaskQueueKey(String taskType, String ip, String programPath) {
    programPath = programPath.replaceAll("/", ".").replaceAll("\\\\", ".");
    if (programPath.charAt(0) == '.') programPath = programPath.substring(1);
    return String.format("TASK.%s.QUEUE.%s.%s", taskType, ip, programPath);
  }
}

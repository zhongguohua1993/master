package com.catt.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class SystemUtil {
  private static Logger logger = LoggerFactory.getLogger(SystemUtil.class);
  private static List<String> localIpList = null;

  public static List<String> getLocalIPList() {
    if (localIpList != null) return localIpList;
    List<String> ipList = new ArrayList<>();
    try {
      Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
      NetworkInterface networkInterface;
      Enumeration<InetAddress> inetAddresses;
      InetAddress inetAddress;
      String ip;
      while (networkInterfaces.hasMoreElements()) {
        networkInterface = networkInterfaces.nextElement();
        inetAddresses = networkInterface.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
          inetAddress = inetAddresses.nextElement();
          if (inetAddress instanceof Inet4Address) { // IPV4
            ip = inetAddress.getHostAddress();
            if (!"127.0.0.1".equals(ip)) ipList.add(ip);
          }
        }
      }
    } catch (SocketException e) {
      logger.error(e.getMessage());
    }
    localIpList = ipList;
    return ipList;
  }
}

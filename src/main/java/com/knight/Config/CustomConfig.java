package com.knight.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by forget on 2019/12/29.
 */
@Component
@ConfigurationProperties(prefix = "custom")
public class CustomConfig {

    private String ip;

    private int port;

    private String CollectDaySongName;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getCollectDaySongName() {
        return CollectDaySongName;
    }

    public void setCollectDaySongName(String collectDaySongName) {
        CollectDaySongName = collectDaySongName;
    }
}

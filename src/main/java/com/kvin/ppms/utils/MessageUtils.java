package com.kvin.ppms.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "messageUtils")
public class MessageUtils {

    private String sysErrorCode;
    private Map<String, String> messagesMap;

    public String getMsgByCode(String aCode) {
        if (aCode != null) {
            return messagesMap.get(aCode);
        }
        return null;
    }

    public String getSysErrorCode() {
        return sysErrorCode;
    }

    public void setSysErrorCode(String sysErrorCode) {
        this.sysErrorCode = sysErrorCode;
    }

    public String getSysErrorMessage() {
        return getMsgByCode(sysErrorCode);
    }

    public Map<String, String> getMessagesMap() {
        return messagesMap;
    }

    public void setMessagesMap(Map<String, String> messagesMap) {
        this.messagesMap = messagesMap;
    }
}

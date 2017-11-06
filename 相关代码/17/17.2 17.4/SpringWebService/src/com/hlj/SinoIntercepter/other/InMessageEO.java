package com.hlj.SinoIntercepter.other;

import java.util.Date;

public class InMessageEO {
    private String pkInMessage;

    private String pkMessageInfo;

    private String contextId;

    private String messageFrom;

    private String channel;

    private String inOutType;

    private String pkOutMessage;

    private String memo;

    private Date ts;

    private String respStatus;

    public String getPkInMessage() {
        return pkInMessage;
    }

    public void setPkInMessage(String pkInMessage) {
        this.pkInMessage = pkInMessage;
    }

    public String getPkMessageInfo() {
        return pkMessageInfo;
    }

    public void setPkMessageInfo(String pkMessageInfo) {
        this.pkMessageInfo = pkMessageInfo;
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getInOutType() {
        return inOutType;
    }

    public void setInOutType(String inOutType) {
        this.inOutType = inOutType;
    }

    public String getPkOutMessage() {
        return pkOutMessage;
    }

    public void setPkOutMessage(String pkOutMessage) {
        this.pkOutMessage = pkOutMessage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(String respStatus) {
        this.respStatus = respStatus;
    }
}
package com.hlj.SinoIntercepter.other;

import java.util.Date;

public class OutMessageEO {
    private String pkOutMessage;

    private String pkMessageInfo;

    private String contextId;

    private String messageTo;

    private String channel;

    private String inOutType;

    private String pkInMessage;

    private String respStatus;

    private String memo;

    private Date ts;

    public String getPkOutMessage() {
        return pkOutMessage;
    }

    public void setPkOutMessage(String pkOutMessage) {
        this.pkOutMessage = pkOutMessage;
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

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
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

    public String getPkInMessage() {
        return pkInMessage;
    }

    public void setPkInMessage(String pkInMessage) {
        this.pkInMessage = pkInMessage;
    }

    public String getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(String respStatus) {
        this.respStatus = respStatus;
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
}
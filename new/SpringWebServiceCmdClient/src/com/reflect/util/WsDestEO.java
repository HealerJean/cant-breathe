package com.reflect.util;

import java.util.Date;

public class WsDestEO {
    private String pkWsDest;

    private String destName;

    private String isActive;

    private String wsdlAddr;

    private String namespace;

    private String serviceName;

    private String portName;

    private String objFacy;

    private String userCode; 

    private String password;

    private String memo;

    private Date ts;

    public String getPkWsDest() {
        return pkWsDest;
    }

    
    
    public WsDestEO(String pkWsDest, String destName, String isActive,
			String wsdlAddr, String namespace, String serviceName,
			String portName, String objFacy, String userCode, String password,
			String memo, Date ts) {
		super();
		this.pkWsDest = pkWsDest;
		this.destName = destName;
		this.isActive = isActive;
		this.wsdlAddr = wsdlAddr;
		this.namespace = namespace;
		this.serviceName = serviceName;
		this.portName = portName;
		this.objFacy = objFacy;
		this.userCode = userCode;
		this.password = password;
		this.memo = memo;
		this.ts = ts;
	}



	public void setPkWsDest(String pkWsDest) {
        this.pkWsDest = pkWsDest;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getWsdlAddr() {
        return wsdlAddr;
    }

    public void setWsdlAddr(String wsdlAddr) {
        this.wsdlAddr = wsdlAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getObjFacy() {
        return objFacy;
    }

    public void setObjFacy(String objFacy) {
        this.objFacy = objFacy;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
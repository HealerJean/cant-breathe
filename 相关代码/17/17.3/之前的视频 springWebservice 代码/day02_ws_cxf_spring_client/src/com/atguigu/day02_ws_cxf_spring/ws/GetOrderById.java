
package com.atguigu.day02_ws_cxf_spring.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getOrderById complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getOrderById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderById", propOrder = {
    "arg0"
})
public class GetOrderById {

    protected int arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

}

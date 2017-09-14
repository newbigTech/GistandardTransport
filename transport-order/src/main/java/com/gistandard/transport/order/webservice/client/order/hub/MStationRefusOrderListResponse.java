
package com.gistandard.transport.order.webservice.client.order.hub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mStationRefusOrderListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="mStationRefusOrderListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mStationRefusOrderResultList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mStationRefusOrderListResponse", propOrder = {
    "mStationRefusOrderResultList"
})
public class MStationRefusOrderListResponse {

    protected String mStationRefusOrderResultList;

    /**
     * 获取mStationRefusOrderResultList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStationRefusOrderResultList() {
        return mStationRefusOrderResultList;
    }

    /**
     * 设置mStationRefusOrderResultList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStationRefusOrderResultList(String value) {
        this.mStationRefusOrderResultList = value;
    }

}

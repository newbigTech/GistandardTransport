
package com.gistandard.transport.order.webservice.client.order.hub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>refuseSchudeCarOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="refuseSchudeCarOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refuseSchudeCarOrderRequest" type="{http://order.server.mobilestation.webService.business.invent.valueplus.com/}giveUpSchudeCarOrderRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refuseSchudeCarOrder", propOrder = {
    "refuseSchudeCarOrderRequest"
})
public class RefuseSchudeCarOrder {

    protected GiveUpSchudeCarOrderRequest refuseSchudeCarOrderRequest;

    /**
     * 获取refuseSchudeCarOrderRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GiveUpSchudeCarOrderRequest }
     *     
     */
    public GiveUpSchudeCarOrderRequest getRefuseSchudeCarOrderRequest() {
        return refuseSchudeCarOrderRequest;
    }

    /**
     * 设置refuseSchudeCarOrderRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GiveUpSchudeCarOrderRequest }
     *     
     */
    public void setRefuseSchudeCarOrderRequest(GiveUpSchudeCarOrderRequest value) {
        this.refuseSchudeCarOrderRequest = value;
    }

}

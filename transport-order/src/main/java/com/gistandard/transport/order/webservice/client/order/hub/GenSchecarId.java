
package com.gistandard.transport.order.webservice.client.order.hub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>genSchecarId complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="genSchecarId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genSchecarIdRequest" type="{http://order.server.mobilestation.webService.business.invent.valueplus.com/}genSchecarIdRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genSchecarId", propOrder = {
    "genSchecarIdRequest"
})
public class GenSchecarId {

    protected GenSchecarIdRequest genSchecarIdRequest;

    /**
     * 获取genSchecarIdRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GenSchecarIdRequest }
     *     
     */
    public GenSchecarIdRequest getGenSchecarIdRequest() {
        return genSchecarIdRequest;
    }

    /**
     * 设置genSchecarIdRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GenSchecarIdRequest }
     *     
     */
    public void setGenSchecarIdRequest(GenSchecarIdRequest value) {
        this.genSchecarIdRequest = value;
    }

}

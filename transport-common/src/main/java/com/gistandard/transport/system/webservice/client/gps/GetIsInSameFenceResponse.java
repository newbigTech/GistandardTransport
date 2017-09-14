
package com.gistandard.transport.system.webservice.client.gps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getIsInSameFenceResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getIsInSameFenceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getIsInSameFenceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIsInSameFenceResponse", propOrder = {
    "getIsInSameFenceResult"
})
public class GetIsInSameFenceResponse {

    protected boolean getIsInSameFenceResult;

    /**
     * 获取getIsInSameFenceResult属性的值。
     * 
     */
    public boolean isGetIsInSameFenceResult() {
        return getIsInSameFenceResult;
    }

    /**
     * 设置getIsInSameFenceResult属性的值。
     * 
     */
    public void setGetIsInSameFenceResult(boolean value) {
        this.getIsInSameFenceResult = value;
    }

}

package com.gistandard.transport.order.webservice.client.merchant.settlement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-03-30T17:14:32.535+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebService(targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", name = "PreCalcManagerWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface PreCalcManagerWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "InsertPreCalc", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.valueplus.system.webservice.client.merchant.settlement.InsertPreCalc")
    @WebMethod(operationName = "InsertPreCalc")
    @ResponseWrapper(localName = "InsertPreCalcResponse", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.valueplus.system.webservice.client.merchant.settlement.InsertPreCalcResponse")
    public java.util.List<ReturnResultData> insertPreCalc(
            @WebParam(name = "arg0", targetNamespace = "")
            java.util.List<PreCalcModel> arg0
    ) throws Exception_Exception;


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "DeletePreCalc", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.valueplus.system.webservice.client.merchant.settlement.DeletePreCalc")
    @WebMethod(operationName = "DeletePreCalc")
    @ResponseWrapper(localName = "DeletePreCalcResponse", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.valueplus.system.webservice.client.merchant.settlement.DeletePreCalcResponse")
    java.util.List<ReturnResultData> DeletePreCalc(
            @WebParam(name = "arg0", targetNamespace = "")
            java.util.List<PreCalcModel> arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            String arg2
    ) throws Exception_Exception;
}

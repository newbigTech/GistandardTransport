package com.gistandard.transport.pay.webservice.generalAcct;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-08-11T16:15:53.536+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebService(targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", name = "GeneralAcctWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface GeneralAcctWebService {

    @WebResult(name = "queryMSInAndOut", targetNamespace = "")
    @RequestWrapper(localName = "queryMSInAndOut", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.gistandard.transport.pay.webservice.generalAcct.QueryMSInAndOut")
    @WebMethod
    @ResponseWrapper(localName = "queryMSInAndOutResponse", targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/", className = "com.gistandard.transport.pay.webservice.generalAcct.QueryMSInAndOutResponse")
    public String queryMSInAndOut(
            @WebParam(name = "gFUserCode", targetNamespace = "")
            String gFUserCode,
            @WebParam(name = "beginDate", targetNamespace = "")
            String beginDate,
            @WebParam(name = "endDate", targetNamespace = "")
            String endDate,
            @WebParam(name = "payFlag", targetNamespace = "")
            String payFlag,
            @WebParam(name = "startRecord", targetNamespace = "")
            int startRecord,
            @WebParam(name = "pageSize", targetNamespace = "")
            int pageSize
    );
}

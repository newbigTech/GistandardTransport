package com.gistandard.transport.pay.webservice.generalAcct;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-08-11T16:15:53.543+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "GeneralAcctWebServiceImplService", 
                  wsdlLocation = "http://172.16.2.164:8080/giifiCalcServer/WebService/GeneralAcctWebService?wsdl",
                  targetNamespace = "http://webService.external.giifiCalc.transport.gistandard.com/") 
public class GeneralAcctWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webService.external.giifiCalc.transport.gistandard.com/", "GeneralAcctWebServiceImplService");
    public final static QName GeneralAcctWebServiceImplPort = new QName("http://webService.external.giifiCalc.transport.gistandard.com/", "GeneralAcctWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://172.16.2.164:8080/giifiCalcServer/WebService/GeneralAcctWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GeneralAcctWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://172.16.2.164:8080/giifiCalcServer/WebService/GeneralAcctWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GeneralAcctWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GeneralAcctWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeneralAcctWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GeneralAcctWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GeneralAcctWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GeneralAcctWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GeneralAcctWebService
     */
    @WebEndpoint(name = "GeneralAcctWebServiceImplPort")
    public GeneralAcctWebService getGeneralAcctWebServiceImplPort() {
        return super.getPort(GeneralAcctWebServiceImplPort, GeneralAcctWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeneralAcctWebService
     */
    @WebEndpoint(name = "GeneralAcctWebServiceImplPort")
    public GeneralAcctWebService getGeneralAcctWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(GeneralAcctWebServiceImplPort, GeneralAcctWebService.class, features);
    }

}

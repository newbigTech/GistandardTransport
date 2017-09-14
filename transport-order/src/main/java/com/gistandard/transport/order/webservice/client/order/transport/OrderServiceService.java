package com.gistandard.transport.order.webservice.client.order.transport;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-08-24T10:20:27.820+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "OrderServiceService", 
                  wsdlLocation = "http://172.16.2.175:8098/HubPadServer/webServices/OrderService/com.gsct.HubPadServer.WebService.server.service.OrderService?wsdl",
                  targetNamespace = "http://service.server.WebService.HubPadServer.gsct.com/") 
public class OrderServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.server.WebService.HubPadServer.gsct.com/", "OrderServiceService");
    public final static QName OrderServicePort = new QName("http://service.server.WebService.HubPadServer.gsct.com/", "OrderServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://172.16.2.175:8098/HubPadServer/webServices/OrderService/com.gsct.HubPadServer.WebService.server.service.OrderService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://172.16.2.175:8098/HubPadServer/webServices/OrderService/com.gsct.HubPadServer.WebService.server.service.OrderService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OrderServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServicePort")
    public OrderService getOrderServicePort() {
        return super.getPort(OrderServicePort, OrderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServicePort")
    public OrderService getOrderServicePort(WebServiceFeature... features) {
        return super.getPort(OrderServicePort, OrderService.class, features);
    }

}
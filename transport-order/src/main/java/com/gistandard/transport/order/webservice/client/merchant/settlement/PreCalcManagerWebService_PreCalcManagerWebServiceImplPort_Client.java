
package com.gistandard.transport.order.webservice.client.merchant.settlement;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-03-30T17:14:32.496+08:00
 * Generated source version: 3.1.2
 * 
 */
public final class PreCalcManagerWebService_PreCalcManagerWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webService.external.giifiCalc.transport.gistandard.com/", "PreCalcManagerWebServiceImplService");

    private PreCalcManagerWebService_PreCalcManagerWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PreCalcManagerWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        PreCalcManagerWebServiceImplService ss = new PreCalcManagerWebServiceImplService(wsdlURL, SERVICE_NAME);
        PreCalcManagerWebService port = ss.getPreCalcManagerWebServiceImplPort();  
        
        {
        System.out.println("Invoking insertPreCalc...");
        java.util.List<PreCalcModel> _insertPreCalc_arg0 = null;
        try {
            java.util.List<ReturnResultData> _insertPreCalc__return = port.insertPreCalc(_insertPreCalc_arg0);
            System.out.println("insertPreCalc.result=" + _insertPreCalc__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
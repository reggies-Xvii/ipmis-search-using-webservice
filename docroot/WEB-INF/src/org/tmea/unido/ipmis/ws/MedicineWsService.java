
package org.tmea.unido.ipmis.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MedicineWsService", targetNamespace = "http://ws.ipmis.unido.tmea.org/", wsdlLocation = "http://localhost:8081/ipmis/ws?wsdl")
public class MedicineWsService
    extends Service
{

    private final static URL MEDICINEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException MEDICINEWSSERVICE_EXCEPTION;
    private final static QName MEDICINEWSSERVICE_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "MedicineWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/ipmis/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDICINEWSSERVICE_WSDL_LOCATION = url;
        MEDICINEWSSERVICE_EXCEPTION = e;
    }

    public MedicineWsService() {
        super(__getWsdlLocation(), MEDICINEWSSERVICE_QNAME);
    }

    public MedicineWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDICINEWSSERVICE_QNAME, features);
    }

    public MedicineWsService(URL wsdlLocation) {
        super(wsdlLocation, MEDICINEWSSERVICE_QNAME);
    }

    public MedicineWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDICINEWSSERVICE_QNAME, features);
    }

    public MedicineWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MedicineWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MedicineWs
     */
    @WebEndpoint(name = "MedicineWsPort")
    public MedicineWs getMedicineWsPort() {
        return super.getPort(new QName("http://ws.ipmis.unido.tmea.org/", "MedicineWsPort"), MedicineWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MedicineWs
     */
    @WebEndpoint(name = "MedicineWsPort")
    public MedicineWs getMedicineWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.ipmis.unido.tmea.org/", "MedicineWsPort"), MedicineWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDICINEWSSERVICE_EXCEPTION!= null) {
            throw MEDICINEWSSERVICE_EXCEPTION;
        }
        return MEDICINEWSSERVICE_WSDL_LOCATION;
    }

}
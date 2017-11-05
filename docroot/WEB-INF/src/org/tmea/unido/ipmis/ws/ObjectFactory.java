
package org.tmea.unido.ipmis.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmea.unido.ipmis.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSearchResult_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getSearchResult");
    private final static QName _GetTestListString_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getTestListString");
    private final static QName _GetTestStringResponse_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getTestStringResponse");
    private final static QName _GetAllMedicine_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getAllMedicine");
    private final static QName _GetTestListStringResponse_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getTestListStringResponse");
    private final static QName _GetTestString_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getTestString");
    private final static QName _GetAllMedicineResponse_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getAllMedicineResponse");
    private final static QName _GetSearchResultResponse_QNAME = new QName("http://ws.ipmis.unido.tmea.org/", "getSearchResultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmea.unido.ipmis.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSearchResultResponse }
     * 
     */
    public GetSearchResultResponse createGetSearchResultResponse() {
        return new GetSearchResultResponse();
    }

    /**
     * Create an instance of {@link GetAllMedicineResponse }
     * 
     */
    public GetAllMedicineResponse createGetAllMedicineResponse() {
        return new GetAllMedicineResponse();
    }

    /**
     * Create an instance of {@link GetTestString }
     * 
     */
    public GetTestString createGetTestString() {
        return new GetTestString();
    }

    /**
     * Create an instance of {@link GetAllMedicine }
     * 
     */
    public GetAllMedicine createGetAllMedicine() {
        return new GetAllMedicine();
    }

    /**
     * Create an instance of {@link GetTestListStringResponse }
     * 
     */
    public GetTestListStringResponse createGetTestListStringResponse() {
        return new GetTestListStringResponse();
    }

    /**
     * Create an instance of {@link GetSearchResult }
     * 
     */
    public GetSearchResult createGetSearchResult() {
        return new GetSearchResult();
    }

    /**
     * Create an instance of {@link GetTestListString }
     * 
     */
    public GetTestListString createGetTestListString() {
        return new GetTestListString();
    }

    /**
     * Create an instance of {@link GetTestStringResponse }
     * 
     */
    public GetTestStringResponse createGetTestStringResponse() {
        return new GetTestStringResponse();
    }

    /**
     * Create an instance of {@link Medicine }
     * 
     */
    public Medicine createMedicine() {
        return new Medicine();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getSearchResult")
    public JAXBElement<GetSearchResult> createGetSearchResult(GetSearchResult value) {
        return new JAXBElement<GetSearchResult>(_GetSearchResult_QNAME, GetSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestListString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getTestListString")
    public JAXBElement<GetTestListString> createGetTestListString(GetTestListString value) {
        return new JAXBElement<GetTestListString>(_GetTestListString_QNAME, GetTestListString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getTestStringResponse")
    public JAXBElement<GetTestStringResponse> createGetTestStringResponse(GetTestStringResponse value) {
        return new JAXBElement<GetTestStringResponse>(_GetTestStringResponse_QNAME, GetTestStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getAllMedicine")
    public JAXBElement<GetAllMedicine> createGetAllMedicine(GetAllMedicine value) {
        return new JAXBElement<GetAllMedicine>(_GetAllMedicine_QNAME, GetAllMedicine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestListStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getTestListStringResponse")
    public JAXBElement<GetTestListStringResponse> createGetTestListStringResponse(GetTestListStringResponse value) {
        return new JAXBElement<GetTestListStringResponse>(_GetTestListStringResponse_QNAME, GetTestListStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getTestString")
    public JAXBElement<GetTestString> createGetTestString(GetTestString value) {
        return new JAXBElement<GetTestString>(_GetTestString_QNAME, GetTestString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMedicineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getAllMedicineResponse")
    public JAXBElement<GetAllMedicineResponse> createGetAllMedicineResponse(GetAllMedicineResponse value) {
        return new JAXBElement<GetAllMedicineResponse>(_GetAllMedicineResponse_QNAME, GetAllMedicineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ipmis.unido.tmea.org/", name = "getSearchResultResponse")
    public JAXBElement<GetSearchResultResponse> createGetSearchResultResponse(GetSearchResultResponse value) {
        return new JAXBElement<GetSearchResultResponse>(_GetSearchResultResponse_QNAME, GetSearchResultResponse.class, null, value);
    }

}

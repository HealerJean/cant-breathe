
package com.hlj.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hlj.client package. 
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

    private final static QName _ReceiveOARequestFromTransferResponse_QNAME = new QName("http://healerjean/", "receiveOARequestFromTransferResponse");
    private final static QName _GetReturnMapResponse_QNAME = new QName("http://healerjean/", "getReturnMapResponse");
    private final static QName _GetReturnMap_QNAME = new QName("http://healerjean/", "getReturnMap");
    private final static QName _SetMapParam_QNAME = new QName("http://healerjean/", "setMapParam");
    private final static QName _SetMapParamResponse_QNAME = new QName("http://healerjean/", "setMapParamResponse");
    private final static QName _ReceiveOARequestFromTransfer_QNAME = new QName("http://healerjean/", "receiveOARequestFromTransfer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hlj.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapConvertor }
     * 
     */
    public MapConvertor createMapConvertor() {
        return new MapConvertor();
    }

    /**
     * Create an instance of {@link ReceiveOARequestFromTransferResponse }
     * 
     */
    public ReceiveOARequestFromTransferResponse createReceiveOARequestFromTransferResponse() {
        return new ReceiveOARequestFromTransferResponse();
    }

    /**
     * Create an instance of {@link GetReturnMapResponse }
     * 
     */
    public GetReturnMapResponse createGetReturnMapResponse() {
        return new GetReturnMapResponse();
    }

    /**
     * Create an instance of {@link SetMapParamResponse }
     * 
     */
    public SetMapParamResponse createSetMapParamResponse() {
        return new SetMapParamResponse();
    }

    /**
     * Create an instance of {@link SetMapParam }
     * 
     */
    public SetMapParam createSetMapParam() {
        return new SetMapParam();
    }

    /**
     * Create an instance of {@link ReceiveOARequestFromTransfer }
     * 
     */
    public ReceiveOARequestFromTransfer createReceiveOARequestFromTransfer() {
        return new ReceiveOARequestFromTransfer();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link GetReturnMap }
     * 
     */
    public GetReturnMap createGetReturnMap() {
        return new GetReturnMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveOARequestFromTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "receiveOARequestFromTransferResponse")
    public JAXBElement<ReceiveOARequestFromTransferResponse> createReceiveOARequestFromTransferResponse(ReceiveOARequestFromTransferResponse value) {
        return new JAXBElement<ReceiveOARequestFromTransferResponse>(_ReceiveOARequestFromTransferResponse_QNAME, ReceiveOARequestFromTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "getReturnMapResponse")
    public JAXBElement<GetReturnMapResponse> createGetReturnMapResponse(GetReturnMapResponse value) {
        return new JAXBElement<GetReturnMapResponse>(_GetReturnMapResponse_QNAME, GetReturnMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "getReturnMap")
    public JAXBElement<GetReturnMap> createGetReturnMap(GetReturnMap value) {
        return new JAXBElement<GetReturnMap>(_GetReturnMap_QNAME, GetReturnMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMapParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "setMapParam")
    public JAXBElement<SetMapParam> createSetMapParam(SetMapParam value) {
        return new JAXBElement<SetMapParam>(_SetMapParam_QNAME, SetMapParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMapParamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "setMapParamResponse")
    public JAXBElement<SetMapParamResponse> createSetMapParamResponse(SetMapParamResponse value) {
        return new JAXBElement<SetMapParamResponse>(_SetMapParamResponse_QNAME, SetMapParamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveOARequestFromTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healerjean/", name = "receiveOARequestFromTransfer")
    public JAXBElement<ReceiveOARequestFromTransfer> createReceiveOARequestFromTransfer(ReceiveOARequestFromTransfer value) {
        return new JAXBElement<ReceiveOARequestFromTransfer>(_ReceiveOARequestFromTransfer_QNAME, ReceiveOARequestFromTransfer.class, null, value);
    }

}

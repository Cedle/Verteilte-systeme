
package priceservice.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the priceservice.gen package. 
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

    private final static QName _GetExchangeRate_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getExchangeRate");
    private final static QName _GetPriceResponse_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getPriceResponse");
    private final static QName _GetExchangeRateResponse_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getExchangeRateResponse");
    private final static QName _GetPrice_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getPrice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: priceservice.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getExchangeRate")
    public JAXBElement<GetExchangeRate> createGetExchangeRate(GetExchangeRate value) {
        return new JAXBElement<GetExchangeRate>(_GetExchangeRate_QNAME, GetExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getExchangeRateResponse")
    public JAXBElement<GetExchangeRateResponse> createGetExchangeRateResponse(GetExchangeRateResponse value) {
        return new JAXBElement<GetExchangeRateResponse>(_GetExchangeRateResponse_QNAME, GetExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

}

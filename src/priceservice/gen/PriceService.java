
package priceservice.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PriceService", targetNamespace = "http://semesterarbeit.wi.mbg.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PriceService {


    /**
     * 
     * @param currency
     * @param isin
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrice", targetNamespace = "http://semesterarbeit.wi.mbg.de/", className = "priceservice.gen.GetPrice")
    @ResponseWrapper(localName = "getPriceResponse", targetNamespace = "http://semesterarbeit.wi.mbg.de/", className = "priceservice.gen.GetPriceResponse")
    @Action(input = "http://semesterarbeit.wi.mbg.de/PriceService/getPriceRequest", output = "http://semesterarbeit.wi.mbg.de/PriceService/getPriceResponse")
    public double getPrice(
        @WebParam(name = "isin", targetNamespace = "")
        String isin,
        @WebParam(name = "currency", targetNamespace = "")
        String currency);

    /**
     * 
     * @param currencyTo
     * @param currencyFrom
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExchangeRate", targetNamespace = "http://semesterarbeit.wi.mbg.de/", className = "priceservice.gen.GetExchangeRate")
    @ResponseWrapper(localName = "getExchangeRateResponse", targetNamespace = "http://semesterarbeit.wi.mbg.de/", className = "priceservice.gen.GetExchangeRateResponse")
    @Action(input = "http://semesterarbeit.wi.mbg.de/PriceService/getExchangeRateRequest", output = "http://semesterarbeit.wi.mbg.de/PriceService/getExchangeRateResponse")
    public double getExchangeRate(
        @WebParam(name = "currencyFrom", targetNamespace = "")
        String currencyFrom,
        @WebParam(name = "currencyTo", targetNamespace = "")
        String currencyTo);

}

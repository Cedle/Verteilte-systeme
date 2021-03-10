
package depotservice.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the depotservice.gen package. 
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

    private final static QName _GetDepot_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getDepot");
    private final static QName _GetDepotResponse_QNAME = new QName("http://semesterarbeit.wi.mbg.de/", "getDepotResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: depotservice.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDepot }
     * 
     */
    public GetDepot createGetDepot() {
        return new GetDepot();
    }

    /**
     * Create an instance of {@link GetDepotResponse }
     * 
     */
    public GetDepotResponse createGetDepotResponse() {
        return new GetDepotResponse();
    }

    /**
     * Create an instance of {@link Depot }
     * 
     */
    public Depot createDepot() {
        return new Depot();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getDepot")
    public JAXBElement<GetDepot> createGetDepot(GetDepot value) {
        return new JAXBElement<GetDepot>(_GetDepot_QNAME, GetDepot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit.wi.mbg.de/", name = "getDepotResponse")
    public JAXBElement<GetDepotResponse> createGetDepotResponse(GetDepotResponse value) {
        return new JAXBElement<GetDepotResponse>(_GetDepotResponse_QNAME, GetDepotResponse.class, null, value);
    }

}

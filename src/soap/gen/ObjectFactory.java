
package soap.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.gen package. 
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

    private final static QName _DeleteMitarbeiter_QNAME = new QName("http://Mitarbeiter/", "deleteMitarbeiter");
    private final static QName _GetAllMitarbeiter_QNAME = new QName("http://Mitarbeiter/", "getAllMitarbeiter");
    private final static QName _GetMitarbeiterResponse_QNAME = new QName("http://Mitarbeiter/", "getMitarbeiterResponse");
    private final static QName _GetAllMitarbeiterResponse_QNAME = new QName("http://Mitarbeiter/", "getAllMitarbeiterResponse");
    private final static QName _AddMitarbeiterResponse_QNAME = new QName("http://Mitarbeiter/", "addMitarbeiterResponse");
    private final static QName _GetMitarbeiter_QNAME = new QName("http://Mitarbeiter/", "getMitarbeiter");
    private final static QName _RemoveAll_QNAME = new QName("http://Mitarbeiter/", "removeAll");
    private final static QName _DeleteMitarbeiterResponse_QNAME = new QName("http://Mitarbeiter/", "deleteMitarbeiterResponse");
    private final static QName _RemoveAllResponse_QNAME = new QName("http://Mitarbeiter/", "removeAllResponse");
    private final static QName _AddMitarbeiter_QNAME = new QName("http://Mitarbeiter/", "addMitarbeiter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllMitarbeiter }
     * 
     */
    public GetAllMitarbeiter createGetAllMitarbeiter() {
        return new GetAllMitarbeiter();
    }

    /**
     * Create an instance of {@link GetMitarbeiterResponse }
     * 
     */
    public GetMitarbeiterResponse createGetMitarbeiterResponse() {
        return new GetMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link GetAllMitarbeiterResponse }
     * 
     */
    public GetAllMitarbeiterResponse createGetAllMitarbeiterResponse() {
        return new GetAllMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link AddMitarbeiterResponse }
     * 
     */
    public AddMitarbeiterResponse createAddMitarbeiterResponse() {
        return new AddMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link GetMitarbeiter }
     * 
     */
    public GetMitarbeiter createGetMitarbeiter() {
        return new GetMitarbeiter();
    }

    /**
     * Create an instance of {@link RemoveAll }
     * 
     */
    public RemoveAll createRemoveAll() {
        return new RemoveAll();
    }

    /**
     * Create an instance of {@link DeleteMitarbeiter }
     * 
     */
    public DeleteMitarbeiter createDeleteMitarbeiter() {
        return new DeleteMitarbeiter();
    }

    /**
     * Create an instance of {@link DeleteMitarbeiterResponse }
     * 
     */
    public DeleteMitarbeiterResponse createDeleteMitarbeiterResponse() {
        return new DeleteMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link RemoveAllResponse }
     * 
     */
    public RemoveAllResponse createRemoveAllResponse() {
        return new RemoveAllResponse();
    }

    /**
     * Create an instance of {@link AddMitarbeiter }
     * 
     */
    public AddMitarbeiter createAddMitarbeiter() {
        return new AddMitarbeiter();
    }

    /**
     * Create an instance of {@link Mitarbeiter }
     * 
     */
    public Mitarbeiter createMitarbeiter() {
        return new Mitarbeiter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "deleteMitarbeiter")
    public JAXBElement<DeleteMitarbeiter> createDeleteMitarbeiter(DeleteMitarbeiter value) {
        return new JAXBElement<DeleteMitarbeiter>(_DeleteMitarbeiter_QNAME, DeleteMitarbeiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "getAllMitarbeiter")
    public JAXBElement<GetAllMitarbeiter> createGetAllMitarbeiter(GetAllMitarbeiter value) {
        return new JAXBElement<GetAllMitarbeiter>(_GetAllMitarbeiter_QNAME, GetAllMitarbeiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "getMitarbeiterResponse")
    public JAXBElement<GetMitarbeiterResponse> createGetMitarbeiterResponse(GetMitarbeiterResponse value) {
        return new JAXBElement<GetMitarbeiterResponse>(_GetMitarbeiterResponse_QNAME, GetMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "getAllMitarbeiterResponse")
    public JAXBElement<GetAllMitarbeiterResponse> createGetAllMitarbeiterResponse(GetAllMitarbeiterResponse value) {
        return new JAXBElement<GetAllMitarbeiterResponse>(_GetAllMitarbeiterResponse_QNAME, GetAllMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "addMitarbeiterResponse")
    public JAXBElement<AddMitarbeiterResponse> createAddMitarbeiterResponse(AddMitarbeiterResponse value) {
        return new JAXBElement<AddMitarbeiterResponse>(_AddMitarbeiterResponse_QNAME, AddMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "getMitarbeiter")
    public JAXBElement<GetMitarbeiter> createGetMitarbeiter(GetMitarbeiter value) {
        return new JAXBElement<GetMitarbeiter>(_GetMitarbeiter_QNAME, GetMitarbeiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "removeAll")
    public JAXBElement<RemoveAll> createRemoveAll(RemoveAll value) {
        return new JAXBElement<RemoveAll>(_RemoveAll_QNAME, RemoveAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "deleteMitarbeiterResponse")
    public JAXBElement<DeleteMitarbeiterResponse> createDeleteMitarbeiterResponse(DeleteMitarbeiterResponse value) {
        return new JAXBElement<DeleteMitarbeiterResponse>(_DeleteMitarbeiterResponse_QNAME, DeleteMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "removeAllResponse")
    public JAXBElement<RemoveAllResponse> createRemoveAllResponse(RemoveAllResponse value) {
        return new JAXBElement<RemoveAllResponse>(_RemoveAllResponse_QNAME, RemoveAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mitarbeiter/", name = "addMitarbeiter")
    public JAXBElement<AddMitarbeiter> createAddMitarbeiter(AddMitarbeiter value) {
        return new JAXBElement<AddMitarbeiter>(_AddMitarbeiter_QNAME, AddMitarbeiter.class, null, value);
    }

}


package https.paysecure.merchant_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.paysecure.merchant_soap package. 
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

    private final static QName _RequestorCredentials_QNAME = new QName("https://paysecure/merchant.soap.header/", "RequestorCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.paysecure.merchant_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestorCredentials }
     * 
     */
    public RequestorCredentials createRequestorCredentials() {
        return new RequestorCredentials();
    }

    /**
     * Create an instance of {@link UserIdPassword }
     * 
     */
    public UserIdPassword createUserIdPassword() {
        return new UserIdPassword();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestorCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://paysecure/merchant.soap.header/", name = "RequestorCredentials")
    public JAXBElement<RequestorCredentials> createRequestorCredentials(RequestorCredentials value) {
        return new JAXBElement<RequestorCredentials>(_RequestorCredentials_QNAME, RequestorCredentials.class, null, value);
    }

}

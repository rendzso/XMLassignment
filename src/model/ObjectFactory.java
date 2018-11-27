
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
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

    private final static QName _Etterem_QNAME = new QName("", "Etterem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EtteremTipus }
     * 
     */
    public EtteremTipus createEtteremTipus() {
        return new EtteremTipus();
    }

    /**
     * Create an instance of {@link AutoTipus }
     * 
     */
    public AutoTipus createAutoTipus() {
        return new AutoTipus();
    }

    /**
     * Create an instance of {@link FutarTipus }
     * 
     */
    public FutarTipus createFutarTipus() {
        return new FutarTipus();
    }

    /**
     * Create an instance of {@link HelyTipus }
     * 
     */
    public HelyTipus createHelyTipus() {
        return new HelyTipus();
    }

    /**
     * Create an instance of {@link EmbernevTipus }
     * 
     */
    public EmbernevTipus createEmbernevTipus() {
        return new EmbernevTipus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtteremTipus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Etterem")
    public JAXBElement<EtteremTipus> createEtterem(EtteremTipus value) {
        return new JAXBElement<EtteremTipus>(_Etterem_QNAME, EtteremTipus.class, null, value);
    }

}

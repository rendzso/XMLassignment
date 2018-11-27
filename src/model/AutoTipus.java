
package model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Auto_tipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auto_tipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Tipus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rendszam" type="{}Rendszam_tipus"/>
 *         &lt;element name="Evjarat" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Szin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *       &lt;attribute name="AutoID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auto_tipus", propOrder = {

})
public class AutoTipus {

    @XmlElement(name = "Tipus", required = true)
    protected String tipus;
    @XmlElement(name = "Rendszam", required = true)
    protected String rendszam;
    @XmlElement(name = "Evjarat", required = true)
    protected int evjarat;
    @XmlElement(name = "Szin", required = true)
    protected String szin;
    @XmlAttribute(name = "AutoID", required = true)
    protected int autoID;

    /**
     * Gets the value of the tipus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipus() {
        return tipus;
    }

    /**
     * Sets the value of the tipus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipus(String value) {
        this.tipus = value;
    }

    /**
     * Gets the value of the rendszam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendszam() {
        return rendszam;
    }

    /**
     * Sets the value of the rendszam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendszam(String value) {
        this.rendszam = value;
    }

    /**
     * Gets the value of the evjarat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getEvjarat() {
        return evjarat;
    }

    /**
     * Sets the value of the evjarat property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvjarat(int value) {
        this.evjarat = value;
    }

    /**
     * Gets the value of the szin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzin() {
        return szin;
    }

    /**
     * Sets the value of the szin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzin(String value) {
        this.szin = value;
    }

    /**
     * Gets the value of the autoID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getAutoID() {
        return autoID;
    }

    /**
     * Sets the value of the autoID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutoID(int value) {
        this.autoID = value;
    }

}

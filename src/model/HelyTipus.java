
package model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hely_tipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hely_tipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Iranyitoszam" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Varos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Utca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hazszam" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hely_tipus", propOrder = {

})
public class HelyTipus {

    @XmlElement(name = "Iranyitoszam", required = true)
    protected int iranyitoszam;
    @XmlElement(name = "Varos", required = true)
    protected String varos;
    @XmlElement(name = "Utca", required = true)
    protected String utca;
    @XmlElement(name = "Hazszam", required = true)
    protected int hazszam;

    /**
     * Gets the value of the iranyitoszam property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getIranyitoszam() {
        return iranyitoszam;
    }

    /**
     * Sets the value of the iranyitoszam property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIranyitoszam(int value) {
        this.iranyitoszam = value;
    }

    /**
     * Gets the value of the varos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaros() {
        return varos;
    }

    /**
     * Sets the value of the varos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaros(String value) {
        this.varos = value;
    }

    /**
     * Gets the value of the utca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtca() {
        return utca;
    }

    /**
     * Sets the value of the utca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtca(String value) {
        this.utca = value;
    }

    /**
     * Gets the value of the hazszam property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getHazszam() {
        return hazszam;
    }

    /**
     * Sets the value of the hazszam property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHazszam(int value) {
        this.hazszam = value;
    }

}

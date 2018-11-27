
package model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Futar_tipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Futar_tipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nev" type="{}Embernev_tipus"/>
 *         &lt;element name="Kor" type="{}Kor_tipus"/>
 *       &lt;/all>
 *       &lt;attribute name="FutarID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MunkaAutoID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Futar_tipus", propOrder = {

})
public class FutarTipus {

    @XmlElement(name = "Nev", required = true)
    protected EmbernevTipus nev;
    @XmlElement(name = "Kor")
    @XmlSchemaType(name = "integer")
    protected int kor;
    @XmlAttribute(name = "FutarID", required = true)
    protected int futarID;
    @XmlAttribute(name = "MunkaAutoID", required = true)
    protected int munkaAutoID;

    /**
     * Gets the value of the nev property.
     * 
     * @return
     *     possible object is
     *     {@link EmbernevTipus }
     *     
     */
    public EmbernevTipus getNev() {
        return nev;
    }

    /**
     * Sets the value of the nev property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbernevTipus }
     *     
     */
    public void setNev(EmbernevTipus value) {
        this.nev = value;
    }

    /**
     * Gets the value of the kor property.
     * 
     */
    public int getKor() {
        return kor;
    }

    /**
     * Sets the value of the kor property.
     * 
     */
    public void setKor(int value) {
        this.kor = value;
    }

    /**
     * Gets the value of the futarID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getFutarID() {
        return futarID;
    }

    /**
     * Sets the value of the futarID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFutarID(int value) {
        this.futarID = value;
    }

    /**
     * Gets the value of the munkaAutoID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getMunkaAutoID() {
        return munkaAutoID;
    }

    /**
     * Sets the value of the munkaAutoID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunkaAutoID(int value) {
        this.munkaAutoID = value;
    }

}

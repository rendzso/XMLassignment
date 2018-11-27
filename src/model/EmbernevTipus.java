
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Embernev_tipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Embernev_tipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vezeteknev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Keresztnev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Embernev_tipus", propOrder = {
    "vezeteknev",
    "keresztnev"
})
public class EmbernevTipus {

    @XmlElement(name = "Vezeteknev", required = true)
    protected String vezeteknev;
    @XmlElement(name = "Keresztnev", required = true)
    protected String keresztnev;

    /**
     * Gets the value of the vezeteknev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVezeteknev() {
        return vezeteknev;
    }

    /**
     * Sets the value of the vezeteknev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVezeteknev(String value) {
        this.vezeteknev = value;
    }

    /**
     * Gets the value of the keresztnev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeresztnev() {
        return keresztnev;
    }

    /**
     * Sets the value of the keresztnev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeresztnev(String value) {
        this.keresztnev = value;
    }

}

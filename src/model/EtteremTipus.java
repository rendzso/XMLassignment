
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Etterem_tipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Etterem_tipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hely" type="{}Hely_tipus"/>
 *         &lt;element name="Futar" type="{}Futar_tipus" maxOccurs="unbounded"/>
 *         &lt;element name="Auto" type="{}Auto_tipus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="Etterem")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Etterem_tipus", propOrder = {
    "nev",
    "hely",
    "futar",
    "auto"
})
public class EtteremTipus {

    @XmlElement(name = "Nev", required = true)
    protected String nev;
    @XmlElement(name = "Hely", required = true)
    protected HelyTipus hely;
    @XmlElement(name = "Futar", required = true)
    protected List<FutarTipus> futar;
    @XmlElement(name = "Auto", required = true)
    protected List<AutoTipus> auto;

    /**
     * Gets the value of the nev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNev() {
        return nev;
    }

    /**
     * Sets the value of the nev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNev(String value) {
        this.nev = value;
    }

    /**
     * Gets the value of the hely property.
     * 
     * @return
     *     possible object is
     *     {@link HelyTipus }
     *     
     */
    public HelyTipus getHely() {
        return hely;
    }

    /**
     * Sets the value of the hely property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelyTipus }
     *     
     */
    public void setHely(HelyTipus value) {
        this.hely = value;
    }

    /**
     * Gets the value of the futar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FutarTipus }
     * 
     * 
     */
    public List<FutarTipus> getFutar() {
        if (futar == null) {
            futar = new ArrayList<FutarTipus>();
        }
        return this.futar;
    }

    /**
     * Gets the value of the auto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoTipus }
     * 
     * 
     */
    public List<AutoTipus> getAuto() {
        if (auto == null) {
            auto = new ArrayList<AutoTipus>();
        }
        return this.auto;
    }

}

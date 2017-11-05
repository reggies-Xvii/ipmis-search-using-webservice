
package org.tmea.unido.ipmis.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="intendedUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicine", propOrder = {
    "genericName",
    "id",
    "intendedUse",
    "localAgent",
    "manufacturer",
    "productTradeName"
})
public class Medicine {

    protected String genericName;
    protected long id;
    protected String intendedUse;
    protected String localAgent;
    protected String manufacturer;
    protected String productTradeName;

    /**
     * Gets the value of the genericName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericName() {
        return genericName;
    }

    /**
     * Sets the value of the genericName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericName(String value) {
        this.genericName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the intendedUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedUse() {
        return intendedUse;
    }

    /**
     * Sets the value of the intendedUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedUse(String value) {
        this.intendedUse = value;
    }

    /**
     * Gets the value of the localAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAgent() {
        return localAgent;
    }

    /**
     * Sets the value of the localAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAgent(String value) {
        this.localAgent = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the productTradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTradeName() {
        return productTradeName;
    }

    /**
     * Sets the value of the productTradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTradeName(String value) {
        this.productTradeName = value;
    }

}

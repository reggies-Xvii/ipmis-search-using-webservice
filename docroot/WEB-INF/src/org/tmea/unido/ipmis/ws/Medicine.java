
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
 *         &lt;element name="atcCodeLevelFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelFourDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelOneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelThreeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atcCodeLevelTwoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genericName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="intendedUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nfcCodeThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nfcCodeThreeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "atcCodeLevelFour",
    "atcCodeLevelFourDescription",
    "atcCodeLevelOne",
    "atcCodeLevelOneDescription",
    "atcCodeLevelThree",
    "atcCodeLevelThreeDescription",
    "atcCodeLevelTwo",
    "atcCodeLevelTwoDescription",
    "countryOfOrigin",
    "countryRegistered",
    "genericName",
    "id",
    "intendedUse",
    "localAgent",
    "manufacturer",
    "nfcCodeThree",
    "nfcCodeThreeDescription",
    "productTradeName",
    "strength"
})
public class Medicine {

    protected String atcCodeLevelFour;
    protected String atcCodeLevelFourDescription;
    protected String atcCodeLevelOne;
    protected String atcCodeLevelOneDescription;
    protected String atcCodeLevelThree;
    protected String atcCodeLevelThreeDescription;
    protected String atcCodeLevelTwo;
    protected String atcCodeLevelTwoDescription;
    protected String countryOfOrigin;
    protected String countryRegistered;
    protected String genericName;
    protected long id;
    protected String intendedUse;
    protected String localAgent;
    protected String manufacturer;
    protected String nfcCodeThree;
    protected String nfcCodeThreeDescription;
    protected String productTradeName;
    protected String strength;

    /**
     * Gets the value of the atcCodeLevelFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelFour() {
        return atcCodeLevelFour;
    }

    /**
     * Sets the value of the atcCodeLevelFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelFour(String value) {
        this.atcCodeLevelFour = value;
    }

    /**
     * Gets the value of the atcCodeLevelFourDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelFourDescription() {
        return atcCodeLevelFourDescription;
    }

    /**
     * Sets the value of the atcCodeLevelFourDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelFourDescription(String value) {
        this.atcCodeLevelFourDescription = value;
    }

    /**
     * Gets the value of the atcCodeLevelOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelOne() {
        return atcCodeLevelOne;
    }

    /**
     * Sets the value of the atcCodeLevelOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelOne(String value) {
        this.atcCodeLevelOne = value;
    }

    /**
     * Gets the value of the atcCodeLevelOneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelOneDescription() {
        return atcCodeLevelOneDescription;
    }

    /**
     * Sets the value of the atcCodeLevelOneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelOneDescription(String value) {
        this.atcCodeLevelOneDescription = value;
    }

    /**
     * Gets the value of the atcCodeLevelThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelThree() {
        return atcCodeLevelThree;
    }

    /**
     * Sets the value of the atcCodeLevelThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelThree(String value) {
        this.atcCodeLevelThree = value;
    }

    /**
     * Gets the value of the atcCodeLevelThreeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelThreeDescription() {
        return atcCodeLevelThreeDescription;
    }

    /**
     * Sets the value of the atcCodeLevelThreeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelThreeDescription(String value) {
        this.atcCodeLevelThreeDescription = value;
    }

    /**
     * Gets the value of the atcCodeLevelTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelTwo() {
        return atcCodeLevelTwo;
    }

    /**
     * Sets the value of the atcCodeLevelTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelTwo(String value) {
        this.atcCodeLevelTwo = value;
    }

    /**
     * Gets the value of the atcCodeLevelTwoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcCodeLevelTwoDescription() {
        return atcCodeLevelTwoDescription;
    }

    /**
     * Sets the value of the atcCodeLevelTwoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcCodeLevelTwoDescription(String value) {
        this.atcCodeLevelTwoDescription = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the countryRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegistered() {
        return countryRegistered;
    }

    /**
     * Sets the value of the countryRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegistered(String value) {
        this.countryRegistered = value;
    }

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
     * Gets the value of the nfcCodeThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcCodeThree() {
        return nfcCodeThree;
    }

    /**
     * Sets the value of the nfcCodeThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcCodeThree(String value) {
        this.nfcCodeThree = value;
    }

    /**
     * Gets the value of the nfcCodeThreeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcCodeThreeDescription() {
        return nfcCodeThreeDescription;
    }

    /**
     * Sets the value of the nfcCodeThreeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcCodeThreeDescription(String value) {
        this.nfcCodeThreeDescription = value;
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

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrength(String value) {
        this.strength = value;
    }

}

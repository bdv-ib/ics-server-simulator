
package com.diximonline.cbspaymentsimulator.acxf.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjAchOtrfUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjAchOtrfUserArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjAchOtrfUser" type="{http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl/types/}ObjAchOtrfUser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAchOtrfUserArray", propOrder = {
    "objAchOtrfUser"
})
public class ObjAchOtrfUserArray {

    @XmlElement(name = "ObjAchOtrfUser", nillable = true)
    protected List<ObjAchOtrfUser> objAchOtrfUser;

    /**
     * Gets the value of the objAchOtrfUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the objAchOtrfUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjAchOtrfUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjAchOtrfUser }
     * 
     * 
     */
    public List<ObjAchOtrfUser> getObjAchOtrfUser() {
        if (objAchOtrfUser == null) {
            objAchOtrfUser = new ArrayList<ObjAchOtrfUser>();
        }
        return this.objAchOtrfUser;
    }

}

/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ColorChangeEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ColorChangeEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clrFrom" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Color"/>
 *         &lt;element name="clrTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Color"/>
 *       &lt;/sequence>
 *       &lt;attribute name="useA" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorChangeEffect", propOrder = {
    "clrFrom",
    "clrTo"
})
public class CTColorChangeEffect {

    @XmlElement(required = true)
    protected CTColor clrFrom;
    @XmlElement(required = true)
    protected CTColor clrTo;
    @XmlAttribute
    protected Boolean useA;

    /**
     * Gets the value of the clrFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CTColor }
     *     
     */
    public CTColor getClrFrom() {
        return clrFrom;
    }

    /**
     * Sets the value of the clrFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColor }
     *     
     */
    public void setClrFrom(CTColor value) {
        this.clrFrom = value;
    }

    /**
     * Gets the value of the clrTo property.
     * 
     * @return
     *     possible object is
     *     {@link CTColor }
     *     
     */
    public CTColor getClrTo() {
        return clrTo;
    }

    /**
     * Sets the value of the clrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColor }
     *     
     */
    public void setClrTo(CTColor value) {
        this.clrTo = value;
    }

    /**
     * Gets the value of the useA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseA() {
        if (useA == null) {
            return true;
        } else {
            return useA;
        }
    }

    /**
     * Sets the value of the useA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseA(Boolean value) {
        this.useA = value;
    }

}

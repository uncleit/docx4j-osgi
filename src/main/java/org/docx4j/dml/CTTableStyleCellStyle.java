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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_TableStyleCellStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TableStyleCellStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcBdr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TableCellBorderStyle" minOccurs="0"/>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_ThemeableFillStyle" minOccurs="0"/>
 *         &lt;element name="cell3D" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Cell3D" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TableStyleCellStyle", propOrder = {
    "tcBdr",
    "fill",
    "fillRef",
    "cell3D"
})
public class CTTableStyleCellStyle {

    protected CTTableCellBorderStyle tcBdr;
    protected CTFillProperties fill;
    protected CTStyleMatrixReference fillRef;
    protected CTCell3D cell3D;

    /**
     * Gets the value of the tcBdr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTableCellBorderStyle }
     *     
     */
    public CTTableCellBorderStyle getTcBdr() {
        return tcBdr;
    }

    /**
     * Sets the value of the tcBdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTableCellBorderStyle }
     *     
     */
    public void setTcBdr(CTTableCellBorderStyle value) {
        this.tcBdr = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link CTFillProperties }
     *     
     */
    public CTFillProperties getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTFillProperties }
     *     
     */
    public void setFill(CTFillProperties value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fillRef property.
     * 
     * @return
     *     possible object is
     *     {@link CTStyleMatrixReference }
     *     
     */
    public CTStyleMatrixReference getFillRef() {
        return fillRef;
    }

    /**
     * Sets the value of the fillRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTStyleMatrixReference }
     *     
     */
    public void setFillRef(CTStyleMatrixReference value) {
        this.fillRef = value;
    }

    /**
     * Gets the value of the cell3D property.
     * 
     * @return
     *     possible object is
     *     {@link CTCell3D }
     *     
     */
    public CTCell3D getCell3D() {
        return cell3D;
    }

    /**
     * Sets the value of the cell3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCell3D }
     *     
     */
    public void setCell3D(CTCell3D value) {
        this.cell3D = value;
    }

}

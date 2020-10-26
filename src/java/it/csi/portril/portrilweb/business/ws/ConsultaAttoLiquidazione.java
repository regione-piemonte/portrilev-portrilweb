/*
*SPDX-FileCopyrightText: Copyright 2020 | Regione Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.portril.portrilweb.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per consultaAttoLiquidazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaAttoLiquidazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://cxf.bilancio.interfacecxf.cmpsrvrp.bilsrvrp.csi.it/}consultaAttoLiquidazioneDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaAttoLiquidazione", propOrder = {
    "arg0"
})
public class ConsultaAttoLiquidazione {

    protected ConsultaAttoLiquidazioneDTO arg0;

    /**
     * Recupera il valore della propriet� arg0.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaAttoLiquidazioneDTO }
     *     
     */
    public ConsultaAttoLiquidazioneDTO getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della propriet� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaAttoLiquidazioneDTO }
     *     
     */
    public void setArg0(ConsultaAttoLiquidazioneDTO value) {
        this.arg0 = value;
    }

}
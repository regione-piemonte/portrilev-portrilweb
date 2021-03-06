/*
*SPDX-FileCopyrightText: Copyright 2020 | Regione Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.portril.portrilweb.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per beneficiario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="beneficiario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cxf.bilancio.interfacecxf.cmpsrvrp.bilsrvrp.csi.it/}beneficiarioKey">
 *       &lt;sequence>
 *         &lt;element name="abi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloccoPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codaccre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codbenCedente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codbenCeduto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codfiscQuiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codupos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAgg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descrAbi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrCab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrCodAccre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagTutteErog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intestcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailModPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piazza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progbenCeduto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="provSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ragSocSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viaSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiario", propOrder = {
    "abi",
    "bic",
    "bloccoPag",
    "cab",
    "capSede",
    "cin",
    "codaccre",
    "codbenCedente",
    "codbenCeduto",
    "codfiscQuiet",
    "codpag",
    "codupos",
    "comuneSede",
    "dataAgg",
    "descrAbi",
    "descrCab",
    "descrCodAccre",
    "flagTutteErog",
    "iban",
    "intestcc",
    "mailModPag",
    "nroCC",
    "piazza",
    "progbenCeduto",
    "provSede",
    "quiet",
    "ragSocSede",
    "utente",
    "viaSede"
})
public class Beneficiario
    extends BeneficiarioKey
{

    protected String abi;
    protected String bic;
    protected String bloccoPag;
    protected String cab;
    protected String capSede;
    protected String cin;
    protected String codaccre;
    protected Integer codbenCedente;
    protected Integer codbenCeduto;
    protected String codfiscQuiet;
    protected String codpag;
    protected String codupos;
    protected String comuneSede;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAgg;
    protected String descrAbi;
    protected String descrCab;
    protected String descrCodAccre;
    protected String flagTutteErog;
    protected String iban;
    protected String intestcc;
    protected String mailModPag;
    protected String nroCC;
    protected String piazza;
    protected Integer progbenCeduto;
    protected String provSede;
    protected String quiet;
    protected String ragSocSede;
    protected String utente;
    protected String viaSede;

    /**
     * Recupera il valore della proprietÓ abi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbi() {
        return abi;
    }

    /**
     * Imposta il valore della proprietÓ abi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbi(String value) {
        this.abi = value;
    }

    /**
     * Recupera il valore della proprietÓ bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Imposta il valore della proprietÓ bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Recupera il valore della proprietÓ bloccoPag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloccoPag() {
        return bloccoPag;
    }

    /**
     * Imposta il valore della proprietÓ bloccoPag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloccoPag(String value) {
        this.bloccoPag = value;
    }

    /**
     * Recupera il valore della proprietÓ cab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCab() {
        return cab;
    }

    /**
     * Imposta il valore della proprietÓ cab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCab(String value) {
        this.cab = value;
    }

    /**
     * Recupera il valore della proprietÓ capSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapSede() {
        return capSede;
    }

    /**
     * Imposta il valore della proprietÓ capSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapSede(String value) {
        this.capSede = value;
    }

    /**
     * Recupera il valore della proprietÓ cin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCin() {
        return cin;
    }

    /**
     * Imposta il valore della proprietÓ cin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCin(String value) {
        this.cin = value;
    }

    /**
     * Recupera il valore della proprietÓ codaccre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodaccre() {
        return codaccre;
    }

    /**
     * Imposta il valore della proprietÓ codaccre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodaccre(String value) {
        this.codaccre = value;
    }

    /**
     * Recupera il valore della proprietÓ codbenCedente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodbenCedente() {
        return codbenCedente;
    }

    /**
     * Imposta il valore della proprietÓ codbenCedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodbenCedente(Integer value) {
        this.codbenCedente = value;
    }

    /**
     * Recupera il valore della proprietÓ codbenCeduto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodbenCeduto() {
        return codbenCeduto;
    }

    /**
     * Imposta il valore della proprietÓ codbenCeduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodbenCeduto(Integer value) {
        this.codbenCeduto = value;
    }

    /**
     * Recupera il valore della proprietÓ codfiscQuiet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodfiscQuiet() {
        return codfiscQuiet;
    }

    /**
     * Imposta il valore della proprietÓ codfiscQuiet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodfiscQuiet(String value) {
        this.codfiscQuiet = value;
    }

    /**
     * Recupera il valore della proprietÓ codpag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodpag() {
        return codpag;
    }

    /**
     * Imposta il valore della proprietÓ codpag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodpag(String value) {
        this.codpag = value;
    }

    /**
     * Recupera il valore della proprietÓ codupos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodupos() {
        return codupos;
    }

    /**
     * Imposta il valore della proprietÓ codupos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodupos(String value) {
        this.codupos = value;
    }

    /**
     * Recupera il valore della proprietÓ comuneSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneSede() {
        return comuneSede;
    }

    /**
     * Imposta il valore della proprietÓ comuneSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneSede(String value) {
        this.comuneSede = value;
    }

    /**
     * Recupera il valore della proprietÓ dataAgg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAgg() {
        return dataAgg;
    }

    /**
     * Imposta il valore della proprietÓ dataAgg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAgg(XMLGregorianCalendar value) {
        this.dataAgg = value;
    }

    /**
     * Recupera il valore della proprietÓ descrAbi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrAbi() {
        return descrAbi;
    }

    /**
     * Imposta il valore della proprietÓ descrAbi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrAbi(String value) {
        this.descrAbi = value;
    }

    /**
     * Recupera il valore della proprietÓ descrCab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrCab() {
        return descrCab;
    }

    /**
     * Imposta il valore della proprietÓ descrCab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrCab(String value) {
        this.descrCab = value;
    }

    /**
     * Recupera il valore della proprietÓ descrCodAccre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrCodAccre() {
        return descrCodAccre;
    }

    /**
     * Imposta il valore della proprietÓ descrCodAccre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrCodAccre(String value) {
        this.descrCodAccre = value;
    }

    /**
     * Recupera il valore della proprietÓ flagTutteErog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagTutteErog() {
        return flagTutteErog;
    }

    /**
     * Imposta il valore della proprietÓ flagTutteErog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagTutteErog(String value) {
        this.flagTutteErog = value;
    }

    /**
     * Recupera il valore della proprietÓ iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Imposta il valore della proprietÓ iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietÓ intestcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntestcc() {
        return intestcc;
    }

    /**
     * Imposta il valore della proprietÓ intestcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntestcc(String value) {
        this.intestcc = value;
    }

    /**
     * Recupera il valore della proprietÓ mailModPag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailModPag() {
        return mailModPag;
    }

    /**
     * Imposta il valore della proprietÓ mailModPag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailModPag(String value) {
        this.mailModPag = value;
    }

    /**
     * Recupera il valore della proprietÓ nroCC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCC() {
        return nroCC;
    }

    /**
     * Imposta il valore della proprietÓ nroCC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCC(String value) {
        this.nroCC = value;
    }

    /**
     * Recupera il valore della proprietÓ piazza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiazza() {
        return piazza;
    }

    /**
     * Imposta il valore della proprietÓ piazza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiazza(String value) {
        this.piazza = value;
    }

    /**
     * Recupera il valore della proprietÓ progbenCeduto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgbenCeduto() {
        return progbenCeduto;
    }

    /**
     * Imposta il valore della proprietÓ progbenCeduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgbenCeduto(Integer value) {
        this.progbenCeduto = value;
    }

    /**
     * Recupera il valore della proprietÓ provSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvSede() {
        return provSede;
    }

    /**
     * Imposta il valore della proprietÓ provSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvSede(String value) {
        this.provSede = value;
    }

    /**
     * Recupera il valore della proprietÓ quiet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuiet() {
        return quiet;
    }

    /**
     * Imposta il valore della proprietÓ quiet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuiet(String value) {
        this.quiet = value;
    }

    /**
     * Recupera il valore della proprietÓ ragSocSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRagSocSede() {
        return ragSocSede;
    }

    /**
     * Imposta il valore della proprietÓ ragSocSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagSocSede(String value) {
        this.ragSocSede = value;
    }

    /**
     * Recupera il valore della proprietÓ utente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Imposta il valore della proprietÓ utente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Recupera il valore della proprietÓ viaSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaSede() {
        return viaSede;
    }

    /**
     * Imposta il valore della proprietÓ viaSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaSede(String value) {
        this.viaSede = value;
    }

}

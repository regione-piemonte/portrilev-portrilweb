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
 * <p>Classe Java per capitolo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="capitolo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cxf.bilancio.interfacecxf.cmpsrvrp.bilsrvrp.csi.it/}capitoloKey">
 *       &lt;sequence>
 *         &lt;element name="annoCreazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoprov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroResp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codGest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMecc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codelenchi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codprov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contoVincolato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataAgg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deltamAssestCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltamAssestComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltamCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltamComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltamPrevCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltamPrevComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapAssestCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapAssestComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapPrevCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deltapPrevComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exArt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="exCap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="exCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exTitolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exUpb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exVoceEco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flmutuo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funzObiett" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nprov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nvarIstit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="obblAccant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permemAnnoPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permemPrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propVista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rilevIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ripAutom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stAnnoPrec" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAnnoPrecCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAnnoPrecRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssestCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssestIniz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssestInizCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssestInizRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAssestRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAttu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAttuCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stAttuRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stIniz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stInizCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stInizRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stPrev" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stPrevCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stPrevRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stProp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipocontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipofin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipofondi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipovinc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vardefgestCassa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vardefgestComp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="voceEco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capitolo", propOrder = {
    "annoCreazione",
    "annoprov",
    "area",
    "categoria",
    "centroResp",
    "codGest",
    "codMecc",
    "codelenchi",
    "codprov",
    "contoVincolato",
    "dataAgg",
    "deltamAssestCassa",
    "deltamAssestComp",
    "deltamCassa",
    "deltamComp",
    "deltamPrevCassa",
    "deltamPrevComp",
    "deltapAssestCassa",
    "deltapAssestComp",
    "deltapCassa",
    "deltapComp",
    "deltapPrevCassa",
    "deltapPrevComp",
    "descri",
    "exArt",
    "exCap",
    "exCategoria",
    "exTitolo",
    "exUpb",
    "exVoceEco",
    "flmutuo",
    "funzObiett",
    "note",
    "nprov",
    "nvarIstit",
    "obblAccant",
    "permemAnnoPrec",
    "permemPrev",
    "progetto",
    "programma",
    "propVista",
    "rilevIva",
    "ripAutom",
    "stAnnoPrec",
    "stAnnoPrecCassa",
    "stAnnoPrecRes",
    "stAssest",
    "stAssestCassa",
    "stAssestIniz",
    "stAssestInizCassa",
    "stAssestInizRes",
    "stAssestRes",
    "stAttu",
    "stAttuCassa",
    "stAttuRes",
    "stIniz",
    "stInizCassa",
    "stInizRes",
    "stPrev",
    "stPrevCassa",
    "stPrevRes",
    "stProp",
    "tipocontr",
    "tipofin",
    "tipofondi",
    "tipovinc",
    "titolo",
    "upb",
    "utente",
    "vardefgestCassa",
    "vardefgestComp",
    "voceEco"
})
public class Capitolo
    extends CapitoloKey
{

    protected String annoCreazione;
    protected String annoprov;
    protected String area;
    protected String categoria;
    protected String centroResp;
    protected String codGest;
    protected String codMecc;
    protected String codelenchi;
    protected String codprov;
    protected Integer contoVincolato;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAgg;
    protected Double deltamAssestCassa;
    protected Double deltamAssestComp;
    protected Double deltamCassa;
    protected Double deltamComp;
    protected Double deltamPrevCassa;
    protected Double deltamPrevComp;
    protected Double deltapAssestCassa;
    protected Double deltapAssestComp;
    protected Double deltapCassa;
    protected Double deltapComp;
    protected Double deltapPrevCassa;
    protected Double deltapPrevComp;
    protected String descri;
    protected Integer exArt;
    protected Integer exCap;
    protected String exCategoria;
    protected String exTitolo;
    protected String exUpb;
    protected String exVoceEco;
    protected String flmutuo;
    protected String funzObiett;
    protected String note;
    protected String nprov;
    protected Integer nvarIstit;
    protected String obblAccant;
    protected String permemAnnoPrec;
    protected String permemPrev;
    protected String progetto;
    protected String programma;
    protected String propVista;
    protected String rilevIva;
    protected String ripAutom;
    protected Double stAnnoPrec;
    protected Double stAnnoPrecCassa;
    protected Double stAnnoPrecRes;
    protected Double stAssest;
    protected Double stAssestCassa;
    protected Double stAssestIniz;
    protected Double stAssestInizCassa;
    protected Double stAssestInizRes;
    protected Double stAssestRes;
    protected Double stAttu;
    protected Double stAttuCassa;
    protected Double stAttuRes;
    protected Double stIniz;
    protected Double stInizCassa;
    protected Double stInizRes;
    protected Double stPrev;
    protected Double stPrevCassa;
    protected Double stPrevRes;
    protected Double stProp;
    protected String tipocontr;
    protected String tipofin;
    protected String tipofondi;
    protected String tipovinc;
    protected String titolo;
    protected String upb;
    protected String utente;
    protected Double vardefgestCassa;
    protected Double vardefgestComp;
    protected String voceEco;

    /**
     * Recupera il valore della proprietÓ annoCreazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoCreazione() {
        return annoCreazione;
    }

    /**
     * Imposta il valore della proprietÓ annoCreazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoCreazione(String value) {
        this.annoCreazione = value;
    }

    /**
     * Recupera il valore della proprietÓ annoprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoprov() {
        return annoprov;
    }

    /**
     * Imposta il valore della proprietÓ annoprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoprov(String value) {
        this.annoprov = value;
    }

    /**
     * Recupera il valore della proprietÓ area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprietÓ area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Recupera il valore della proprietÓ categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietÓ categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprietÓ centroResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroResp() {
        return centroResp;
    }

    /**
     * Imposta il valore della proprietÓ centroResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroResp(String value) {
        this.centroResp = value;
    }

    /**
     * Recupera il valore della proprietÓ codGest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGest() {
        return codGest;
    }

    /**
     * Imposta il valore della proprietÓ codGest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGest(String value) {
        this.codGest = value;
    }

    /**
     * Recupera il valore della proprietÓ codMecc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMecc() {
        return codMecc;
    }

    /**
     * Imposta il valore della proprietÓ codMecc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMecc(String value) {
        this.codMecc = value;
    }

    /**
     * Recupera il valore della proprietÓ codelenchi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodelenchi() {
        return codelenchi;
    }

    /**
     * Imposta il valore della proprietÓ codelenchi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodelenchi(String value) {
        this.codelenchi = value;
    }

    /**
     * Recupera il valore della proprietÓ codprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodprov() {
        return codprov;
    }

    /**
     * Imposta il valore della proprietÓ codprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodprov(String value) {
        this.codprov = value;
    }

    /**
     * Recupera il valore della proprietÓ contoVincolato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContoVincolato() {
        return contoVincolato;
    }

    /**
     * Imposta il valore della proprietÓ contoVincolato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContoVincolato(Integer value) {
        this.contoVincolato = value;
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
     * Recupera il valore della proprietÓ deltamAssestCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamAssestCassa() {
        return deltamAssestCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltamAssestCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamAssestCassa(Double value) {
        this.deltamAssestCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltamAssestComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamAssestComp() {
        return deltamAssestComp;
    }

    /**
     * Imposta il valore della proprietÓ deltamAssestComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamAssestComp(Double value) {
        this.deltamAssestComp = value;
    }

    /**
     * Recupera il valore della proprietÓ deltamCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamCassa() {
        return deltamCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltamCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamCassa(Double value) {
        this.deltamCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltamComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamComp() {
        return deltamComp;
    }

    /**
     * Imposta il valore della proprietÓ deltamComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamComp(Double value) {
        this.deltamComp = value;
    }

    /**
     * Recupera il valore della proprietÓ deltamPrevCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamPrevCassa() {
        return deltamPrevCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltamPrevCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamPrevCassa(Double value) {
        this.deltamPrevCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltamPrevComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltamPrevComp() {
        return deltamPrevComp;
    }

    /**
     * Imposta il valore della proprietÓ deltamPrevComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltamPrevComp(Double value) {
        this.deltamPrevComp = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapAssestCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapAssestCassa() {
        return deltapAssestCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltapAssestCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapAssestCassa(Double value) {
        this.deltapAssestCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapAssestComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapAssestComp() {
        return deltapAssestComp;
    }

    /**
     * Imposta il valore della proprietÓ deltapAssestComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapAssestComp(Double value) {
        this.deltapAssestComp = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapCassa() {
        return deltapCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltapCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapCassa(Double value) {
        this.deltapCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapComp() {
        return deltapComp;
    }

    /**
     * Imposta il valore della proprietÓ deltapComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapComp(Double value) {
        this.deltapComp = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapPrevCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapPrevCassa() {
        return deltapPrevCassa;
    }

    /**
     * Imposta il valore della proprietÓ deltapPrevCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapPrevCassa(Double value) {
        this.deltapPrevCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ deltapPrevComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeltapPrevComp() {
        return deltapPrevComp;
    }

    /**
     * Imposta il valore della proprietÓ deltapPrevComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeltapPrevComp(Double value) {
        this.deltapPrevComp = value;
    }

    /**
     * Recupera il valore della proprietÓ descri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescri() {
        return descri;
    }

    /**
     * Imposta il valore della proprietÓ descri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescri(String value) {
        this.descri = value;
    }

    /**
     * Recupera il valore della proprietÓ exArt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExArt() {
        return exArt;
    }

    /**
     * Imposta il valore della proprietÓ exArt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExArt(Integer value) {
        this.exArt = value;
    }

    /**
     * Recupera il valore della proprietÓ exCap.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExCap() {
        return exCap;
    }

    /**
     * Imposta il valore della proprietÓ exCap.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExCap(Integer value) {
        this.exCap = value;
    }

    /**
     * Recupera il valore della proprietÓ exCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExCategoria() {
        return exCategoria;
    }

    /**
     * Imposta il valore della proprietÓ exCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExCategoria(String value) {
        this.exCategoria = value;
    }

    /**
     * Recupera il valore della proprietÓ exTitolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTitolo() {
        return exTitolo;
    }

    /**
     * Imposta il valore della proprietÓ exTitolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTitolo(String value) {
        this.exTitolo = value;
    }

    /**
     * Recupera il valore della proprietÓ exUpb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExUpb() {
        return exUpb;
    }

    /**
     * Imposta il valore della proprietÓ exUpb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExUpb(String value) {
        this.exUpb = value;
    }

    /**
     * Recupera il valore della proprietÓ exVoceEco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExVoceEco() {
        return exVoceEco;
    }

    /**
     * Imposta il valore della proprietÓ exVoceEco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExVoceEco(String value) {
        this.exVoceEco = value;
    }

    /**
     * Recupera il valore della proprietÓ flmutuo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlmutuo() {
        return flmutuo;
    }

    /**
     * Imposta il valore della proprietÓ flmutuo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlmutuo(String value) {
        this.flmutuo = value;
    }

    /**
     * Recupera il valore della proprietÓ funzObiett.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunzObiett() {
        return funzObiett;
    }

    /**
     * Imposta il valore della proprietÓ funzObiett.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunzObiett(String value) {
        this.funzObiett = value;
    }

    /**
     * Recupera il valore della proprietÓ note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietÓ note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietÓ nprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNprov() {
        return nprov;
    }

    /**
     * Imposta il valore della proprietÓ nprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNprov(String value) {
        this.nprov = value;
    }

    /**
     * Recupera il valore della proprietÓ nvarIstit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNvarIstit() {
        return nvarIstit;
    }

    /**
     * Imposta il valore della proprietÓ nvarIstit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNvarIstit(Integer value) {
        this.nvarIstit = value;
    }

    /**
     * Recupera il valore della proprietÓ obblAccant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObblAccant() {
        return obblAccant;
    }

    /**
     * Imposta il valore della proprietÓ obblAccant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObblAccant(String value) {
        this.obblAccant = value;
    }

    /**
     * Recupera il valore della proprietÓ permemAnnoPrec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermemAnnoPrec() {
        return permemAnnoPrec;
    }

    /**
     * Imposta il valore della proprietÓ permemAnnoPrec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermemAnnoPrec(String value) {
        this.permemAnnoPrec = value;
    }

    /**
     * Recupera il valore della proprietÓ permemPrev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermemPrev() {
        return permemPrev;
    }

    /**
     * Imposta il valore della proprietÓ permemPrev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermemPrev(String value) {
        this.permemPrev = value;
    }

    /**
     * Recupera il valore della proprietÓ progetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgetto() {
        return progetto;
    }

    /**
     * Imposta il valore della proprietÓ progetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgetto(String value) {
        this.progetto = value;
    }

    /**
     * Recupera il valore della proprietÓ programma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramma() {
        return programma;
    }

    /**
     * Imposta il valore della proprietÓ programma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramma(String value) {
        this.programma = value;
    }

    /**
     * Recupera il valore della proprietÓ propVista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropVista() {
        return propVista;
    }

    /**
     * Imposta il valore della proprietÓ propVista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropVista(String value) {
        this.propVista = value;
    }

    /**
     * Recupera il valore della proprietÓ rilevIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRilevIva() {
        return rilevIva;
    }

    /**
     * Imposta il valore della proprietÓ rilevIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRilevIva(String value) {
        this.rilevIva = value;
    }

    /**
     * Recupera il valore della proprietÓ ripAutom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRipAutom() {
        return ripAutom;
    }

    /**
     * Imposta il valore della proprietÓ ripAutom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRipAutom(String value) {
        this.ripAutom = value;
    }

    /**
     * Recupera il valore della proprietÓ stAnnoPrec.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAnnoPrec() {
        return stAnnoPrec;
    }

    /**
     * Imposta il valore della proprietÓ stAnnoPrec.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAnnoPrec(Double value) {
        this.stAnnoPrec = value;
    }

    /**
     * Recupera il valore della proprietÓ stAnnoPrecCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAnnoPrecCassa() {
        return stAnnoPrecCassa;
    }

    /**
     * Imposta il valore della proprietÓ stAnnoPrecCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAnnoPrecCassa(Double value) {
        this.stAnnoPrecCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stAnnoPrecRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAnnoPrecRes() {
        return stAnnoPrecRes;
    }

    /**
     * Imposta il valore della proprietÓ stAnnoPrecRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAnnoPrecRes(Double value) {
        this.stAnnoPrecRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssest.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssest() {
        return stAssest;
    }

    /**
     * Imposta il valore della proprietÓ stAssest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssest(Double value) {
        this.stAssest = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssestCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssestCassa() {
        return stAssestCassa;
    }

    /**
     * Imposta il valore della proprietÓ stAssestCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssestCassa(Double value) {
        this.stAssestCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssestIniz.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssestIniz() {
        return stAssestIniz;
    }

    /**
     * Imposta il valore della proprietÓ stAssestIniz.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssestIniz(Double value) {
        this.stAssestIniz = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssestInizCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssestInizCassa() {
        return stAssestInizCassa;
    }

    /**
     * Imposta il valore della proprietÓ stAssestInizCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssestInizCassa(Double value) {
        this.stAssestInizCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssestInizRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssestInizRes() {
        return stAssestInizRes;
    }

    /**
     * Imposta il valore della proprietÓ stAssestInizRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssestInizRes(Double value) {
        this.stAssestInizRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stAssestRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAssestRes() {
        return stAssestRes;
    }

    /**
     * Imposta il valore della proprietÓ stAssestRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAssestRes(Double value) {
        this.stAssestRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stAttu.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAttu() {
        return stAttu;
    }

    /**
     * Imposta il valore della proprietÓ stAttu.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAttu(Double value) {
        this.stAttu = value;
    }

    /**
     * Recupera il valore della proprietÓ stAttuCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAttuCassa() {
        return stAttuCassa;
    }

    /**
     * Imposta il valore della proprietÓ stAttuCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAttuCassa(Double value) {
        this.stAttuCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stAttuRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStAttuRes() {
        return stAttuRes;
    }

    /**
     * Imposta il valore della proprietÓ stAttuRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStAttuRes(Double value) {
        this.stAttuRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stIniz.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStIniz() {
        return stIniz;
    }

    /**
     * Imposta il valore della proprietÓ stIniz.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStIniz(Double value) {
        this.stIniz = value;
    }

    /**
     * Recupera il valore della proprietÓ stInizCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStInizCassa() {
        return stInizCassa;
    }

    /**
     * Imposta il valore della proprietÓ stInizCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStInizCassa(Double value) {
        this.stInizCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stInizRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStInizRes() {
        return stInizRes;
    }

    /**
     * Imposta il valore della proprietÓ stInizRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStInizRes(Double value) {
        this.stInizRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stPrev.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStPrev() {
        return stPrev;
    }

    /**
     * Imposta il valore della proprietÓ stPrev.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStPrev(Double value) {
        this.stPrev = value;
    }

    /**
     * Recupera il valore della proprietÓ stPrevCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStPrevCassa() {
        return stPrevCassa;
    }

    /**
     * Imposta il valore della proprietÓ stPrevCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStPrevCassa(Double value) {
        this.stPrevCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ stPrevRes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStPrevRes() {
        return stPrevRes;
    }

    /**
     * Imposta il valore della proprietÓ stPrevRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStPrevRes(Double value) {
        this.stPrevRes = value;
    }

    /**
     * Recupera il valore della proprietÓ stProp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStProp() {
        return stProp;
    }

    /**
     * Imposta il valore della proprietÓ stProp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStProp(Double value) {
        this.stProp = value;
    }

    /**
     * Recupera il valore della proprietÓ tipocontr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocontr() {
        return tipocontr;
    }

    /**
     * Imposta il valore della proprietÓ tipocontr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocontr(String value) {
        this.tipocontr = value;
    }

    /**
     * Recupera il valore della proprietÓ tipofin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipofin() {
        return tipofin;
    }

    /**
     * Imposta il valore della proprietÓ tipofin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipofin(String value) {
        this.tipofin = value;
    }

    /**
     * Recupera il valore della proprietÓ tipofondi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipofondi() {
        return tipofondi;
    }

    /**
     * Imposta il valore della proprietÓ tipofondi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipofondi(String value) {
        this.tipofondi = value;
    }

    /**
     * Recupera il valore della proprietÓ tipovinc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipovinc() {
        return tipovinc;
    }

    /**
     * Imposta il valore della proprietÓ tipovinc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipovinc(String value) {
        this.tipovinc = value;
    }

    /**
     * Recupera il valore della proprietÓ titolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il valore della proprietÓ titolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitolo(String value) {
        this.titolo = value;
    }

    /**
     * Recupera il valore della proprietÓ upb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpb() {
        return upb;
    }

    /**
     * Imposta il valore della proprietÓ upb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpb(String value) {
        this.upb = value;
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
     * Recupera il valore della proprietÓ vardefgestCassa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVardefgestCassa() {
        return vardefgestCassa;
    }

    /**
     * Imposta il valore della proprietÓ vardefgestCassa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVardefgestCassa(Double value) {
        this.vardefgestCassa = value;
    }

    /**
     * Recupera il valore della proprietÓ vardefgestComp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVardefgestComp() {
        return vardefgestComp;
    }

    /**
     * Imposta il valore della proprietÓ vardefgestComp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVardefgestComp(Double value) {
        this.vardefgestComp = value;
    }

    /**
     * Recupera il valore della proprietÓ voceEco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoceEco() {
        return voceEco;
    }

    /**
     * Imposta il valore della proprietÓ voceEco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoceEco(String value) {
        this.voceEco = value;
    }

}

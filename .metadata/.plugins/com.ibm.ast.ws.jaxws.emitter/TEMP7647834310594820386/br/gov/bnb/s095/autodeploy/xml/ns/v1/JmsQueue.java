//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.07 at 12:09:57 PM GMT-03:00 
//


package br.gov.bnb.s095.autodeploy.xml.ns.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}escopo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-jndi"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-mq"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}tipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nome",
    "escopo",
    "nomeJndi",
    "nomeMq",
    "tipo"
})
@XmlRootElement(name = "jms-queue")
public class JmsQueue {

    @XmlElement(required = true)
    protected Nome nome;
    @XmlElement(required = true)
    protected Escopo escopo;
    @XmlElement(name = "nome-jndi", required = true)
    protected NomeJndi nomeJndi;
    @XmlElement(name = "nome-mq", required = true)
    protected NomeMq nomeMq;
    @XmlElement(required = true)
    protected Tipo tipo;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link Nome }
     *     
     */
    public Nome getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nome }
     *     
     */
    public void setNome(Nome value) {
        this.nome = value;
    }

    /**
     * Gets the value of the escopo property.
     * 
     * @return
     *     possible object is
     *     {@link Escopo }
     *     
     */
    public Escopo getEscopo() {
        return escopo;
    }

    /**
     * Sets the value of the escopo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escopo }
     *     
     */
    public void setEscopo(Escopo value) {
        this.escopo = value;
    }

    /**
     * Gets the value of the nomeJndi property.
     * 
     * @return
     *     possible object is
     *     {@link NomeJndi }
     *     
     */
    public NomeJndi getNomeJndi() {
        return nomeJndi;
    }

    /**
     * Sets the value of the nomeJndi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJndi }
     *     
     */
    public void setNomeJndi(NomeJndi value) {
        this.nomeJndi = value;
    }

    /**
     * Gets the value of the nomeMq property.
     * 
     * @return
     *     possible object is
     *     {@link NomeMq }
     *     
     */
    public NomeMq getNomeMq() {
        return nomeMq;
    }

    /**
     * Sets the value of the nomeMq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeMq }
     *     
     */
    public void setNomeMq(NomeMq value) {
        this.nomeMq = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link Tipo }
     *     
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipo }
     *     
     */
    public void setTipo(Tipo value) {
        this.tipo = value;
    }

}

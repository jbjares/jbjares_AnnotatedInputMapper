//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.06 at 10:56:41 AM GMT-03:00 
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
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}escopo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-jndi"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-jndi-destino"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}tipo-destino"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}descricao"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-queue-manager"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}host-queue-manager"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}porta-queue-manager"/>
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
    "escopo",
    "nome",
    "nomeJndi",
    "nomeJndiDestino",
    "tipoDestino",
    "descricao",
    "nomeQueueManager",
    "hostQueueManager",
    "portaQueueManager"
})
@XmlRootElement(name = "jms-actvation-specfification")
public class JmsActvationSpecfification {

    @XmlElement(required = true)
    protected Escopo escopo;
    @XmlElement(required = true)
    protected Nome nome;
    @XmlElement(name = "nome-jndi", required = true)
    protected NomeJndi nomeJndi;
    @XmlElement(name = "nome-jndi-destino", required = true)
    protected NomeJndiDestino nomeJndiDestino;
    @XmlElement(name = "tipo-destino", required = true)
    protected TipoDestino tipoDestino;
    @XmlElement(required = true)
    protected Descricao descricao;
    @XmlElement(name = "nome-queue-manager", required = true)
    protected NomeQueueManager nomeQueueManager;
    @XmlElement(name = "host-queue-manager", required = true)
    protected HostQueueManager hostQueueManager;
    @XmlElement(name = "porta-queue-manager", required = true)
    protected PortaQueueManager portaQueueManager;

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
     * Gets the value of the nomeJndiDestino property.
     * 
     * @return
     *     possible object is
     *     {@link NomeJndiDestino }
     *     
     */
    public NomeJndiDestino getNomeJndiDestino() {
        return nomeJndiDestino;
    }

    /**
     * Sets the value of the nomeJndiDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJndiDestino }
     *     
     */
    public void setNomeJndiDestino(NomeJndiDestino value) {
        this.nomeJndiDestino = value;
    }

    /**
     * Gets the value of the tipoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDestino }
     *     
     */
    public TipoDestino getTipoDestino() {
        return tipoDestino;
    }

    /**
     * Sets the value of the tipoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDestino }
     *     
     */
    public void setTipoDestino(TipoDestino value) {
        this.tipoDestino = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link Descricao }
     *     
     */
    public Descricao getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descricao }
     *     
     */
    public void setDescricao(Descricao value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the nomeQueueManager property.
     * 
     * @return
     *     possible object is
     *     {@link NomeQueueManager }
     *     
     */
    public NomeQueueManager getNomeQueueManager() {
        return nomeQueueManager;
    }

    /**
     * Sets the value of the nomeQueueManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeQueueManager }
     *     
     */
    public void setNomeQueueManager(NomeQueueManager value) {
        this.nomeQueueManager = value;
    }

    /**
     * Gets the value of the hostQueueManager property.
     * 
     * @return
     *     possible object is
     *     {@link HostQueueManager }
     *     
     */
    public HostQueueManager getHostQueueManager() {
        return hostQueueManager;
    }

    /**
     * Sets the value of the hostQueueManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostQueueManager }
     *     
     */
    public void setHostQueueManager(HostQueueManager value) {
        this.hostQueueManager = value;
    }

    /**
     * Gets the value of the portaQueueManager property.
     * 
     * @return
     *     possible object is
     *     {@link PortaQueueManager }
     *     
     */
    public PortaQueueManager getPortaQueueManager() {
        return portaQueueManager;
    }

    /**
     * Sets the value of the portaQueueManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortaQueueManager }
     *     
     */
    public void setPortaQueueManager(PortaQueueManager value) {
        this.portaQueueManager = value;
    }

}

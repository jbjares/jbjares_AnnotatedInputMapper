//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.06 at 10:57:55 AM GMT-03:00 
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
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}localizacao-pacote-aplicativo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-raiz-contexto"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}pre-compilar-Arquivos-jSP"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}celula-no-servidor-destino"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}diretorio-instalacao-aplicativo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}distribuir-aplicativo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}implementar-beans-corporativos"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-aplicativo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-modulo-wEB"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}nome-modulos-eJB"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}criar-mBeans-para-recursos"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}validar-entrada"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}processar-configuracao-incorporada"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}permissoes-arquivo"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}mapeamento-modulos-servidores"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}bibliotecas-compartilhadas"/>
 *         &lt;element ref="{http://autodeploy.s095.bnb.gov.br/xml/ns/v1}esta-em-cluster"/>
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
    "localizacaoPacoteAplicativo",
    "nomeRaizContexto",
    "preCompilarArquivosJSP",
    "celulaNoServidorDestino",
    "diretorioInstalacaoAplicativo",
    "distribuirAplicativo",
    "implementarBeansCorporativos",
    "nomeAplicativo",
    "nomeModuloWEB",
    "nomeModulosEJB",
    "criarMBeansParaRecursos",
    "validarEntrada",
    "processarConfiguracaoIncorporada",
    "permissoesArquivo",
    "mapeamentoModulosServidores",
    "bibliotecasCompartilhadas",
    "estaEmCluster"
})
@XmlRootElement(name = "aplicacao")
public class Aplicacao {

    @XmlElement(name = "localizacao-pacote-aplicativo", required = true)
    protected LocalizacaoPacoteAplicativo localizacaoPacoteAplicativo;
    @XmlElement(name = "nome-raiz-contexto", required = true)
    protected NomeRaizContexto nomeRaizContexto;
    @XmlElement(name = "pre-compilar-Arquivos-jSP", required = true)
    protected PreCompilarArquivosJSP preCompilarArquivosJSP;
    @XmlElement(name = "celula-no-servidor-destino", required = true)
    protected CelulaNoServidorDestino celulaNoServidorDestino;
    @XmlElement(name = "diretorio-instalacao-aplicativo", required = true)
    protected DiretorioInstalacaoAplicativo diretorioInstalacaoAplicativo;
    @XmlElement(name = "distribuir-aplicativo", required = true)
    protected DistribuirAplicativo distribuirAplicativo;
    @XmlElement(name = "implementar-beans-corporativos", required = true)
    protected ImplementarBeansCorporativos implementarBeansCorporativos;
    @XmlElement(name = "nome-aplicativo", required = true)
    protected NomeAplicativo nomeAplicativo;
    @XmlElement(name = "nome-modulo-wEB", required = true)
    protected NomeModuloWEB nomeModuloWEB;
    @XmlElement(name = "nome-modulos-eJB", required = true)
    protected NomeModulosEJB nomeModulosEJB;
    @XmlElement(name = "criar-mBeans-para-recursos", required = true)
    protected CriarMBeansParaRecursos criarMBeansParaRecursos;
    @XmlElement(name = "validar-entrada", required = true)
    protected ValidarEntrada validarEntrada;
    @XmlElement(name = "processar-configuracao-incorporada", required = true)
    protected ProcessarConfiguracaoIncorporada processarConfiguracaoIncorporada;
    @XmlElement(name = "permissoes-arquivo", required = true)
    protected PermissoesArquivo permissoesArquivo;
    @XmlElement(name = "mapeamento-modulos-servidores", required = true)
    protected MapeamentoModulosServidores mapeamentoModulosServidores;
    @XmlElement(name = "bibliotecas-compartilhadas", required = true)
    protected BibliotecasCompartilhadas bibliotecasCompartilhadas;
    @XmlElement(name = "esta-em-cluster", required = true)
    protected EstaEmCluster estaEmCluster;

    /**
     * Gets the value of the localizacaoPacoteAplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizacaoPacoteAplicativo }
     *     
     */
    public LocalizacaoPacoteAplicativo getLocalizacaoPacoteAplicativo() {
        return localizacaoPacoteAplicativo;
    }

    /**
     * Sets the value of the localizacaoPacoteAplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizacaoPacoteAplicativo }
     *     
     */
    public void setLocalizacaoPacoteAplicativo(LocalizacaoPacoteAplicativo value) {
        this.localizacaoPacoteAplicativo = value;
    }

    /**
     * Gets the value of the nomeRaizContexto property.
     * 
     * @return
     *     possible object is
     *     {@link NomeRaizContexto }
     *     
     */
    public NomeRaizContexto getNomeRaizContexto() {
        return nomeRaizContexto;
    }

    /**
     * Sets the value of the nomeRaizContexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeRaizContexto }
     *     
     */
    public void setNomeRaizContexto(NomeRaizContexto value) {
        this.nomeRaizContexto = value;
    }

    /**
     * Gets the value of the preCompilarArquivosJSP property.
     * 
     * @return
     *     possible object is
     *     {@link PreCompilarArquivosJSP }
     *     
     */
    public PreCompilarArquivosJSP getPreCompilarArquivosJSP() {
        return preCompilarArquivosJSP;
    }

    /**
     * Sets the value of the preCompilarArquivosJSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCompilarArquivosJSP }
     *     
     */
    public void setPreCompilarArquivosJSP(PreCompilarArquivosJSP value) {
        this.preCompilarArquivosJSP = value;
    }

    /**
     * Gets the value of the celulaNoServidorDestino property.
     * 
     * @return
     *     possible object is
     *     {@link CelulaNoServidorDestino }
     *     
     */
    public CelulaNoServidorDestino getCelulaNoServidorDestino() {
        return celulaNoServidorDestino;
    }

    /**
     * Sets the value of the celulaNoServidorDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelulaNoServidorDestino }
     *     
     */
    public void setCelulaNoServidorDestino(CelulaNoServidorDestino value) {
        this.celulaNoServidorDestino = value;
    }

    /**
     * Gets the value of the diretorioInstalacaoAplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link DiretorioInstalacaoAplicativo }
     *     
     */
    public DiretorioInstalacaoAplicativo getDiretorioInstalacaoAplicativo() {
        return diretorioInstalacaoAplicativo;
    }

    /**
     * Sets the value of the diretorioInstalacaoAplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiretorioInstalacaoAplicativo }
     *     
     */
    public void setDiretorioInstalacaoAplicativo(DiretorioInstalacaoAplicativo value) {
        this.diretorioInstalacaoAplicativo = value;
    }

    /**
     * Gets the value of the distribuirAplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link DistribuirAplicativo }
     *     
     */
    public DistribuirAplicativo getDistribuirAplicativo() {
        return distribuirAplicativo;
    }

    /**
     * Sets the value of the distribuirAplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistribuirAplicativo }
     *     
     */
    public void setDistribuirAplicativo(DistribuirAplicativo value) {
        this.distribuirAplicativo = value;
    }

    /**
     * Gets the value of the implementarBeansCorporativos property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementarBeansCorporativos }
     *     
     */
    public ImplementarBeansCorporativos getImplementarBeansCorporativos() {
        return implementarBeansCorporativos;
    }

    /**
     * Sets the value of the implementarBeansCorporativos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementarBeansCorporativos }
     *     
     */
    public void setImplementarBeansCorporativos(ImplementarBeansCorporativos value) {
        this.implementarBeansCorporativos = value;
    }

    /**
     * Gets the value of the nomeAplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link NomeAplicativo }
     *     
     */
    public NomeAplicativo getNomeAplicativo() {
        return nomeAplicativo;
    }

    /**
     * Sets the value of the nomeAplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeAplicativo }
     *     
     */
    public void setNomeAplicativo(NomeAplicativo value) {
        this.nomeAplicativo = value;
    }

    /**
     * Gets the value of the nomeModuloWEB property.
     * 
     * @return
     *     possible object is
     *     {@link NomeModuloWEB }
     *     
     */
    public NomeModuloWEB getNomeModuloWEB() {
        return nomeModuloWEB;
    }

    /**
     * Sets the value of the nomeModuloWEB property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeModuloWEB }
     *     
     */
    public void setNomeModuloWEB(NomeModuloWEB value) {
        this.nomeModuloWEB = value;
    }

    /**
     * Gets the value of the nomeModulosEJB property.
     * 
     * @return
     *     possible object is
     *     {@link NomeModulosEJB }
     *     
     */
    public NomeModulosEJB getNomeModulosEJB() {
        return nomeModulosEJB;
    }

    /**
     * Sets the value of the nomeModulosEJB property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeModulosEJB }
     *     
     */
    public void setNomeModulosEJB(NomeModulosEJB value) {
        this.nomeModulosEJB = value;
    }

    /**
     * Gets the value of the criarMBeansParaRecursos property.
     * 
     * @return
     *     possible object is
     *     {@link CriarMBeansParaRecursos }
     *     
     */
    public CriarMBeansParaRecursos getCriarMBeansParaRecursos() {
        return criarMBeansParaRecursos;
    }

    /**
     * Sets the value of the criarMBeansParaRecursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriarMBeansParaRecursos }
     *     
     */
    public void setCriarMBeansParaRecursos(CriarMBeansParaRecursos value) {
        this.criarMBeansParaRecursos = value;
    }

    /**
     * Gets the value of the validarEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link ValidarEntrada }
     *     
     */
    public ValidarEntrada getValidarEntrada() {
        return validarEntrada;
    }

    /**
     * Sets the value of the validarEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidarEntrada }
     *     
     */
    public void setValidarEntrada(ValidarEntrada value) {
        this.validarEntrada = value;
    }

    /**
     * Gets the value of the processarConfiguracaoIncorporada property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessarConfiguracaoIncorporada }
     *     
     */
    public ProcessarConfiguracaoIncorporada getProcessarConfiguracaoIncorporada() {
        return processarConfiguracaoIncorporada;
    }

    /**
     * Sets the value of the processarConfiguracaoIncorporada property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessarConfiguracaoIncorporada }
     *     
     */
    public void setProcessarConfiguracaoIncorporada(ProcessarConfiguracaoIncorporada value) {
        this.processarConfiguracaoIncorporada = value;
    }

    /**
     * Gets the value of the permissoesArquivo property.
     * 
     * @return
     *     possible object is
     *     {@link PermissoesArquivo }
     *     
     */
    public PermissoesArquivo getPermissoesArquivo() {
        return permissoesArquivo;
    }

    /**
     * Sets the value of the permissoesArquivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissoesArquivo }
     *     
     */
    public void setPermissoesArquivo(PermissoesArquivo value) {
        this.permissoesArquivo = value;
    }

    /**
     * Gets the value of the mapeamentoModulosServidores property.
     * 
     * @return
     *     possible object is
     *     {@link MapeamentoModulosServidores }
     *     
     */
    public MapeamentoModulosServidores getMapeamentoModulosServidores() {
        return mapeamentoModulosServidores;
    }

    /**
     * Sets the value of the mapeamentoModulosServidores property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapeamentoModulosServidores }
     *     
     */
    public void setMapeamentoModulosServidores(MapeamentoModulosServidores value) {
        this.mapeamentoModulosServidores = value;
    }

    /**
     * Gets the value of the bibliotecasCompartilhadas property.
     * 
     * @return
     *     possible object is
     *     {@link BibliotecasCompartilhadas }
     *     
     */
    public BibliotecasCompartilhadas getBibliotecasCompartilhadas() {
        return bibliotecasCompartilhadas;
    }

    /**
     * Sets the value of the bibliotecasCompartilhadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliotecasCompartilhadas }
     *     
     */
    public void setBibliotecasCompartilhadas(BibliotecasCompartilhadas value) {
        this.bibliotecasCompartilhadas = value;
    }

    /**
     * Gets the value of the estaEmCluster property.
     * 
     * @return
     *     possible object is
     *     {@link EstaEmCluster }
     *     
     */
    public EstaEmCluster getEstaEmCluster() {
        return estaEmCluster;
    }

    /**
     * Sets the value of the estaEmCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstaEmCluster }
     *     
     */
    public void setEstaEmCluster(EstaEmCluster value) {
        this.estaEmCluster = value;
    }

}

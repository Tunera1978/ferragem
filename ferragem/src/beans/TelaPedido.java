package beans;

//import java.math.BigDecimal;

public class TelaPedido {

    //pedido
    private int idPedido;    
    private String Data;
    private String dataEntrega;
    private int idCliente;
    private int idUsuario;
    
    //ferragem
    private int idFerragem;
    private int qtdeFerragem;
    private double estriboLargura;
    private double estriboAltura;
    private double comprimento;
    private double espacoEstribo;
    
   
    //item da ferragem
    private int idItemFerragem;
    private String diametro;
    private double qtdeferro;
    private double qtdepecas;
    private double qtdematerial;
    private int idferragem;
    private int idproduto;
    
    //salva na ferragem e no item - so muda de numero quando opção nova coluna for true
    private int idagrupamento;
    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFerragem() {
        return idFerragem;
    }

    public void setIdFerragem(int idFerragem) {
        this.idFerragem = idFerragem;
    }

    public int getQtdeFerragem() {
        return qtdeFerragem;
    }

    public void setQtdeFerragem(int qtdeFerragem) {
        this.qtdeFerragem = qtdeFerragem;
    }

    public double getEstriboLargura() {
        return estriboLargura;
    }

    public void setEstriboLargura(double estriboLargura) {
        this.estriboLargura = estriboLargura;
    }

    public double getEstriboAltura() {
        return estriboAltura;
    }

    public void setEstriboAltura(double estriboAltura) {
        this.estriboAltura = estriboAltura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getEspacoEstribo() {
        return espacoEstribo;
    }

    public void setEspacoEstribo(double espacoEstribo) {
        this.espacoEstribo = espacoEstribo;
    }

    public int getIdItemFerragem() {
        return idItemFerragem;
    }

    public void setIdItemFerragem(int idItemFerragem) {
        this.idItemFerragem = idItemFerragem;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public double getQtdeferro() {
        return qtdeferro;
    }

    public void setQtdeferro(double qtdeferro) {
        this.qtdeferro = qtdeferro;
    }

    public double getQtdepecas() {
        return qtdepecas;
    }

    public void setQtdepecas(double qtdepecas) {
        this.qtdepecas = qtdepecas;
    }

    public double getQtdematerial() {
        return qtdematerial;
    }

    public void setQtdematerial(double qtdematerial) {
        this.qtdematerial = qtdematerial;
    }

    public int getIdferragem() {
        return idferragem;
    }

    public void setIdferragem(int idferragem) {
        this.idferragem = idferragem;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }
    
    
    
    

 }  

    //---------------------------------------------------
    //Calculos
    //---------------------------------------------------
   /*  public double calculoTotalEstribo() {
        double xx = ((this.estriboAltura * 2) + (this.estriboLargura * 2) + 10);
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.estriboTotal = yy.doubleValue();
        return this.estriboTotal;
    }

    public double calculoQtdeEstribos() {
        double xx = ((this.comprimento / (this.espacoEstribo / 100)) * this.qtdeFerragem);
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.qtdeEstribos = yy.doubleValue();
        return this.qtdeEstribos;
    }

    public double calculoQuantidadeBarrasColunas() {
        double xx = (this.qtdeFerragem * this.comprimento * this.qtdeFerro) / 12;
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.quantidadeBarrasColunas = yy.doubleValue();
        return this.quantidadeBarrasColunas;
    }

    public double calculoQuantidadeBarrasEstribos() {
        double xx = ((this.comprimento / (this.espacoEstribo / 100) * this.qtdeFerragem) / (12 / (this.estriboTotal / 100)));
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.quantidadeBarrasEstribos = yy.doubleValue();
        return this.quantidadeBarrasEstribos;
    }

    public double calculoQuantidadeArames() {
        double xx = ((this.comprimento / (this.espacoEstribo / 100) * this.qtdeFerragem) * (this.qtdeFerro / 200));
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.quantidadeArames = yy.doubleValue();
        return this.quantidadeArames;

    }
*/


  


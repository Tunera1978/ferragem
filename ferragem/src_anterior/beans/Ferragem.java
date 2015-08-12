package beans;

import java.math.BigDecimal;

public class Ferragem {

    private int idFerragem;
    private int qtdeFerragem;
    private double estriboLargura;
    private double estriboAltura;
    private double comprimento;
    private double qtdeFerro;
    private int idUsuario;
    private int idProduto;
    private double espacoEstribo;
    private String diametro;
    private double quantidadeBarrasColunas;
    private double estriboTotal;
    private double quantidadeBarrasEstribos;
    private double quantidadeArames;
    private double qtdeEstribos;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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

    public double getEspacoEstribo() {
        return espacoEstribo;
    }

    public void setEspacoEstribo(double espacoEstribo) {
        this.espacoEstribo = espacoEstribo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getQtdeFerro() {
        return qtdeFerro;
    }

    public void setQtdeFerro(double qtdeFerro) {
        this.qtdeFerro = qtdeFerro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    //---------------------------------------------------
    //Calculos
    //---------------------------------------------------
    public double calculoTotalEstribo() {
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

}

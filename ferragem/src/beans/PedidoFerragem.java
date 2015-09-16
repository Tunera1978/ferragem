package beans;

//import java.math.BigDecimal;

public class PedidoFerragem {

    private int idPedido;    
    private String Data;
    private String dataEntrega;
    private int idTblCliente;
    private int idUsuario;

   

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

  public int getIdPedido()
  {
    return idPedido;
  }

  public void setIdPedido(int idPedido)
  {
    this.idPedido = idPedido;
  }

  public String getData()
  {
    return Data;
  }

  public void setData(String Data)
  {
    this.Data = Data;
  }

  public String getDataEntrega()
  {
    return dataEntrega;
  }

  public void setDataEntrega(String dataEntrega)
  {
    this.dataEntrega = dataEntrega;
  }

  public int getIdTblCliente()
  {
    return idTblCliente;
  }

  public void setIdTblCliente(int idTblCliente)
  {
    this.idTblCliente = idTblCliente;
  }

  public int getIdUsuario()
  {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario)
  {
    this.idUsuario = idUsuario;
  }

  
}

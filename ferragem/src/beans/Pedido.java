package beans;

public class Pedido {

    private int idPedido;
    private String data;
    private String dataentrega;
    private int idcliente;
    private int idusuario;

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
    return data;
  }

  public void setData(String data)
  {
    this.data = data;
  }

  public String getDataentrega()
  {
    return dataentrega;
  }

  public void setDataentrega(String dataentrega)
  {
    this.dataentrega = dataentrega;
  }

  public int getIdcliente()
  {
    return idcliente;
  }

  public void setIdcliente(int idcliente)
  {
    this.idcliente = idcliente;
  }

  public int getIdusuario()
  {
    return idusuario;
  }

  public void setIdusuario(int idusuario)
  {
    this.idusuario = idusuario;
  }
    

}

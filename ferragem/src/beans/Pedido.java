package beans;

public class Pedido {

    private int idPedido;
    private String data;
    private String dataentrega;
    private int idtblcliente;
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

  public int getIdtblcliente()
  {
    return idtblcliente;
  }

  public void setIdtblcliente(int idtblcliente)
  {
    this.idtblcliente = idtblcliente;
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

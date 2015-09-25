package beans;

public class Log
{

  private int idlog;
  private String data;
  private String hora;
  private int idusuario;
  private int idacesso;

  public int getIdlog()
  {
    return idlog;
  }

  public int getIdacesso()
  {
    return idacesso;
  }

  public void setIdacesso(int idacesso)
  {
    this.idacesso = idacesso;
  }

  public void setIdlog(int idlog)
  {
    this.idlog = idlog;
  }

  public String getData()
  {
    return data;
  }

  public void setData(String data)
  {
    this.data = data;
  }

  public String getHora()
  {
    return hora;
  }

  public void setHora(String hora)
  {
    this.hora = hora;
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

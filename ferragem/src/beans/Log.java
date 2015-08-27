/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Tune
 */
public class Log
{

  private int idlog;
  private Date data;
  private Time hora;
  private int idusuario;
  private int acesso;

  public int getIdlog()
  {
    return idlog;
  }

  public void setIdlog(int idlog)
  {
    this.idlog = idlog;
  }

  public Date getData()
  {
    return data;
  }

  public void setData(Date data)
  {
    this.data = data;
  }

  public Time getHora()
  {
    return hora;
  }

  public void setHora(Time hora)
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

  public int getAcesso()
  {
    return acesso;
  }

  public void setAcesso(int acesso)
  {
    this.acesso = acesso;
  }

}

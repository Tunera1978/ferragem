/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Tune
 */
public class Nivel
{

  private int idnivelacesso;
  private String descricao;

  public int getIdnivelacesso()
  {
    return idnivelacesso;
  }

  public void setIdnivelacesso(int idnivelacesso)
  {
    this.idnivelacesso = idnivelacesso;
  }

  public String getDescricao()
  {
    return descricao;
  }

  public void setDescricao(String descricao)
  {
    this.descricao = descricao;
  }

  public String toString()
  {
    return this.descricao;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Nivel)
    {
      Nivel nv = (Nivel) obj;
      return nv.getDescricao().equals(this.getDescricao());
    }
    else
    {
      return false;
    }
  }

}

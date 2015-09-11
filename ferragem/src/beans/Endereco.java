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
public class Endereco {
    private int idtblentrega;
    private String descricao;
    private int idcidade;
    private int idtipoendereco;
    private int idtblcliente;

  public int getIdtblentrega()
  {
    return idtblentrega;
  }

  public void setIdtblentrega(int idtblentrega)
  {
    this.idtblentrega = idtblentrega;
  }

  public String getDescricao()
  {
    return descricao;
  }

  public void setDescricao(String descricao)
  {
    this.descricao = descricao;
  }

  public int getIdcidade()
  {
    return idcidade;
  }

  public void setIdcidade(int idcidade)
  {
    this.idcidade = idcidade;
  }

  public int getIdtipoendereco()
  {
    return idtipoendereco;
  }

  public void setIdtipoendereco(int idtipoendereco)
  {
    this.idtipoendereco = idtipoendereco;
  }

  public int getIdtblcliente()
  {
    return idtblcliente;
  }

  public void setIdtblcliente(int idtblcliente)
  {
    this.idtblcliente = idtblcliente;
  }
   
}

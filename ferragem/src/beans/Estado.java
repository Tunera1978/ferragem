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
public class Estado {
    private int idestado;
    private String nome;
    private String uf;
    private int idpais;

  public int getIdestado()
  {
    return idestado;
  }

  public void setIdestado(int idestado)
  {
    this.idestado = idestado;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getUf()
  {
    return uf;
  }

  public void setUf(String uf)
  {
    this.uf = uf;
  }

  public int getIdpais()
  {
    return idpais;
  }

  public void setIdpais(int idpais)
  {
    this.idpais = idpais;
  }

    @Override
    public String toString()
    {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

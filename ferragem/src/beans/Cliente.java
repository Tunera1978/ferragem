package beans;

/*
 * @author Tune
 */

public class Cliente
{
  private int idcliente;
  private String nome;
  private int fisicoJuridico;
  private String cnpj;
  private String inscricao;
  private String cpf;
  private String rg;

  public int getIdcliente()
  {
    return idcliente;
  }

  public void setIdcliente(int idcliente)
  {
    this.idcliente = idcliente;
  }
  
  public int getFisicoJuridico()
  {
    return fisicoJuridico;
  }

  public void setFisicoJuridico(int fisicoJuridico)
  {
    this.fisicoJuridico = fisicoJuridico;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getCnpj()
  {
    return cnpj;
  }

  public void setCnpj(String cnpj)
  {
    this.cnpj = cnpj;
  }

  public String getInscricao()
  {
    return inscricao;
  }

  public void setInscricao(String inscricao)
  {
    this.inscricao = inscricao;
  }

  public String getCpf()
  {
    return cpf;
  }

  public void setCpf(String cpf)
  {
    this.cpf = cpf;
  }

  public String getRg()
  {
    return rg;
  }

  public void setRg(String rg)
  {
    this.rg = rg;
  }

  @Override
  public String toString()
  {
    return nome; //To change body of generated methods, choose Tools | Templates.
  }

  

}

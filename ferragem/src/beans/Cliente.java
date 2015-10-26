package beans;

/*
 * @author Tune
 */

public class Cliente
{

  private int identidade;
  private String nome;
  private boolean fisicoJuridico;
  private String cnpj;
  private String inscricao;
  private String cpf;
  private String rg;
  

  public int getIdentidade()
  {
    return identidade;
  }

  public void setIdentidade(int identidade)
  {
    this.identidade = identidade;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public boolean isFisicoJuridico()
  {
    return fisicoJuridico;
  }

  public void setFisicoJuridico(boolean fisicoJuridico)
  {
    this.fisicoJuridico = fisicoJuridico;
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

}

package beans;

/*
 * @author Tune
 */

public class Cliente
{

  private int idcliente;
  private String nome;
  private byte fisicoJuridico;
  private String cnpj;
  private String inscricao;
  private String cpf;
  private String rg;

    public byte getFisicoJuridico() {
        return fisicoJuridico;
    }

    public void setFisicoJuridico(byte fisicoJuridico) {
        this.fisicoJuridico = fisicoJuridico;
    }
  

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

     @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nome=" + nome + ", fisicoJuridico=" + fisicoJuridico + ", cnpj=" + cnpj + ", inscricao=" + inscricao + ", cpf=" + cpf + ", rg=" + rg + '}';
    }


}

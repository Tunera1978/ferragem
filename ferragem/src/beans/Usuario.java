
package beans;

public class Usuario {
    
    private int idusuario;
    private String nome;
    private String senha;
    private int nivelacesso;
        
    public int getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(int nivelacesso) {
        this.nivelacesso = nivelacesso;
    }    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString()
  {
    return this.nome;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Usuario)
    {
      Usuario us = (Usuario) obj;
      return us.getNome().equals(this.getNome());
    }
    else
    {
      return false;
    }
  }
}

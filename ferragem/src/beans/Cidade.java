
package beans;


public class Cidade {
    private int idcidade;
    private String descricao;
    private String codMunicipio;
    private String codSiafi;
    private String estado;

  public int getIdcidade()
  {
    return idcidade;
  }

  public void setIdcidade(int idcidade)
  {
    this.idcidade = idcidade;
  }

  public String getDescricao()
  {
    return descricao;
  }

  public void setDescricao(String descricao)
  {
    this.descricao = descricao;
  }

  public String getCodMunicipio()
  {
    return codMunicipio;
  }

  public void setCodMunicipio(String codMunicipio)
  {
    this.codMunicipio = codMunicipio;
  }

  public String getCodSiafi()
  {
    return codSiafi;
  }

  public void setCodSiafi(String codSiafi)
  {
    this.codSiafi = codSiafi;
  }

  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String estado)
  {
    this.estado = estado;
  }
    

    //metodo to string para retornar o nome do idioma ao inves do codigo no preenchimento do combo
     public String toString(){
        return this.descricao;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Cidade){
            Cidade iVO = (Cidade) obj;
            return iVO.getDescricao().equals(this.getDescricao());
        }else{
            return false;
        }
    }
    
     

    
    
}

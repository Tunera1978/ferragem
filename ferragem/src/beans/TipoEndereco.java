
package beans;

/**
 * @author Tune
 */
public class TipoEndereco {
    private int idtipoendereco;
    private String descricao;

  public int getIdtipoendereco()
  {
    return idtipoendereco;
  }

  public void setIdtipoendereco(int idtipoendereco)
  {
    this.idtipoendereco = idtipoendereco;
  }

  public String getDescricao()
  {
    return descricao;
  }

  public void setDescricao(String descricao)
  {
    this.descricao = descricao;
  }

  @Override
  public String toString()
  {
    return  descricao ;
  }

     
}


package beans;

import java.util.Date;

/**
 *
 * @author Tune
 */
public class ConsultaFerragem {
    
    private int idferragem;
    private int idproduto;
    private String descricao;
    private String nome;
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdferragem() {
        return idferragem;
    }

    public void setIdferragem(int idferragem) {
        this.idferragem = idferragem;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
    
}

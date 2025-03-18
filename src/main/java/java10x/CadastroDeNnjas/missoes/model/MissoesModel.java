package java10x.CadastroDeNnjas.missoes.model;


import jakarta.persistence.*;
import java10x.CadastroDeNnjas.ninjas.model.CadastroDeNinjasModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String Dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<CadastroDeNinjasModel> ninjas;



    public MissoesModel() {
    }

    public MissoesModel(Long id, String nomeMissao, String dificuldade) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        Dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        Dificuldade = dificuldade;
    }
}

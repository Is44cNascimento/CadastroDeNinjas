package java10x.CadastroDeNnjas.ninjas.model;


import jakarta.persistence.*;
import java10x.CadastroDeNnjas.missoes.model.MissoesModel;

//JPA java persistence API
//Tranformar uma classe em uma entidade DB
@Entity
@Table(name="tb_cadastro")
public class CadastroDeNinjasModel  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int  idade;
    private String nome;
    private String email;


    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public CadastroDeNinjasModel() {
    }

    public CadastroDeNinjasModel(Long id, int idade, String nome, String email, MissoesModel missoes) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.missoes = missoes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

package br.com.unialfa.sgh.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionarios;

    public Departamento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
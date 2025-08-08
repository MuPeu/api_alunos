package com.example.api_alunos.model;

import jakarta.persistence.*;

@Entity //Marca esta classe como uma estidade, indicando que ela representa
@Table(name="aluno_tb") //Especifica o nome da tabela no banco de dados a qual esta entidade está mapeada

public class Aluno {
    @Id //Marca o campo id como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Configurar a geração automática do valor da chave primária pelo banco de dados

    private Long id;

    @Column(nullable = false)
    private String name; //Indica que o campo "nome" não pode ser nulo no banco de dados

    @Column(nullable = false, unique = true)
    private String email; //Indica que o campo "email" não pode ser nulo e deve ter um valor único no banco de dados

    public Aluno() {
        //Os construtores (vazio e com argumento) são importantes para a criação de objetos "Aluno"
    }

    public Aluno(String name, String email){
        this.name=name;
        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

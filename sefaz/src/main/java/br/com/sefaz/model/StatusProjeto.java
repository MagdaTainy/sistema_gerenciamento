package br.com.sefaz.model;

import jakarta.persistence.*;

@Entity
public class StatusProjeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome; // "Planejado", "Em andamento",

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public enum StatusProjeto {
    PLANEJADO,
    EM_EXECUCAO,
    ABORTADO,
    FINALIZADO
}

}



package br.com.sefaz.model;

import jakarta.persistence.*;

@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(length = 200)
    private String descricao;

    @Column(name = "prazo")
    private int prazo;

    @ManyToOne
    @JoinColumn(name = "status_id") // Chave estrangeira para StatusTarefa
    private StatusTarefa status;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
}

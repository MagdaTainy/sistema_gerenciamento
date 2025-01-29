@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(length = 200)
    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_termino")
    private Date dataTermino;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipeResponsavel;

    @ManyToOne
    @JoinColumn(name = "status_id") // Alterado para refletir a FK correta
    private StatusProjeto status;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Equipe getEquipeResponsavel() {
        return equipeResponsavel;
    }

    public void setEquipeResponsavel(Equipe equipeResponsavel) {
        this.equipeResponsavel = equipeResponsavel;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }
}

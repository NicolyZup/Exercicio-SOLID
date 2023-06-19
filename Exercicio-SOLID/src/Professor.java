class Professor extends Funcionario {
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professor(String nome, int cpf, int numeroRegistro, String orgaoLotacao, double salario,
                     String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas){
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario,10);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas=qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void adiconaTurma(int turma){
        qtdTurmas += turma;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("----------DADOS----------");
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Número registro: "+getNumeroRegistro());
        System.out.println("Órgão de lotação: "+getOrgaoLotacao());
        System.out.println("Nível de graduação: "+getNivelGraduacao());
        System.out.println("----------FINANCEIRO-----------------");
        System.out.println("Salário anterior: R$"+getSalario());
        System.out.println("Aumento aplicado: "+getAumentoSalario()+"%");
        System.out.println("Seu salário atual é: R$"+calcularAumento());
        System.out.println("----------FUNÇÃO----------------");
        System.out.println("Disciplina ministrada: "+getDisciplinaMinistrada());
        System.out.println("Quantidade de alunos: "+getQtdAlunos());
        System.out.println("Quantidade de turmas: "+getQtdTurmas());
    }
}

abstract class Funcionario {
    private String nome;
    private int cpf;
    private int numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    private double aumentoSalario;

    public Funcionario(String nome, int cpf, int numeroRegistro, String orgaoLotacao, double salario, double aumentoSalario){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
        this.aumentoSalario = aumentoSalario;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public double getAumentoSalario() {
        return aumentoSalario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void reembolsoDespesas(double valor){
        System.out.println("Reembolso de despesa no valor: R$"+valor+" realizado com sucesso!");
    }

    public double calcularAumento(){
       double porcentagem = this.aumentoSalario / 100;
       double calculo = this.salario * porcentagem ;
       return this.salario +=calculo;
    }

    public abstract void mostrarInformacoes();
}

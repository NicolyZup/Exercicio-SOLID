class FuncionarioAdm extends Funcionario {
    private String funcaoADm;
    private String senioridade;

    public FuncionarioAdm(String nome, int cpf, int numeroRegistro, String orgaoLotacao, double salario,
                          String funcaoADm, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, 10);
        this.funcaoADm = funcaoADm;
        this.senioridade = senioridade;

    }

    public String getFuncaoADm() {
        return funcaoADm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setFuncaoADm(String funcaoADm) {
        this.funcaoADm = funcaoADm;
    }

    public void setSerionidade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("----------DADOS----------");
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Número registro: "+getNumeroRegistro());
        System.out.println("Órgão de lotação: "+getOrgaoLotacao());
        System.out.println("----------FINANCEIRO-----------------");
        System.out.println("Salário anterior: R$"+getSalario());
        System.out.println("Aumento aplicado: "+getAumentoSalario()+"%");
        System.out.println("Seu salário atual é: R$"+calcularAumento());
        System.out.println("----------FUNÇÃO----------------");
        System.out.println("Função administrativa: "+getFuncaoADm());
        System.out.println("Senioridade: "+getSenioridade());
    }
}

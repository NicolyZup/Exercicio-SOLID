class Estagiario extends Funcionario{
    private Professor professorSupervisor;

    public Estagiario(String nome, int cpf, int numeroRegistro, String orgaoLotacao, double salario
                      , Professor professorSupervisor){
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario,10);
        this.professorSupervisor = professorSupervisor;
    }

    public Professor getProfessorSupervisor() {
        return professorSupervisor;
    }

    public void setProfessorSupervisor(Professor professorSupervisor) {
        this.professorSupervisor = professorSupervisor;
    }

    @Override
    public void reembolsoDespesas(double valor) {
        super.reembolsoDespesas(valor);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("----------DADOS----------");
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Número registro: "+getNumeroRegistro());
        System.out.println("Órgão de lotação: "+getOrgaoLotacao());
        System.out.println("----------FINANCEIRO-----------------");
        System.out.println("Bolsa anterior: R$"+getSalario());
        System.out.println("Seu aumento foi de: "+getAumentoSalario()+"%");
        System.out.println("Sua bolsa atual é: R$"+calcularAumento());
        System.out.println("----------FUNÇÃO----------------");
        System.out.println("Professor supervisor(a): "+ getProfessorSupervisor().getNome());
    }
}

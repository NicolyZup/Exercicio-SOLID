import java.util.ArrayList;
import java.util.List;

class Coordenador extends Funcionario {
    private List<String> professoresSupervisionados;

    public Coordenador(String nome, int cpf, int numeroRegistro, String orgaoLotacao, double salario){
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, 5);
        this.professoresSupervisionados = new ArrayList<>();
    }

    public void aicionarProfessor(String professor) {
        professoresSupervisionados.add(professor);
        System.out.println("Professor(a) "+professor+" adicionado à lista de professores supervisionados.");
    }

    public List<String> getProfessoresSupervisionados() {
        return professoresSupervisionados;
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
        System.out.println("Professores supervisionados: "+ getProfessoresSupervisionados());
    }
}

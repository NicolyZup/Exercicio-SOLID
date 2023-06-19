import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaADM {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Coordenador> coordenadores = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<FuncionarioAdm> funcionariosAdm = new ArrayList<>();
        List<Estagiario> estagiarios = new ArrayList<>();


        professores.add(new Professor("Milton", 12537486, 111111, "Exatas",
                1500.00, "Pós doutorado", "Matematica", 90, 3));

        professores.add(new Professor("Jaqueline", 21346527, 222222, "Exatas",
                1550.00, "Graduação completa", "Física", 30, 1));

        professores.add(new Professor("Rogerio", 25263747, 3333333, "Humanas",
                1600.00, "Graduação completa", "História", 60, 2));

        professores.add(new Professor("Marcos", 95485287, 4444444, "Humanas",
                1800.00, "Doutorado", "Literatura", 120, 4));


        System.out.println("======================================================");
        System.out.println("SISTEMA ADMINISTRATIVO ZUP-EDUCATION");
        System.out.println("======================================================");

        System.out.println("Realize seu cadastro!");
        System.out.println("======================================================");

        System.out.println("Informe seu nome:");
        String nomeInformado = entrada.next();

        System.out.println("Informe seu cpf:");
        int cpfInformado = entrada.nextInt();

        System.out.println("Informe seu número de registro:");
        int numeroRegistroInformado = entrada.nextInt();

        System.out.println("Informe seu órgão de lotação:");
        String orgaoInformado = entrada.next();

        System.out.println("Informe seu salário/bolsa:");
        double salarioInformado = entrada.nextDouble();

        System.out.println("Qual o seu cargo? Professor, Coordenador, Administrativo (funcionários adm) e Estagiário: ");
        String cargoInformado = entrada.next();

        if(cargoInformado.toLowerCase().equals("professor")){
            System.out.println("Informe qual seu nível de graduação:");
            String nivelInformado = entrada.next();

            System.out.println("Informe qual disciplina você ministra:");
            String disciplinaInformada = entrada.next();

            System.out.println("Informe a quantidade de alunos:");
            int qtdAlunosInformadas = entrada.nextInt();

            System.out.println("Informe a quantidade de turmas:");
            int qtsTurmasInformadas = entrada.nextInt();

            Professor professorCriado = new Professor(nomeInformado,cpfInformado,numeroRegistroInformado,orgaoInformado,
                    salarioInformado,nivelInformado,disciplinaInformada,qtdAlunosInformadas,qtsTurmasInformadas);
            professores.add(professorCriado);

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("===============================");
            professorCriado.mostrarInformacoes();
        }

        if(cargoInformado.toLowerCase().equals("coordenador")){
            System.out.println("Quantos professores você supervisiona?");
            int professoresSupervisionados = entrada.nextInt();

            Coordenador coordenadorCriado = new Coordenador(nomeInformado,cpfInformado,numeroRegistroInformado,
                    orgaoInformado,salarioInformado);

            for(int i =1; i<=professoresSupervisionados;i++){
                System.out.println("Informe o nome do(a) "+i+"º professor(a) supervisionado:");
                String nomeProf = entrada.next();

                coordenadorCriado.aicionarProfessor(nomeProf);
            }

            coordenadores.add(coordenadorCriado);

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("===============================");
            coordenadorCriado.mostrarInformacoes();
        }

        if(cargoInformado.toLowerCase().equals("administrativo")){
            System.out.println("Informe qual a sua função administrativa:");
            String funcaoInformada = entrada.next();

            System.out.println("Informe sua senioridade:");
            String senioridadeInformada = entrada.next();

            FuncionarioAdm funcionarioCriado = new FuncionarioAdm(nomeInformado,cpfInformado,numeroRegistroInformado,
                    orgaoInformado,salarioInformado,funcaoInformada,senioridadeInformada);

            funcionariosAdm.add(funcionarioCriado);

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("===============================");
            funcionarioCriado.mostrarInformacoes();
        }

        if(cargoInformado.toLowerCase().equals("estagiário")||cargoInformado.toLowerCase().equals("estagiario")){
            System.out.println("Informe seu professor(a) supervisor (Informe o nome):");

            for(Professor professor:professores){
                System.out.println(professor.getNome());
            }

            String professorInformado = entrada.next();

           Professor profEncontrado = buscarProfessor(professorInformado, professores);

           if(profEncontrado == null){
               System.out.println("Professor não localizado em sistema, por gentileza acione o administrador.");
           }

           Estagiario estagiarioCriado = new Estagiario(nomeInformado,cpfInformado,numeroRegistroInformado,orgaoInformado,
                  salarioInformado,profEncontrado);

           estagiarios.add(estagiarioCriado);

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("===============================");
            estagiarioCriado.mostrarInformacoes();
        }

    }

    private static Professor buscarProfessor(String nomeProf , List<Professor> professores) {
        for(int i=0;i < professores.size();i++){
            if(professores.get(i).getNome().equals(nomeProf)){
                return professores.get(i);
            }
        }
        return null;
    }

}



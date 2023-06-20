# Exercício-SOLID
Repositório criado para entrega do exercício de modelagem de classes com herança do programa catalisa.

## Exercício proposto:
Modele as classes referentes aos funcionários de uma universidade, que serão os
professores, coordenadores e funcionários administrativos.

O que fazer de novo:
Teremos agora estagiários, - esses não têm salários e sim bolsas.
Estagiários são vinculados a professores que têm até 2 - dois.
Todos os funcionários e estagiários terão a função reembolso despesas.
Fim!

- Os atributos comuns de todos os funcionários são: Nome, CPF, número de
registro, órgão de lotação e salário.
- Os professores possuem os atributos: Nível de graduação, disciplina ministrada ,
quantidade de alunos e quantidade de turmas.
- Os coordenadores possuem os atributos: ProfessoresSupervisionados
- Os funcionários administrativos possuem os atributos: Função Administrativa e
Senioridade.

Implemente, além dos getters e setters e os construtores, os seguintes métodos:

● aumentoSalario: para todos menos os coordenadores aumenta o salário em
10% e para os coordenadores o aumento é de 5%.

● adicionaTurma: para os professores.

● adicionaProfessor (para os coordenadores): Para adicionar um professor na
lista de professores supervisionados.

LEVEL UP

● Crie uma classe turma, que se tornará uma caraterística dos professores por
meio de composição.

● Limite a quantidade de professores supervisionados na classe coordenador.

## Conteúdos aplicados e estudados:
- estrutura de repetição: for
- estrutura de decisão: if/else
- listas
- conceitos de POO

## Melhorias:
- Implementar classe turma como característica da classe professores por meio de composição (assunto ainda não passado);
- Além de somente se cadastrar no sistema, implementar visualizar cadastro, editar cadastro e solicitar reembolso (para usuário já com cadastro);
- Limitar número de professores supervisionados;
- Tratativas de erros e exceções;

<h1 align="center"> Boas Práticas de Software </h1>

<p>
Este projeto foi desenvolvido como atividade prática sobre boas práticas de programação, organização e legibilidade de código.

O sistema é um programa simples em Java que recebe o nome de um aluno e duas notas, calcula sua média e informa se ele foi aprovado ou reprovado.

O objetivo principal da atividade foi analisar um código inicial funcional, porém pouco organizado, e realizar melhorias utilizando boas práticas de desenvolvimento.
</p>

## 🎓 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java
- Git e Github

## 🚩 Versão inicial

O código original concentrava todas as responsabilidades dentro do método main e utilizava nomes pouco descritivos para as variáveis, como:

- `n` para representar o nome do aluno;
- `a` e `b` para representar as notas;
- `c` para representar a média.

Essa organização dificultava a compreensão do código e sua manutenção.

## 🎇 Melhorias realizadas

Na branch `melhoria-boas-praticas`, foram realizadas as seguintes alterações:

- Substituição de nomes pouco descritivos por nomes mais claros, como `nomeAluno`, `primeiraNota`, `segundaNota` e `media`.
- Modularização do código por meio da criação de métodos com responsabilidades específicas.
- Criação do método `calcularMedia()` para realizar o cálculo da média.
- Criação do método `verificarSituacaoAluno()` para determinar se o aluno foi aprovado ou reprovado.
- Criação do método `mostrarResultado()` para apresentar as informações do aluno.
- Organização e padronização da indentação e dos nomes utilizados no código.

## 📜 Questões

### 1. Qual era o principal problema do código original?
O principal problema era a falta de organização e legibilidade. Todas as operações estavam concentradas no método `main`, além de serem utilizadas variáveis com nomes pouco descritivos.

Isso tornava o código mais difícil de compreender e de realizar alterações futuras.

### 2. Quais melhorias você realizou?
Foram melhorados os nomes das variáveis, as responsabilidades foram separadas em métodos e o código foi padronizado para facilitar a leitura e compreensão.

A estrutura passou a utilizar métodos específicos para calcular a média, verificar a situação do aluno e apresentar os resultados.

### 3. Como a modularização facilitou a organização do código?
A modularização permitiu dividir o programa em partes menores, cada uma responsável por uma tarefa específica.

Dessa forma, o método `main` passou a organizar o fluxo principal do programa, enquanto cada método realiza uma responsabilidade específica. Isso facilita a compreensão, manutenção e possíveis alterações no sistema.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar o desenvolvimento do projeto por meio de commits, mantendo o histórico das alterações realizadas.

Primeiramente, foi registrado o código original na branch main. Em seguida, foi criada a branch melhoria-boas-praticas, onde foram realizadas as melhorias no código.

Após as alterações, foram criados novos commit e realizado a integração das mudanças por meio de um Pull Request e posteriormente do merge para a branch main.


---

<h4 align="center">By: Lisa 🤍</h4>
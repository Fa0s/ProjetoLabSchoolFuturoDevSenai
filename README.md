<h1 align='center'> Projeto LabSchool</h1>
<div align='center'>
    <a href='https://www.java.com/en/'>
        <img src='https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white'>
        </img>
    </a>
</div>

# 📰 Índice

- [Sobre](#-Sobre)
- [Requisitos da Aplicação](#-Requisitos-da-Aplicaçao)
- [Roteiro da Aplicação](#-Roteiro-da-Aplicação)
- [Plano de Projeto](#-Plano-de-Projeto)
<br></br>

# 📃 Sobre
" *A escola de programação Lab School deseja automatizar todo o sistema de armazenamento de informações referentes aos alunos, funcionários e professores. O sistema deve conter tipos de cadastros, cada um com suas características descritas no **roteiro da aplicação**.*"
<br></br>

# ✅ Requisitos da aplicação
A aplicação que deverá ser realizada individualmente deve contemplar os seguintes requisitos:
- O sistema deverá ser desenvolvido em Java;
- O sistema deve seguir o Roteiro da Aplicação;
- Desenvolvimento das mensagens de saída, com espera da ação do usuário;
- Captura da interação do usuário via entrada padrão;
- O sistema deverá ser apresentado diretamente na linha de comando.
<br></br>

# 📋 Roteiro da Aplicação
- **Aluno**
    - Um aluno pode estar com a matrícula nas seguintes condições:
        - Ativo
        - Irregular
        - Atendimento pedagógico
        - Inativo
            - O usuário do sistema poderá alterar esta condição sempre que necessário
    - O aluno deve armazenar a nota do processo seletivo de entrada (0 até 10)
        - Esta nota deve ser inserida no momento do cadastro do aluno
    - Total de atendimentos pedagógicos realizados
        - Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado

- **Professor**
    - Formação acadêmica:
        - Graduação incompleta
        - Graduação completa
        - Mestrado
        - Doutorado
    -   Experiência em desenvolvimento:
        - Front-End
        - Back-End
        - Full-Stack
    - Estado
        -   Ativo
        -   Inativo

- **Pedagogo**
    - Total de atendimentos pedagógicos realizados:
        - Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado
        - O sistema deve perguntar qual foi o pedagogo e aluno participaram do atendimento
<br></br>

Todos os cadastros devem ser derivadas da classe Pessoa, que possui os seguintes atributos e métodos:
- **Pessoa**
    - Nome
    - Telefone
    - Data de nascimento
    - CPF
    - Identificador/Código
        - Deve ser gerado automaticamente pelo sistema.
<br></br>

O Lab School também deverá apresentar os seguintes relatórios:

- Listar todas as pessoas cadastradas. O usuário deverá informar quais categorias de pessoas deseja listar (deve-se listar Código, Nome e CPF):
    - Alunos
    - Professores
    - Funcionários
    - Todos

- Relatório dos Alunos. O usuário deve escolher qual categoria apresentar  (deve-se listar código, nota e total de atendimentos pedagógicos):
    - Ativo
    - Irregular
    - Atendimento pedagógico
    - Inativo
    - Todos

- Relatório dos professores. O usuário deve escolher qual categoria apresentar:
    - Front-End
    - Back-End
    - Full-Stack
    - Todos

- Alunos com mais atendimentos pedagógicos
- Pedagogos com mais atendimentos pedagógicos
<br></br>

# 💭 Plano de projeto

Ao construir a aplicação proposta, o aluno estará colocando em prática os aprendizados em:
- **Programação Orientada a Objetos:** Conceitos de POO, Classes, Objetos, Métodos de Classes e Métodos Estáticos, Encapsulamento, Herança, Polimorfismo.
- **Modelagem:** Criação de Classes e Abstração
- **JAVA:** Ambiente virtual, Variáveis, Operadores lógicos, aritméticos e de comparação, Métodos, Listas, Condicionais, Strings, Loops e Funções.

<br></br>
### Desenvolvido por **Filipe Oliveira** 
<div align="center">
<a href='https://www.linkedin.com/in/faosoliveira/'>
    <img src='https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white'></img></a></div>






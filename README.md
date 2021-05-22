# Trabalho final do capítulo

### Enunciado do trabalho

Você deverá entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

![img](https://lh5.googleusercontent.com/cDZdgzw_GKbRb2FIgkoRh_LxTW-K6TUUXX1QC5uYkPhBOPTbo6oIzYBpR0-FPazupgD6ZNX3AizvQS_R1eHVwbKtX7G6qCxeAcULBkUSIN5dAMB1NALbWj7FZj8JwXLRAy_UKT8a)



Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).

![warning](https://github.githubassets.com/images/icons/emoji/unicode/26a0.png) `**Atenção:** *lembre-se de que por padrão a JPA transforma nomes de atributos em camel case para snake case, como foi o caso do campo imgUrl do DSCatalog, que no banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado no banco de dados como birth_Date, então seu script SQL deverá seguir este padrão.*`



# Autor

Tiago Gomes de Lima<br>
[![Linkedin Badge](https://img.shields.io/badge/Tiago_Gomes-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/tiago-gomes187/)](https://www.linkedin.com/in/tiago-gomes187/) 

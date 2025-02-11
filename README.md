# Simple CRUD App

Este projeto é uma aplicação RestAPI construída com Java e Spring Boot no back-end e jQuery com Ajax no front-end. A aplicação fornece endpoints RESTful para manipular dados e utiliza chamadas Ajax para comunicação assíncrona entre o cliente e o servidor.

## ⚙️ Funcionalidades

- CRUD (Create, Read, Update, Delete) completo para gerenciamento de recursos.
- Comunicação assíncrona com o servidor utilizando Ajax.
- Tratamento de erros no cliente e no servidor.

## 🪄 Tecnologias Utilizadas

### Back-End
- Java: Linguagem de programação principal.
- Spring Boot: Framework para simplificar o desenvolvimento de aplicações Java.
  - Spring Web: Para criar endpoints REST.
  - Spring Data JPA: Para interação com o banco de dados.
  - MySQL: Banco de Dados utilizado para o armazenamento de dados.
 
## ✨ Design UI


### Fron-End
- HTML5: Para a estruturação.
- Bootstrap: Para a estilização.
- JavaScript: Para lógica de interação no front-end.
- JQuery: Para manipulação do DOM e chamadas Ajax.

## 🛠️Instalação e Execução
### Pré-Requisitos
- Java 21.
- Maven (para gerenciar dependências)
- Banco de Dados configurado.
- Docker (caso queira executar em um ambiente Docker)
### Construir e executar com Maven
1. Clone o repositório
```bash
git clone https://github.com/MarcosSC00/simple-crud.git
```
2. No diretório do projeto, execute o seguinte comando para compilar a aplicação:
```bash
mvn clean package
```
3. Em seguida execute a aplicação via Jar
```bash
java -jar target/simple-crud-0.0.1-SNAPSHOT.jar
```
Analise o log no terminal, se tudo estiver dado certo você poderá acessar a aplicação em [http://localhost:8080]().

## 🐋 Executando via Docker

1. Primeiramente crie a imagem da aplicação com o seguinte comando:
```bash
docker build -t simple-crud
```
>[!IMPORTANT]
>Lembre-se de estar no diretório raiz do projeto ao executar os comandos.

2. Em seguida suba a aplicação por meio do Docker Compose:
```bash
docker compose up -d
```
Após a iniicalização você poderá acessar aplicação em [http://localhost:8080]().

## 📲 Contatos

Caso tenha alguma dúvida ou sugestão entre em contato comigo.
- email: msilvachaves02@gmail.com
- celular/wathsApp: (98)9824-88698

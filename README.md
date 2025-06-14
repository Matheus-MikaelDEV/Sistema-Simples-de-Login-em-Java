# 🔐 Sistema Simples de Login em Java

Este projeto é uma aplicação básica de console desenvolvida em Java, criada para praticar conceitos de **Programação Orientada a Objetos (POO)** e o uso da **Java Collections Framework**. Ele simula um sistema simples de gerenciamento de usuários com funcionalidades de **cadastro**, **login** e **listagem**.

> 📘 **Este projeto foi desenvolvido como parte de um trabalho escolar para a disciplina de Programação Orientada a Objetos.**

---

## ✨ Funcionalidades

**Gerenciamento de Usuários:**
- Cadastrar novos usuários com nome, email e senha.
- Impedir cadastro duplicado com base no nome de usuário ou email.
- Listar todos os usuários cadastrados.

**Autenticação (Login):**
- Login via nome de usuário ou email.
- Verificação de senha.
- Mensagem de boas-vindas personalizada após login bem-sucedido.

---

## 🎯 Conceitos Demonstrados

Este projeto é ideal para quem está começando com Java e deseja entender:

### 🧱 Programação Orientada a Objetos (POO)
- **Classes e Objetos**: `User` representa uma entidade do mundo real.
- **Encapsulamento**: Atributos privados com acesso controlado por métodos públicos (getters).
- **Modularização**: Separação de responsabilidades entre as classes `Program`, `LoginUtil` e `User`.

### 🗃️ Java Collections Framework
- **List e ArrayList**: Armazenamento dinâmico dos usuários cadastrados.
- **Stream API (Java 8+)**: Utilizada para verificação de existência de usuários e autenticação (`anyMatch`).

### 💻 Entrada/Saída no Console
- **Scanner** para capturar dados do usuário.
- **System.out.println** para exibir mensagens no terminal.

### 🔁 Controle de Fluxo
- Menu com laço `do-while`.
- Comando `switch` para controle das opções.

---

## 🧪 Exemplo de Uso

```plaintext
----Sistema de login----
Escolha uma opção:
[1] - Cadastrar usuário
[2] - Login
[3] - Listar usuários
[4] - Sair

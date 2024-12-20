# Desafio: Sistema de Gerenciamento de Estoque e Pedidos

Este desafio tem como objetivo praticar o desenvolvimento back-end utilizando Java com Spring Boot e MySQL. Você deverá criar um sistema completo, incluindo a implementação de funcionalidades básicas e avançadas relacionadas à gestão de estoque e pedidos de uma loja fictícia.

---

## **Objetivo do Desafio**
Desenvolver um sistema que permita:

1. **Gestão de Produtos:** Cadastro, consulta, atualização e remoção.
2. **Gestão de Clientes:** Cadastro, consulta, atualização e remoção.
3. **Gestão de Pedidos:** Registro de pedidos vinculados a clientes e produtos, com cálculo automático de valores e atualização do estoque.
4. **Relatórios:** Geração de relatórios sobre pedidos e produtos mais vendidos.

---

## **Requisitos do Projeto**

### **Funcionais**
1. O sistema deve permitir o cadastro de produtos, clientes e pedidos.
2. O estoque de produtos deve ser atualizado automaticamente ao registrar um pedido.
3. Relatórios devem ser gerados com base nos dados do sistema, como:
    - Pedidos realizados em um período específico.
    - Produtos mais vendidos.

### **Não Funcionais**
1. O sistema deve ser desenvolvido em Java com Spring Boot.
2. Utilizar MySQL como banco de dados.
3. Implementar autenticação básica para proteger os endpoints.
4. Documentar a API utilizando Swagger.

---

## **Regras de Negócio**
1. Não é permitido registrar pedidos com quantidade superior ao estoque disponível.
2. Todos os produtos devem pertencer a uma categoria.
3. Clientes devem ter um cadastro válido com nome, telefone e e-mail.

---

## **Entrega**

Você terá algumas semanas para desenvolver o sistema. O projeto deve incluir:

1. Código-fonte completo com boas práticas de organização e legibilidade.
2. Banco de dados configurado e populado com dados iniciais (scripts ou configurações).
3. Documentação do projeto, incluindo instruções para rodar o sistema e descrição dos endpoints.

---

**Bom trabalho!** 🚀

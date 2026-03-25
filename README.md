# 🚀 CRUD de Gestores

Sistema web completo desenvolvido com **Java + Spring Boot**, com interface dinâmica e deploy em produção.

🔗 **Acesse online:**
https://crud-gestores.onrender.com/gestores

---

## 📸 Demonstração

Sistema permite gerenciar gestores de forma simples e eficiente:

* Cadastro de gestores
* Listagem em tabela
* Edição de dados
* Remoção de registros

---

## 🧠 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos essenciais de desenvolvimento backend e web, incluindo:

* Arquitetura em camadas
* Integração com banco de dados
* Renderização de páginas dinâmicas
* Deploy em ambiente real

---

## 🛠️ Tecnologias utilizadas

* **Java 21**
* **Spring Boot**
* **Spring Data JPA**
* **Thymeleaf**
* **H2 Database**
* **Docker**
* **Render (Cloud Deploy)**

---

## 🧱 Arquitetura

O projeto segue o padrão MVC (Model-View-Controller):

* **Model:** Representa a entidade `Gestor`
* **Repository:** Comunicação com o banco de dados
* **Service:** Regras de negócio
* **Controller:** Camada de entrada HTTP (API + Web)

---

## ⚙️ Funcionalidades

| Funcionalidade | Descrição                  |
| -------------- | -------------------------- |
| Criar          | Cadastro de novos gestores |
| Listar         | Exibição em tabela         |
| Editar         | Atualização de dados       |
| Deletar        | Remoção de registros       |

---

## ▶️ Como rodar localmente

```bash
git clone https://github.com/marcosvors0x/crud-gestores.git
cd crud-gestores
mvn spring-boot:run
```

Acesse:

```
http://localhost:8080/gestores
```

---

## 🐳 Deploy

Aplicação containerizada com Docker e publicada no Render.

---

## ⚠️ Observações importantes

* O projeto utiliza **H2 em memória**
* Em ambiente de produção, os dados podem ser resetados
* Próximo passo recomendado: migração para **PostgreSQL**

---

## 🚀 Melhorias futuras

* Integração com banco PostgreSQL
* Sistema de autenticação (login)
* Validação de formulários
* Interface com CSS moderno

---

## 👨‍💻 Autor

**Marcos Vinicius**
🔗 https://github.com/marcosvors0x

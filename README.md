# Gestão de Vagas  

Uma aplicação para gerenciar candidatos, empresas e vagas, desenvolvida em Java com Spring Boot.  
<img src="https://private-user-images.githubusercontent.com/160747774/390592711-b4593165-4431-444a-99f7-e639eae11615.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzMwMjYwMDUsIm5iZiI6MTczMzAyNTcwNSwicGF0aCI6Ii8xNjA3NDc3NzQvMzkwNTkyNzExLWI0NTkzMTY1LTQ0MzEtNDQ0YS05OWY3LWU2MzllYWUxMTYxNS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjAxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIwMVQwNDAxNDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yZDNhZDU0M2U5MTQyNzQyZDRlZjIyNTU5OWM5YTllNTE4ZDZiOGM1ODE3YTgyYTUxMmQwNDNjNGMyMDg0MTY3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.0YzmaLOkmn3JRm4um7g0SgBFeDEGG_DA6D91h6q-p60" alt="Texto Alternativo">

## Funcionalidades  
- **Cadastro de Candidatos:** gerenciamento de informações pessoais e currículos.  
- **Cadastro de Empresas:** gerenciamento de informações empresariais.  
- **Cadastro e Gerenciamento de Vagas:** criação, edição e exclusão de vagas.  
- **Autenticação e Autorização:** segurança com Spring Security.  

## Tecnologias Utilizadas  
- **Back-end:** Java, Spring Boot, Spring Security, JPA (Hibernate).  
- **Banco de Dados:** AWS RDS (PostgreSQL).  
- **Containerização:** Docker.  
- **CI/CD:** GitHub Actions para integração e deploy contínuo.  
- **Deploy:** AWS EC2.  

## Pré-requisitos  
- Docker e Docker Compose instalados.  
- AWS CLI configurado (opcional para deploy).  

## Executando a Aplicação Localmente  
1. Clone o repositório:  
   ```bash
   git clone https://github.com/seu-usuario/gestao-vagas.git
   cd gestao-vagas
   ```  
2. Configure as variáveis de ambiente no arquivo `.env` (exemplo disponível no repositório).  
3. Inicie os serviços com Docker Compose:  
   ```bash
   docker-compose up
   ```  

## Deploy na AWS  
O deploy é automatizado com GitHub Actions:  
1. Configure as credenciais da AWS como secrets no repositório.  
2. Atualize a branch principal para disparar o pipeline.  

## Autor  
Desenvolvido por Jean.  
- [LinkedIn](https://www.linkedin.com/in/jeanclaro/)   
--- 

Se precisar de algo mais específico, é só falar! 😊

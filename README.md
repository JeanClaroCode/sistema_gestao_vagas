# Gestão de Vagas  

Uma aplicação para gerenciar candidatos, empresas e vagas, desenvolvida em Java com Spring Boot.  
<img src="https://private-user-images.githubusercontent.com/160747774/390592711-b4593165-4431-444a-99f7-e639eae11615.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzI3NTA2MTQsIm5iZiI6MTczMjc1MDMxNCwicGF0aCI6Ii8xNjA3NDc3NzQvMzkwNTkyNzExLWI0NTkzMTY1LTQ0MzEtNDQ0YS05OWY3LWU2MzllYWUxMTYxNS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMTI3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTEyN1QyMzMxNTRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02YTIzYmQwN2NlYzlkZmM2NDk2YTNiNjBjNjMzMTE0ZWQ1ZWRkMzMzOGFjZDZmNmZlNDVhNTYzNGQ3YWQzZjM0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.6QlOE8s3AjVrQ8_mCw5qlzPWZ97JJagH2DPLn_aYEUg" alt="Texto Alternativo">

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

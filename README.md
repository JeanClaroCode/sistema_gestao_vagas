# Gestão de Vagas  

Uma aplicação para gerenciar candidatos, empresas e vagas, desenvolvida em Java com Spring Boot.  
<img src="https://cdn.discordapp.com/attachments/1290024608807784549/1315452623138197524/screencapture-54-167-28-98-8080-swagger-ui-index-html-2024-11-27-20_26_05.png?ex=67577639&is=675624b9&hm=80b9f00106ada0f56e59a9904d71c57f1f5b7293dcdcef4f97b492dde0ce3512&" alt="Texto Alternativo">

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

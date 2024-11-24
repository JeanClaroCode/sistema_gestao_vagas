package br.com.jeanclaro.gestao_vagas.exceptions;

public class CompanyNotFoundException extends RuntimeException {
    public CompanyNotFoundException(){ 
        super("Company not Found");
    }
}

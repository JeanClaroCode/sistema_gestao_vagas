package br.com.jeanclaro.gestao_vagas.modules.company.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeanclaro.gestao_vagas.modules.company.dto.CreateJobDTO;
import br.com.jeanclaro.gestao_vagas.modules.company.entities.JobEntity;
import br.com.jeanclaro.gestao_vagas.modules.company.useCases.CreateJobUseCase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobUseCase createJobUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody CreateJobDTO createjobDTO, HttpServletRequest request){
        var companyId = request.getAttribute("company_id"); //recuperando getAtrribute 

        // jobEntity.setCompanyId(UUID.fromString(companyId.toString()));// como companyId pode ser um objeto setamos como string 

        var jobEntity = JobEntity.builder()
            .benefits(createjobDTO.getBenefits())
            .companyId(UUID.fromString(companyId.toString()))
            .description(createjobDTO.getDescription())
            .level(createjobDTO.getLevel())
            .build();
    

        return this.createJobUseCase.execute(jobEntity);
    }
}

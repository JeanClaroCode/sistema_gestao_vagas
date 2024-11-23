package br.com.jeanclaro.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
public class CreateJobDTO {

    @Schema(example = "Vaga para pessoa Desenvolvedora Júnior", requiredMode = RequiredMode.REQUIRED)
    private String description;
    @Schema(example = "GYMPass, Plano de Saúde", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
    @Schema(example = "Júnior", requiredMode = RequiredMode.REQUIRED)
    private String level;

}

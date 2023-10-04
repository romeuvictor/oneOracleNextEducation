package med.vall.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vall.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
		@NotNull
		Long id,
		String nome,
		String telefone,
		DadosEndereco endereco ) {

}

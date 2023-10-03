package med.vall.api.controller.medico;

import med.vall.api.medico.Especialidade;
import med.vall.api.medico.Medico;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade escialidade) {
	
	public DadosListagemMedico (Medico medico) {
		this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());	
	}

}

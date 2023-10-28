package diofacade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cpf, String cep, String produto) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cpf, cep, cidade, estado, produto);
    }
}


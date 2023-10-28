package subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cpf, String cep, String cidade, String estado, String produto) {
        System.out.println("Cliente no sistema de CRM");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Produto: " + produto);
    }
}

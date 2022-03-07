
public class Programa {

    public static void main(String[] args){

        Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        endereco.setComplemento("complemento para esse endereço");
        endereco.setBairro("bairro para este endereço");

        System.out.println(endereco.getRua());
        System.out.println(endereco.getComplemento());
        System.out.println(endereco.getBairro());

        System.out.println("------------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Breno G F Fagundes");
        vendedor.setDocumento("000.000.000-01");
        vendedor.setValorSalario(3000d);
        vendedor.setEndereco(endereco);

        vendedor.calcularBonificacao(2.0);

        System.out.println(vendedor);

        System.out.println("------------------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa();
        operadorDeCaixa.setNome("Joao");
        operadorDeCaixa.setDocumento("123.456.789-00");
        operadorDeCaixa.setValorSalario(2000d);
        operadorDeCaixa.setEndereco(endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("------------------");

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setDocumento("789.456.123-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(3.0);

        System.out.println(gerente);





        

    }
}
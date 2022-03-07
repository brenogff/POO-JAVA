public class OperadorDeCaixa extends FuncionarioCLT {

    

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public OperadorDeCaixa(){
        
    }

    @Override
    public String toString() {
        return "Operador de Caixa{" + 
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
    
}


public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" + 
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                "valorBonificacao=" + valorBonificacao +
                '}';
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
        
    }
    
}

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Gerente [documento=" + super.getDocumento() + ", endereco=" + super.getEndereco() + ", horasTrabalhadas="
                + super.getHorasTrabalhadas() + ", nome=" +super.getNome() + ", valorHora=" + super.getValorHora() + ", valorRemuneracao="
                + super.getValorRemuneracao() + ", valorBonificacao=" + this.valorBonificacao+ "]";
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
      this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100d)) + 100d;
        
    }

    
}

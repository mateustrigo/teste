public class pessoa {
    public String nome_da_pessoa;
    public Integer idade_do_velho;
    public Double peso_do_gordo;

    public Double altura_do_tonto;

    private Double imc_do_maldito;

    private String status;

    public Double calc_imc(){
        imc_do_maldito = peso_do_gordo / (altura_do_tonto*altura_do_tonto);
        if(imc_do_maldito < 16){
            status = "Magreza Grave";

        } else if (imc_do_maldito < 17) {
            status = "Magreza Moderada";

        } else if (imc_do_maldito < 18.5) {
            status = "Magreza Leve";

        } else if (imc_do_maldito < 25) {
            status = "Saudavel";

        } else if (imc_do_maldito < 30) {
            status = "Sobrepeso";

        }else if (imc_do_maldito < 35) {
            status = "Obesidade Grau I";

        }else if (imc_do_maldito < 40) {
            status = "Obesidade Grau II (severa)";

        }else if (imc_do_maldito >= 40) {
            status = "Obesidade Grau III (Morbida)";

        }

        return imc_do_maldito;

    }

    public Double getImc_do_maldito() {
        return imc_do_maldito;
    }

    public void setImc_do_maldito(Double imc_do_maldito) {
        this.imc_do_maldito = imc_do_maldito;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome_da_pessoa + '\'' +
                ", idade=" + idade_do_velho + " Anos" +
                ", peso=" + peso_do_gordo + " Kg" +
                ", altura=" + altura_do_tonto + " Mts" +
                ", imc_do_maldito=" + imc_do_maldito +
                '}';
    }
}

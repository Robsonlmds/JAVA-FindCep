public record Endereco(String logradouro, String complemento, String localidade, String uf, String cep) {

    @Override
    public String toString() {
        return "Endereco {" +
                "logradouro = " + logradouro  +
                " | complemento = " + complemento  +
                " | localidade = " + localidade +
                " | uf = " + uf +
                " | cep = " + cep +
                '}';
    }
}

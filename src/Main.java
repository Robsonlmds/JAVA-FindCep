package PACKAGE_NAME;

public class main {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CheckCep CheckCep = new CheckCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = read.nextLine();

        try {
            Endereco newAddress = CheckCep.buscaEndereco(cep);
            System.out.println(newAddress);
            GenerateJson generate = new GenerateJson();
            generate.salvaJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}

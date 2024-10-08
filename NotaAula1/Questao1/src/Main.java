import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o tamanho/peso do produto:");
        String tamanhoPeso = scanner.nextLine();

        System.out.println("Digite a cor do produto:");
        String cor = scanner.nextLine();

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque:");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        System.out.println("Digite o valor pago:");
        double valorPago = scanner.nextDouble();

        System.out.println("Digite a forma de pagamento (Pix, Espécie, Transferência, Débito ou Crédito):");
        String formaPagamento = scanner.next();

        Venda venda = new Venda(produto, valorPago, formaPagamento);
        venda.realizarVenda();
    }
}


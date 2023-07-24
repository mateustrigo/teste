import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa pessoa1 = new pessoa();
        System.out.println("insira o nome desejado:");
        pessoa1.nome_da_pessoa = sc.next();
        System.out.println("insira a idade da pessoa:");
        pessoa1.idade_do_velho = sc.nextInt();
        System.out.println("insira o peso da pessoa:");
        pessoa1.peso_do_gordo = sc.nextDouble();
        System.out.println("insira a altura da pessoa (sem ponto nem virgula):");
        pessoa1.altura_do_tonto = sc.nextDouble()/100.0;
        pessoa1.calc_imc();
        System.out.println(pessoa1.getStatus());




    }
}
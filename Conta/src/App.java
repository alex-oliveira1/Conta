import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner ler= new Scanner(System.in);
     
     System.out.println("Digite numero da conta");
     int conta=ler.nextInt(); 
     System.out.println("Nome do Cliente");
     String nome=ler.next();
     System.out.println("Você deseja iniciar com depsito Y/N");
     String op=ler.next();
     if (op.equals("y")){
        Conta c= new Conta(conta, nome, conta);
        c.setnome(nome);
        c.setNumeroConta(conta);
        System.out.println("Digite o valor que deseja depositar");
        Double saldo=ler.nextDouble();
        c.setSaldo(saldo);
        System.out.println(c.toString());
     }
     else{
        Conta c= new Conta(conta, nome);
        c.setnome(nome);
        c.setNumeroConta(conta);
        System.out.println(c.toString());
     }
     ler.close(); 
    }
   
}

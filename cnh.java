package exerciciossala;

import java.util.Scanner;

public class d2504e003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);//puxando a impressora
        
        int ex1, ex2, ex3;//declarando as variaveis
        
        System.out.print("Você foi aprovado no exame psicotenico?\n 1 - (SIM)\n 2 - (NAO)\n");//imprimindo
        ex1 = ler.nextInt();//lendo
        
        System.out.print("Você foi aprovado no exame de legislação?\n 1 - (SIM)\n 2 - (NAO)\n");
        ex2 = ler.nextInt();
        
        System.out.print("Você foi aprovado no exame de direção?\n 1 - (SIM)\n 2 - (NAO)\n");
        ex3 = ler.nextInt();
        
        if(ex1 == 1 && ex2 == 1 && ex3 ==1){//condição para habilitação
            System.out.println("Você foi APROVADO e pode solicitar a sua carteira nacional de habilitação!");  
        }else{
            System.out.println("Você foi reprovado e NÃO pode solicitar a carteira nacional de habilitação!");
        }
}
}

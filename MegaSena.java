import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos números irá jogar na mega sena? ");
        int x = sc.nextInt();
        System.out.print("Informe o valor de uma aposta: ");
        double v = sc.nextDouble();

        double x6=50063860, n1, n2, fat1=1,fat2=1,c1, c2, c3;

        n1 = x-6;
        n2 = 720;

        for(int i=1;i<=x;i++){
            fat1*=i;
        }

        for(int i=1;i<=n1;i++){
            fat2*=i;
        }

        c1 = fat1/(fat2*n2);
        c2 = x6/c1;
        c3 = v*c1;

        System.out.printf("A chance de acertar é de 1 em %.0f. Que equivale à %.0f jogos. O custo da aposta será de R$:%.2f reais.", c2, c1, c3);

        sc.close();
    }
}

// Em notação Big(O) o algorítmo possue 2x for, sendo O(n)*O(n) = 2*O(n).
// Porém, ignora-se a multiplicação. Portanto, o algoritmo é complexidade O(n).

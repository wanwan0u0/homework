import java.util.Scanner;
public class homework2{
    public static void main(String[] args){
        float n;
        Scanner input=new Scanner(System.in);
        System.out.printf("請輸入攝氏溫度:");
        n=input.nextFloat();
        System.out.printf("攝氏溫度%f等於華氏溫度%f%n",n,(9*n+32*5)/5);
    }
}

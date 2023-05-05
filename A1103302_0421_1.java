import java.util.Scanner;
public class A1103302_0421_1 {
    public static void main(String[] args){
        String g;
        do{
            Scanner input=new Scanner(System.in);
            System.out.println("請輸入郵箱:");
            g=input.nextLine();
            if(g.matches("[a-z]+@([a-z]+.[a-z]+)+")){
                System.out.println("格式正確");
            }
            else{
                    System.out.println("格式不正確");
                    System.out.println();
            }
        }while (g.matches("[a-z]+@([a-z]+.[a-z]+)+")==false);
    }
}

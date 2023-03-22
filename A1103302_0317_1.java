import java.util.Scanner;

public class A1103302_0317_1{
    public static void main(String[] args){
        int n,m;
        Scanner input=new Scanner(System.in);
        System.out.printf("請輸入n值:");
        n=input.nextInt();
        System.out.printf("請輸入m值:");
        m=input.nextInt();
        int[][] multiple=new int[n][m];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                multiple[i-1][j-1]=i*j;
            }
        }
        for(int []a:multiple){
            for(int b:a){
            System.out.printf("%d,",b);
            }
            System.out.println();
        }
    }
}

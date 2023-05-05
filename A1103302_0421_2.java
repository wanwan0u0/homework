import java.util.Scanner;
public class A1103302_0421_2 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String g;
    boolean pass=false;
    char[] number=new char[4];
    char[] num=new char[2];
    char[] n=new char[2];
    char[] number1=new char[4];
    char[] num1=new char[2];
    char[] n1=new char[2];
    do{
        System.out.println("請輸入日期(YYYY/MM/DD或是MM/DD/YYYY):");
        g=input.nextLine();
        if(g.matches("[1-9][0-9]{3}/((0[1-9])||(1[0-2]))/((0[1-9])||([1-2][0-9]||[3][0-1]))")){
            g.getChars(0,4,number,0);
            g.getChars(5,7,num,0);
            g.getChars(8,10,n,0);
            String year=new String(number,0,4);
            String month=new String(num,0,2);
            String day=new String(n,0,2);
            int years=Integer.parseInt(year);
            int months=Integer.parseInt(month);
            int days=Integer.parseInt(day);
            if(years%4==0 && years%100!=0){
                System.out.println("是閏年");
                if(g.matches("[1-9][0-9]{3}/0[2]/((0[1-9])||([1][0-9]||[2][0-9]))")==true){
                    pass=true;
                }
                else if(g.matches("[1-9][0-9]{3}/((0[1,3,5,7,8])||(1[0,2]))/((0[1-9])||([1-2][0-9]||[3][0-1]))")==true){
                    pass=true;
                }
                else if(g.matches("[1-9][0-9]{3}/((0[4,6,9])||(11))/((0[1-9])||([1-2][0-9]||[3][0]))")==true){
                pass=true;
                }
                else{
                    pass=false;
                }
            }
            else if(years%4!=0 || years%100==0){
                System.out.println("不是閏年");
                if(g.matches("[1-9][0-9]{3}/0[2]/((0[1-9])||([1][0-9]||[2][0-8]))")==true){
                    pass=true;
                }
                else if(g.matches("[1-9][0-9]{3}/((0[1,3,5,7,8])||(1[0,2]))/((0[1-9])||([1-2][0-9]||[3][0-1]))")==true){
                pass=true;
                }
                else if(g.matches("[1-9][0-9]{3}/((0[4,6,9])||(11))/((0[1-9])||([1-2][0-9]||[3][0]))")==true){
                    pass=true;
                }
                else{
                    pass=false;
                }
            }
            else{
                pass=false;
            }
            if(pass==false){
                System.out.println("日期輸入錯誤，請重新輸入");
            }
            if(pass==true){
                System.out.printf("%d年%d月%d日",years,months,days);
            }
        }
        else if(g.matches("((0[1-9])||(1[0-2]))/((0[1-9])||([1-2][0-9]||[3][0-1])/[1-9][0-9]{3})")){
            g.getChars(0,2,num1,0);
            g.getChars(3,5,n1,0);
            g.getChars(6,10,number1,0);
            String year=new String(number1,0,4);
            String month=new String(num1,0,2);
            String day=new String(n1,0,2);
            int years=Integer.parseInt(year);
            int months=Integer.parseInt(month);
            int days=Integer.parseInt(day);
            if(years%4==0 && years%100!=0){
                System.out.println("是閏年");
                if(g.matches("0[2]/((0[1-9])||([1][0-9]||[2][0-9]))/[1-9][0-9]{3}")==true){
                    pass=true;
                }
                else if(g.matches("((0[1,3,5,7,8])||(1[0,2]))/((0[1-9])||([1-2][0-9]||[3][0-1]))/[1-9][0-9]{3}")==true){
                    pass=true;
                }
                else if(g.matches("((0[4,6,9])||(11))/((0[1-9])||([1-2][0-9]||[3][0]))/[1-9][0-9]{3}")==true){
                pass=true;
                }
                else{
                    pass=false;
                }
            }
            else if(years%4!=0 || years%100==0){
                System.out.println("不是閏年");
                if(g.matches("0[2]/((0[1-9])||([1][0-9]||[2][0-8]))/[1-9][0-9]{3}")==true){
                    pass=true;
                }
                else if(g.matches("((0[1,3,5,7,8])||(1[0,2]))/((0[1-9])||([1-2][0-9]||[3][0-1]))/[1-9][0-9]{3}")==true){
                    pass=true;
                }
                else if(g.matches("((0[4,6,9])||(11))/((0[1-9])||([1-2][0-9]||[3][0]))/[1-9][0-9]{3}")==true){
                    pass=true;
                }
                else{
                    pass=false;
                }
            }
            else{
                pass=false;
            }
            if(pass==false){
                System.out.println("日期輸入錯誤，請重新輸入");
            }
            if(pass==true){
                System.out.printf("%d年%d月%d日",years,months,days);
            }
        }
        else{
            pass=false;
            System.out.println("日期輸入錯誤，請重新輸入");
        }
    }while(pass==false);
    }
}

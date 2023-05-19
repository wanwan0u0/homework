import java.util.*;
import java.security.SecureRandom;

class TimerThread extends Thread{
    Eat e;
    String Name;
    public TimerThread(Eat e, String Name){
        this.e=e;
        this.Name=Name;
    }
    public void run(){
        try{
            while(e.k!=0){
                sleep(3000);
                e.eat(this.Name);
            }
            System.out.println("完售");
        }catch(InterruptedException e){
        }
    }
}

class Eat{
    int a=5000;
    int b=3000;
    int c=1000;
    static int k=1;
    int type0=0;
    int type1=0;
    int type2=0;
    int order=0;
    public synchronized void eat(String Name){
        SecureRandom random = new SecureRandom();

        order= random.nextInt(40)+10;
        type0= random.nextInt(order+1);
        type1= random.nextInt(order-type0+1);
        type2= order-type0-type1;

        System.out.printf("%s點了%d顆水餃,吃到了%d顆豬肉水餃,%d顆牛肉水餃,%d顆蔬菜水餃%n",Name,order,(a>=type0?type0:0),(b>=type1?type1:0),(c>=type2?type2:0));

        if(a>=type0){
            a=a-type0;
        }
        if(b>=type1){
            b=b-type1;
        }
        if(c>=type2){
            c=c-type2;
        }

        if(a<=0 && b<=0 && c<=0){
            this.k=0;
        }
        System.out.printf("還剩下%d顆豬肉水餃,%d顆牛肉水餃,%d蔬菜水餃%n",a,b,c);
    }
    public void startEat(int number){
        TimerThread[] eater=new TimerThread[number];
        for(int n=0;n<number;n++){
            eater[n]=new TimerThread(this,"eater"+n);
            eater[n].start();
        }
    }
}

public class A1103302_0512 {
    public static void main(String[] args) throws Exception{
        Eat e=new Eat();
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入顧客數量");
        number=input.nextInt();
        e.startEat(number);
    }
}

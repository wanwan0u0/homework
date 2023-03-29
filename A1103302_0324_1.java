import java.util.Scanner;

class Animal{
    String name;
    double height;
    int weight;
    int speed;
    double time;
    String a;
    void show(){
            System.out.printf("姓名:%s,身高:%f公尺,體重:%d公斤,速度:%d(公尺/分鐘)%n",name,height,weight,speed);
    }
    double distance(double x){
            double d;
            d=x*this.speed;
            return d;
    }
    double distance(double x,double y){
            double d;
            d=x*y*this.speed;
            return d;
    }
}

public class A1103302_0324_1{
    public static void main(String[] args){
        Animal[] animal=new Animal[4];
        for(int n=0;n<=3;n++){
            animal[n]=new Animal();
        }
        animal[0].name="雪寶";
        animal[0].height=1.1;
        animal[0].weight=52;
        animal[0].speed=100;

        animal[1].name="驢子";
        animal[1].height=1.5;
        animal[1].weight=99;
        animal[1].speed=200;

        animal[2].name="安那";
        animal[2].height=1.7;
        animal[2].weight=48;
        animal[2].speed=120;

        animal[3].name="愛沙";
        animal[3].height=1.7;
        animal[3].weight=50;
        animal[3].speed=120;

        for(int i=0;i<=animal.length-1;i++){
            animal[i].show();
        }
        Scanner input=new Scanner(System.in);
        for(int num=0; num<=animal.length-1;num++){
            System.out.printf("請輸入%s跑步的時間:",animal[num].name);
            animal[num].time=input.nextDouble();
            input.nextLine();
            System.out.printf("請輸入%s跑步的加速度:",animal[num].name);
            animal[num].a=input.nextLine();
            double a;
            if(animal[num].a.isEmpty() || animal[num].a.isBlank()){
                System.out.printf("%s的跑步距離為:%f%n",animal[num].name,animal[num].distance(animal[num].time));
            }
            else{
                a=Double.valueOf(animal[num].a); 
                System.out.printf("%s的跑步距離為:%f%n",animal[num].name,animal[num].distance(animal[num].time,a));
            }
        }
    }
}


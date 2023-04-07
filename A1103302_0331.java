import java.util.Scanner;
public class A1103302_0331{
    static class animal{
        String name;
        double height;
        int weight;
        int speed;
        double time;
        String a;
        animal(String name,double height,int weight,int speed){
            this.name=name;
            this.height=height;
            this.weight=weight;
            this.speed=speed;
        }
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

        static void showinfo(){
            System.out.printf("歡迎進入冰雪奇緣系統%n");
        }
    }

    static class human extends animal{
        String sex;
        human(String name,double height,int weight,int speed,String sex){
            super(name,height,weight,speed);
            this.sex=sex;
        }
        @Override
        void show(){
            System.out.printf("姓名:%s,身高:%f公尺,體重:%d公斤,速度:%d(公尺/分鐘),性別:%s%n",name,height,weight,speed,sex);
        } 
    }

    static class snow extends human{
        boolean skill;
        snow(String name,double height,int weight,int speed,String sex,boolean skill){
            super(name,height,weight,speed,sex);
            this.skill=skill;
        }
        @Override
        void show(){
            System.out.printf("姓名:%s,身高:%f公尺,體重:%d公斤,速度:%d(公尺/分鐘),性別:%s,冰凍技能屬性值:%s%n",name,height,weight,speed,sex,(skill==true)?"Yes":"no");
        } 

        double distance(double x){
            double d;
            d=x*this.speed*2;
            return d;
        }
        double distance(double x,double y){
            double d;
            d=x*y*this.speed*2;
            return d;
        }
    }
    public static void main(String[] args){
        animal.showinfo();
        animal[] animal=new animal[2];
        animal[0]=new animal("雪寶",1.1,52,100);
        animal[1]=new animal("驢子",1.5,99,200);

        human[] Human=new human[3];
        Human[0]=new human("阿克",1.9,80,150,"男");
        Human[1]=new human("漢斯",1.8,78,130,"男");
        Human[2]=new human("安那",1.7,48,120,"女");

        snow Snow=new snow("愛沙",1.7,50,120,"女",true);

        for(int i=0;i<=animal.length-1;i++){
            animal[i].show();
        }

        for(int i=0;i<=Human.length-1;i++){
            Human[i].show();
        }

        Snow.show();

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
                if(a==0){
                    System.out.printf("%s的跑步距離為:%f%n",animal[num].name,animal[num].distance(animal[num].time));
                }
                else{
                    System.out.printf("%s的跑步距離為:%f%n",animal[num].name,animal[num].distance(animal[num].time,a));
                }
            }
        }

        for(int num1=0; num1<=Human.length-1;num1++){
            System.out.printf("請輸入%s跑步的時間:",Human[num1].name);
            Human[num1].time=input.nextDouble();
            input.nextLine();
            System.out.printf("請輸入%s跑步的加速度:",Human[num1].name);
            Human[num1].a=input.nextLine();
            double a;
            if(Human[num1].a.isEmpty() || Human[num1].a.isBlank()){
                System.out.printf("%s的跑步距離為:%f%n",Human[num1].name,Human[num1].distance(Human[num1].time));
            }
            else{
                a=Double.valueOf(Human[num1].a); 
                if(a==0){
                    System.out.printf("%s的跑步距離為:%f%n",Human[num1].name,Human[num1].distance(Human[num1].time));
                }
                else{
                    System.out.printf("%s的跑步距離為:%f%n",Human[num1].name,Human[num1].distance(Human[num1].time,a));
                }
            }
        }

        System.out.printf("請輸入%s跑步的時間:",Snow.name);
        Snow.time=input.nextDouble();
        input.nextLine();
        System.out.printf("請輸入%s跑步的加速度:",Snow.name);
        Snow.a=input.nextLine();
        double a;
        if(Snow.a.isEmpty() || Snow.a.isBlank()){
            System.out.printf("%s的跑步距離為:%f%n",Snow.name,Snow.distance(Snow.time));
        }
        else{
            a=Double.valueOf(Snow.a); 
            if(a==0){
                System.out.printf("%s的跑步距離為:%f%n",Snow.name,Snow.distance(Snow.time));
            }
            else{
                System.out.printf("%s的跑步距離為:%f%n",Snow.name,Snow.distance(Snow.time,a));
            }
        }
    }
}


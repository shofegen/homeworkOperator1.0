public class Main {
    public static void main(String[] args) {

        int age=17;
        if(age>=18){
        System.out.println("Если возраст человека равен "+age+" , то он совершеннолетний");
        }else{
        System.out.println("Если возраст человека равен "+age+" он не достиг совершеннолетия, нужно немного подождать");
        }



        int temp = 5;
        if (temp < 5 || temp > 5) {
            System.out.println("На улице " + temp + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов,можно идти без шапки");
        }


        int speed = 61;
        if (speed > 60 || speed < 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }


        int age1 = 7;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
    }}
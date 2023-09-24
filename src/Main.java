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


        int age1 = 16;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }


        int age2 = 15;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он не может кататься на аттракционе");
        } else if (age2 >= 5 && age2 <= 14){
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age2 >= 15){
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься без сопровождения взрослого");
        }

        int numberLogged = 101;
        byte allPassengers = 102;
        byte seating = 60;
        int standingPlaces = 62;
        if (numberLogged <= 60) {
            System.out.println("В вагоне " + (seating - numberLogged) + " сидячих мест и " + standingPlaces + " стоячих мест");
        } else if (numberLogged >=61 && numberLogged < 102) {
            System.out.println("В вагоне " + (allPassengers - numberLogged) + " стоячих мест");
        } else {
            System.out.println("Мест не осталось");
        }


        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(one + " самое большое число");
        } else if (one ==two && one ==three) {
            System.out.println("Все числа равны " + one);
        } else if (two >=one && two >= three) {
            System.out.println(two + " самое большое число");
        } else {
            System.out.println(three + " самое большое число");
        }
           }
    }
package avlyakulov.timur.practise;

import java.util.Scanner;

public class Example {
    int currentDepth=0;

    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка "+
                    " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }else{
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
        return currentDepth;
    }
    public String say(String something){
        return "Разве вы не знаете, что рыбы не говорят?";
    }
    static int factorial (int x ){        if (x==1)
            return 1; 
        return x*factorial(x-1);
    }

    
    public static void main(String[] args) {
       Example fish = new Example();
       fish.dive(120);

        System.out.println("Checking of work try catch");

        System.out.println("Программа завершена");
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число");
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
                //change something and now i change here to see real changes
            }
        }
        catch(Exception ex){
            System.out.println("Message before get message");
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}


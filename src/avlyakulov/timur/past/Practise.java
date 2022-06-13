package avlyakulov.timur.past;
/*
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение
Для генерации случайного числа используйте метод Math.random(),
который возвращает значение в промежутке [0, 1].
*/

public class Practise {
    void findMax(int arr[]){

    }
    void findMin(int arr[]){

    }
    void findAverage(int arr[]){

    }
    public static void main(String[] args) {
        int [] mas = new int[10];
for (int i= 0;i<10;++i){
 mas[i] = (int)(1 + Math.random()*9);
}
        System.out.println("Massiv elements");
        for (int i= 0;i<10;++i){
            System.out.print(i+1 +")-");
            System.out.print(mas[i]+"; " );
        }
    }
}

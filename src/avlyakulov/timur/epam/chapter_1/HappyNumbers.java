package avlyakulov.timur.epam.chapter_1;

//«Счастливые» числа.
public class HappyNumbers {
    public static boolean isHappy(int n) {
        while (true) {
            int flag = getNext(n);
            if (flag == 1) {
                return true;
            } else {
                n = flag;
                if (n == 89) {
                    return false;
                }
            }
        }
    }
    public static int getNext (int num) {// Получить сумму квадратов чисел
        int result = 0;
        result = result+((num%10)*(num%10));
        num = num / 10;
        if(num == 0){
            return result;
        }else{
            return result + getNext(num);
        }
    }
}

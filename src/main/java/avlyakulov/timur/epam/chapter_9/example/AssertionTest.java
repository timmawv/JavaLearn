package avlyakulov.timur.epam.chapter_9.example;

public class AssertionTest {
    public static void main(String[] args) {
        int size = 12;
        if (size > 0) {
            //code...
        } else {
            //we have an error
        }

        /*
        Правописание инструкции assert:
        assert bool_exp : expression;
        assert bool_exp;
        */
        assert (size > 0) : "Incorrect size = " + size; // если компилировать через командную строку то нужно написать java -ea (enable assertions) ClassName
        // если это делать в идее то надо вписать в VM options -ea
        // Для выключения assertion применяется -disableassertions или -da.
        //code...
    }
}
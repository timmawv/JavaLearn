package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_7;
/*
Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
последовательностями подряд идущих букв оставить хотя бы один пробел.
 */
public class DeleteSymbols {
    public static void main(String[] args) {
        String text = "Наше слово было важное слово! Которое есть, важным слово в нашем тексте";
        text = text.replaceAll("[а-яА-Я]*"," ");
        System.out.println("Наш текст: " + text);
    }
}
package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_17;

//расшифруем тект из из задачи под номером 17
public class DecryptingText {
    public static void main(String[] args) {
        String textEncrypted = "Нееопджибоасочачьонвема оерлеечаер тонхоеа ееы еон та рерлееы па е е зоер.швр еон е чоеьчьош?штт лпджиеьшпв еон лнинвронпд чоНетопдживрвемс е реНерьборлеес?";
        System.out.println(textEncrypted.length());
        char[] textDecrypted = new char[textEncrypted.length()];
        int counter;
        int cycleCounter = 0;
        int i = 0;
        while (cycleCounter < 3) {
            counter = cycleCounter;
            if (cycleCounter == 1) {
                i = textEncrypted.length() / 3;
            } else {
                i = (textEncrypted.length() * 2) / 3;
            }
            for (; i < i + (textEncrypted.length() / 3) ; ++i) {
                textDecrypted[counter] = textEncrypted.charAt(i);
                counter += 3;
            }
            ++cycleCounter;
        }
        System.out.println(textDecrypted);
    }
}
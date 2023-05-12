package avlyakulov.timur.epam.chapter_3.array.dao;

import avlyakulov.timur.epam.chapter_3.array.entity.Massiv;
import avlyakulov.timur.epam.chapter_3.array.db.MassivDB;

public class MassivDAO {
    public void createMassiv (Massiv massiv) {
        MassivDB.getInstance().createMassiv(massiv);
    }
    public void sortBubble (int [] arr) {
        MassivDB.getInstance().sortBubble(arr);
    }
    public void sortShaker (int [] arr) {
        MassivDB.getInstance().sortShaker(arr);
    }
    public void sortSimpleChoose (int [] arr) {
        MassivDB.getInstance().sortSimpleChoose(arr);
    }
    public void sortHash (int[] arr) {
        MassivDB.getInstance().sortHash(arr);
    }
    public void sortSimpleInsertion (int [] arr) {
        MassivDB.getInstance().sortSimpleInsertion(arr);
    }
    public void sortBinaryMerge (int [] arr) {
        MassivDB.getInstance().sortBinaryMerge(arr);
    }
    public void sortShell (int [] arr) {
        MassivDB.getInstance().sortShell(arr);
    }
    public Massiv [] findAll () {
        return MassivDB.getInstance().findAll();
    }
}

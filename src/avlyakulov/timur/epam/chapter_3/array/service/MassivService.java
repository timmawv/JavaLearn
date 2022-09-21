package avlyakulov.timur.epam.chapter_3.array.service;

import avlyakulov.timur.epam.chapter_3.array.dao.MassivDAO;
import avlyakulov.timur.epam.chapter_3.array.entity.Massiv;

public class MassivService {
    private final MassivDAO massivDAO = new MassivDAO();

    public void createMassiv(Massiv massiv) {
        massivDAO.createMassiv(massiv);
    }
    public void sortBubble (int [] arr) {
        massivDAO.sortBubble(arr);
    }
    public void sortShaker (int [] arr) {
        massivDAO.sortShaker(arr);
    }
    public void sortSimpleChoose (int [] arr) {
        massivDAO.sortSimpleChoose(arr);
    }
    public void sortHash (int [] arr) {
        massivDAO.sortHash(arr);
    }
    public void sortSimpleInsertion (int [] arr) {
        massivDAO.sortSimpleInsertion(arr);
    }
    public void sortBinaryMerge (int [] arr) {
        massivDAO.sortBinaryMerge(arr);
    }
    public void sortShell (int[] arr) {
        massivDAO.sortShell(arr);
    }
    public Massiv[] findAll() {
    return massivDAO.findAll();
    }

}

package avlyakulov.timur.epam.chapter_6.letter.entity;

public interface PostAction<T extends AbstractLetter> {
    void addSender(T letter, String sender);

    void deleteSender(T letter);


}
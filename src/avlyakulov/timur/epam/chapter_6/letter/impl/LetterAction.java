package avlyakulov.timur.epam.chapter_6.letter.impl;

import avlyakulov.timur.epam.chapter_6.letter.entity.AbstractLetter;
import avlyakulov.timur.epam.chapter_6.letter.entity.Letter;
import avlyakulov.timur.epam.chapter_6.letter.entity.PostAction;

public class LetterAction implements PostAction <Letter> {


    @Override
    public void addSender(Letter letter, String sender) {
        letter.setSender(sender);
    }

    @Override
    public void deleteSender(Letter letter) {
        letter.setSender(null);
    }


}

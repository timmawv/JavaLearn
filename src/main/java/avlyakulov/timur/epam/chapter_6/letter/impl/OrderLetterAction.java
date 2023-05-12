package avlyakulov.timur.epam.chapter_6.letter.impl;


import avlyakulov.timur.epam.chapter_6.letter.entity.OrderLetter;
import avlyakulov.timur.epam.chapter_6.letter.entity.PostAction;

public class OrderLetterAction implements PostAction<OrderLetter> {

    @Override
    public void addSender(OrderLetter letter, String sender) {
        letter.setSender(sender);
    }

    @Override
    public void deleteSender(OrderLetter letter) {
        letter.setSender(null);
    }


    public void changeCost(OrderLetter letter, int cost) {
        letter.setCost(cost);
    }
}

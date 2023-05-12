package avlyakulov.timur.epam.chapter_5.notepad.entity;

import java.util.Arrays;
import java.util.Date;

/*
Создать класс Notepad с внутренним классом или классами, с помощью
объектов которого могут храниться несколько записей на одну дату
 */
public class Notepad {
    private Note[] notepad;
    private int current;

    public Notepad() {
        notepad = new Note[4];
    }

    public Note[] getNotepad () {
        return notepad;
    }

    public void addNoteToNotepad(Note note) {
        if (current == notepad.length) {
            Note[] notepad1 = new Note[notepad.length + 1];
            System.arraycopy(notepad, 0, notepad1, 0, notepad.length);
            notepad = notepad1;
        }
        notepad[current] = note;
        ++current;
    }

    public class Note {
        private String text;
        private Date date;

        public Note(String text) {
            this.text = text;
            date = new Date();
        }

        @Override
        public String toString() {
            return "Note from " + date + " Text: " + text;

        }
    }
}
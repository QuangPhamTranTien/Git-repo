import java.util.ArrayList;
import java.util.List;

public class NoteStore {
    private List<Note> notes;

    public NoteStore() {
        notes = new ArrayList<>();
    }

    // Method to add a new note
    public void addNote() {
        Note newNote = Note.createNote();
        notes.add(newNote);
        System.out.println("Note added: " + newNote);
    }

    // Method to list all notes
    public void listNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            for (Note note : notes) {
                System.out.println("ID: " + note.getId());
                System.out.println("Title: " + note.getTitle());
                System.out.println("Content: " + note.getContent());
                System.out.println("----------------------");
            }
        }
    }
}

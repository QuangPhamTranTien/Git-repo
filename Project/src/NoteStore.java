import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

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

    // Method to delete a note by ID
    public void deleteNoteById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the note ID to delete: ");
        String id = scanner.nextLine();

        boolean found = false;
        for (Note note : notes) {
            if (Objects.equals(note.getId(), id)) {
                notes.remove(note);
                System.out.println("Note with ID " + id + " deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Note with ID " + id + " not found.");
        }
    }
}

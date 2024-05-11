import java.util.Scanner;

public class Note {
    private String id;
    private String title;
    private String content;

    public Note(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public static Note createNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the note ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the note title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the note content: ");
        String content = scanner.nextLine();

        return new Note(id, title, content);
    }
}

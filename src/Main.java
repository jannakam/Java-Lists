import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            List<String> books = new ArrayList<String>();
            books.add("Stoner");
            books.add("The Stranger");
            books.add("1984");
            books.add("Of Mice and Men");
            books.add("The Picture of Dorian Gray");
            books.remove(2);

            // using for each
            for (String book : books) {
                System.out.println(book);
            }

            // using a regular for loop
            for (int i = 0; i < books.size(); i++) {
                System.out.printf("%s is number %d on my favorite books list\n", books.get(i), i+1);
            }

            // using while
            int i = 0;
            while (i < books.size()) {
                System.out.printf("%s is number %d on my favorite books list\n", books.get(i), i+1);
                i++;
            }
        }
    }

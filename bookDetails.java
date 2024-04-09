import java.util.Scanner;

class Publisher {
    String publisher;

    Publisher(String pub) {
        this.publisher = pub;
    }
}

class Book extends Publisher {
    String book;

    Book(String pub, String boo) {
        super(pub);
        book = boo;
    }
}

class Literature extends Book {
    Literature(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}

class Fiction extends Book {
    Fiction(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}

public class bookDetails {
    public static void main(String[] args) {
        System.out.println("JACOB K M \n Roll no: 32 \n 09/04/24");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nEnter the Number of Literature Books:");
        int num = sc1.nextInt();
        Literature arr[] = new Literature[num];
        System.out.println("\nEnter the Literature Book Details:\n");
        for (int i = 0; i < num; i++) {
            int x = i + 1;
            System.out.println("\n" + x + ").");
            System.out.println("Book: ");
            String boo = sc1.next();
            System.out.println("Publisher: ");
            String pub = sc1.next();

            arr[i] = new Literature(pub, boo);
        }

        System.out.println("\nEnter the Number of Fiction Books:");
        int num1 = sc1.nextInt();
        Fiction arr1[] = new Fiction[num1];
        System.out.println("\nEnter the Fiction Book Details:\n");
        for (int i = 0; i < num1; i++) {
            int x1 = i + 1;
            System.out.println("\n" + x1 + ").");
            System.out.println("Book: ");
            String boo = sc1.next();
            System.out.println("Publisher: ");
            String pub = sc1.next();

            arr1[i] = new Fiction(pub, boo);
        }
        sc1.close();

        System.out.println("\n********Informations of all the Literature Books************");
        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.println("\n" + j + ").");
            arr[i].display();
        }

        System.out.println("\n********Informations of all the Fiction Books************");
        for (int i = 0; i < num1; i++) {
            int j1 = i + 1;
            System.out.println("\n" + j1 + ").");
            arr1[i].display();
        }
    }
}



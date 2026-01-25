public class baitap3 {
    public static void main(String[] args) {

        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Truoc khi hoan doi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

        String temp = book1;

        book1 = book2;
        book2 = temp;

        System.out.println("\nSau khi hoan doi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}

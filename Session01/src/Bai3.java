public class Bai3 {
    public static void main(String[] args) {
        // Khai báo hai biến
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // Thực hiện hoán đổi giá trị của chúng bằng một biến tạm temp.
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);

        /*
         * Biến temp được khai báo trên Stack
         * Nó sẽ tham chiếu (trỏ) tới đối tượng String trong Heap
        */
        String temp = book1;
        book1 = book2;

        /*
         * Khi gán book2 = temp:
         * - book2 (Stack) trỏ lại vùng nhớ Heap của "Java Basic"
         * - Heap chỉ lưu chuỗi, Stack chỉ đổi địa chỉ tham chiếu
         */
        book2 = temp;

        // In sau khi hoán đổi
        System.out.println("Sau khi hoán đổi:  Book1 = " + book1 + ", Book2 = " + book2);
    }
}

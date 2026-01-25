package Ex01;

public class bai3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
        // --- BẮT ĐẦU HOÁN ĐỔI & GIẢI THÍCH CƠ CHẾ MEMORY ---
        /* * [GIẢI THÍCH CƠ CHẾ STACK & HEAP]
         * * 1. Khởi tạo:
         * - Heap: Tạo ra 2 vùng nhớ chứa chuỗi "Java Basic" (địa chỉ A) và "Python Intro" (địa chỉ B).
         * - Stack: Biến `book1` giữ địa chỉ A, `book2` giữ địa chỉ B.
         * * 2. Quá trình hoán đổi (Swap):
         * - String temp = book1;
         * => Tạo biến `temp` trên Stack, trỏ nó vào địa chỉ A (giống book1).
         * * - book1 = book2;
         * => Ngắt `book1` khỏi A, trỏ `book1` sang địa chỉ B (của book2).
         * * - book2 = temp;
         * => Ngắt `book2` khỏi B, trỏ `book2` sang địa chỉ A (mà temp đang giữ).
         * * => KẾT LUẬN: Chúng ta chỉ tráo đổi các "nhãn dán" (tham chiếu) trên Stack.
         * Các cuốn sách thật sự (dữ liệu trong Heap) vẫn nằm im tại chỗ, không hề di chuyển.
         */
        String temp = book1; // temp giữ "Java Basic"
        book1 = book2;       // book1 giữ "Python Intro"
        book2 = temp;        // book2 giữ "Java Basic"
        System.out.println("Sau khi hoán đổi:   Book1 = " + book1 + ", Book2 = " + book2);
    }
}
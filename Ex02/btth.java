package Ex02;

import java.util.Scanner;

public class btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // --- HIỂN THỊ MENU ---
            System.out.println("\n========== QUẢN LÝ THƯ VIỆN ==========");
            System.out.println("1. Tính tiền phạt trả sách (For loop)");
            System.out.println("2. Đăng ký thẻ VIP (If-else logic)");
            System.out.println("3. Thống kê sách nhập kho (Do-while)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (0-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Lỗi: Vui lòng nhập số nguyên!");
                continue; // Quay lại đầu vòng lặp
            }

            // --- XỬ LÝ MENU ---
            switch (choice) {
                case 1:
                    // CHỨC NĂNG 1: TÍNH TIỀN PHẠT (FOR)
                    System.out.println("\n--- 1. TÍNH TIỀN PHẠT TRẢ MUỘN ---");
                    System.out.print("Nhập số lượng sách trả: ");
                    int totalBooks = Integer.parseInt(scanner.nextLine());

                    long totalFine = 0; // Biến tích lũy tổng tiền phạt

                    for (int i = 1; i <= totalBooks; i++) {
                        System.out.print("Nhập số ngày quá hạn cho cuốn thứ " + i + ": ");
                        int days = Integer.parseInt(scanner.nextLine());

                        long finePerBook = 0;
                        if (days <= 5) {
                            // Trễ từ 1-5 ngày: 2000đ/ngày
                            finePerBook = days * 2000;
                        } else {
                            // Trễ > 5 ngày: 5 ngày đầu 2000, ngày thứ 6 trở đi 5000
                            finePerBook = (5 * 2000) + ((days - 5) * 5000);
                        }

                        totalFine += finePerBook;
                        System.out.printf("-> Tiền phạt cuốn %d: %,d VNĐ\n", i, finePerBook);
                    }
                    System.out.printf("==> TỔNG TIỀN PHẠT CẦN THU: %,d VNĐ\n", totalFine);
                    break;

                case 2:
                    // CHỨC NĂNG 2: ĐĂNG KÝ VIP (IF-ELSE & LOGIC)
                    System.out.println("\n--- 2. XÉT DUYỆT THẺ VIP ---");
                    System.out.print("Nhập tuổi độc giả: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Số sách đã mượn tháng qua: ");
                    int booksRead = Integer.parseInt(scanner.nextLine());

                    System.out.print("Là sinh viên ưu tiên? (1: Có, 0: Không): ");
                    int isPriority = Integer.parseInt(scanner.nextLine());

                    // Logic: (>= 18 tuổi VÀ >= 10 cuốn) HOẶC (Có thẻ ưu tiên)
                    boolean condition1 = (age >= 18 && booksRead >= 10);
                    boolean condition2 = (isPriority == 1);

                    if (condition1 || condition2) {
                        System.out.println("==> KẾT QUẢ: Đủ tiêu chuẩn nâng cấp VIP");
                    } else {
                        System.out.println("==> KẾT QUẢ: Chưa đủ tiêu chuẩn");
                    }
                    break;

                case 3:
                    // CHỨC NĂNG 3: THỐNG KÊ SÁCH (DO-WHILE, BREAK, CONTINUE)
                    System.out.println("\n--- 3. NHẬP KHO SÁCH MỚI ---");
                    System.out.println("(Nhập mã số < 0 để bỏ qua, nhập 0 để kết thúc)");

                    int validBooksCount = 0;
                    int bookCode;

                    do {
                        System.out.print("Nhập mã sách: ");
                        bookCode = Integer.parseInt(scanner.nextLine());

                        if (bookCode == 0) {
                            System.out.println("-> Dừng nhập liệu.");
                            break; // Thoát khỏi vòng lặp do-while ngay lập tức
                        }

                        if (bookCode < 0) {
                            System.out.println("-> Cảnh báo: Mã sách không được âm. Mời nhập lại!");
                            continue; // Bỏ qua đoạn dưới, quay lại đầu vòng lặp kiểm tra điều kiện
                        }

                        // Nếu mã hợp lệ
                        validBooksCount++;
                        System.out.println("-> Đã ghi nhận sách mã: " + bookCode);

                    } while (true); // Lặp vô tận cho đến khi gặp break

                    System.out.println("==> TỔNG SỐ SÁCH HỢP LỆ ĐÃ NHẬP: " + validBooksCount);
                    break;

                case 0:
                    System.out.println("Đang thoát chương trình... Hẹn gặp lại!");
                    scanner.close(); // Đóng scanner trước khi kết thúc
                    System.exit(0); // Lệnh tắt hẳn chương trình
                    break;

                default:
                    System.out.println(">> Lựa chọn không hợp lệ. Vui lòng chọn từ 0 đến 3.");
            }
        }
    }
}
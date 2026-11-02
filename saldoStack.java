import java.util.Scanner;
import java.util.Stack;

public class saldoStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 2000000;
        Stack<Integer> transactions = new Stack<>();
        int nav;

        do {
            System.out.println("Pilih menu");
            System.out.println("1. Penarikan");
            System.out.println("2. Menyimpan");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Total uang masuk");
            System.out.println("5. Total uang keluar");
            System.out.println("6. Lihat transaksi terakhir");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            nav = input.nextInt();

            if (nav == 1) {
                System.out.print("Jumlah yang ditarik: ");
                int amount = input.nextInt();

                if (amount <= 0 || amount > balance) {
                    System.out.println("Jumlah tidak valid atau saldo kurang");
                    continue;
                }

                transactions.push(-amount);
                balance -= amount;

            } else if (nav == 2) {
                System.out.print("Jumlah yang disimpan:");
                int amount = input.nextInt();
                if (amount <= 0) {
                    System.out.println("Jumlah tidak valid");
                    continue;
                }
                transactions.push(amount);
                balance += amount;

            } else if (nav == 3) {
                System.out.println("Saldo anda: " + balance);

            } else if (nav == 4) {
                int total = 0;

                for (int x : transactions) {
                    if (x > 0) {
                        total += x;
                    }
                }
                System.out.println("Total uang masuk: " + total);
            
            } else if (nav == 5) {
                int total = 0;

                for (int x : transactions) {
                    if (x < 0) {
                        total += x;
                    }
                }
                System.out.println("Total uang keluar: " + Math.abs(total));

            } else if (nav == 6) {
                if (transactions.isEmpty()) {
                    System.out.println("Belum ada transaksi");
                } else {
                    System.out.println("Transaksi terakhir: " + transactions.peek());
                }

            } else if (nav != 0) {
                System.out.println("Menu tidak tersedia");
            }

        } while (nav != 0);
        input.close();
    } 
}

import java.util.ArrayList;

public class SaldoArrayList {
    private static final int ArrayList = 0;

    public static void main(String[] args) {
        SaldoArrayList input = new SaldoArrayList();
        int balance = 2000000;
        ArrayList<Integer> saldo = new ArrayList<>();
        int nav;

        do {
            System.out.println("Pilih menu");
            System.out.println("1. Penarikan");
            System.out.println("2. Menyimpan");
            System.out.println("3. Lihat saldo");
            System.out.println("4. Total uang masuk");
            System.out.println("5. Total uang keluar");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            nav = input.nextlnt();

            ArrayList<Integer> transactions = null;
            if (nav == 1) {
                System.out.print("Jumlah yang ditarik: ");
                int amount = input.nextlnt();

                if (amount <= 0 || amount > balance) {
                    System.out.println("Jumlah tidak valid atau saldo kurang");
                    continue;
                }

                transactions.add(-amount);
                balance -= amount;

            } else if (nav == 2) {
                System.out.print("Jumlah yang disimpan: ");
                int amount = input.nextlnt();
                if (amount <= 0) {
                    System.out.println("Jumlah tidak valid");
                    continue;
                }

                transactions.add(amount);
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

                System.out.println("Total uang keluar: " + (- total));

            } else if (nav != 0) {
                System.out.println("Menu tidak tersedia");
            }

        } while (nav != 0);

        input.close();
    }

    private void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    private int nextlnt() {
        throw new UnsupportedOperationException("Unimplemented method 'nextlnt'");
    }
}

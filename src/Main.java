import java.util.Scanner;

public class Main {
    static String[] mahasiswaUsernames = {"202310370311", "202210370311", "202110370311"};
    static String[] roles = {"mahasiswa", "mahasiswa", "mahasiswa"};
    static String adminUsername = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.println("====Pilihan:====");
            System.out.println("1. Login sebagai mahasiswa");
            System.out.println("2. Login sebagai admin");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan(1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginMahasiswa(scanner);
                    break;
                case 2:
                    loginAdmin(scanner);
                    break;
                case 3:
                    System.out.println("okehh!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String username = scanner.next();
        boolean loggedIn = true;
        for (int i = 0; i < mahasiswaUsernames.length; i++) {
            if (username.equals(mahasiswaUsernames[i])) {
                loggedIn = false;
                System.out.println("Login berhasil sebagai " + roles[i]);
                break;
            }
        }
        if (loggedIn) {
            System.out.println("NDA BISA COKK.");
        }
    }

    static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan PW admin: ");
        String username = scanner.next();
        if (username.equals(adminUsername)) {
            System.out.println("Login berhasil sebagai admin");
        } else {
            System.out.println("Username admin tidak valid.  coba lagi.");
        }
    }
}
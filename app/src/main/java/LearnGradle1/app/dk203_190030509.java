package LearnGradle1.app;

import java.util.Scanner;

public class dk203_190030509 {
    public static int input;
    public static int harga;
    public static int jumlah;
    public static double total;
    public static Character ulang;

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("=================Project UTS================");
        System.out.println("============================================");
        allMenu();
    }
    public static  void allMenu() {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Pilihan menu");
            System.out.println("1. Menu Biodata");
            System.out.println("2. Menu Diskon");
            System.out.println("3. Menu Perkalian");
            System.out.println("3. Exit");

            System.out.println("Pilih menu : ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    biodata();
                    break;
                case 2:
                    diskon();
                    break;
                case 3:
                    perkalian();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Tidak ada pilihan");
            }
            System.out.println("Ulangi Lagi ? (Y/N)");
            ulang = scanner.next().charAt(0);
        } while(ulang == 'Y' || ulang == 'y');
    }
    public static void biodata() {
        System.out.println("Nama : I Km Triyana Artha Putra");
        System.out.println("Nim : 190030509");
        System.out.println("Kelas : DK 203");
    }

    public static void diskon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Jumlah Barang : ");
        jumlah = scanner.nextInt();

        System.out.println("Input Harga Barang : ");
        harga = scanner.nextInt();

        if(harga*jumlah > 10000 && jumlah > 3) {
            total = harga*jumlah - harga * 0.1;
            System.out.println("Diskon Yang Didapat : 10%");
        } else {
            total = harga;
        }

        System.out.println("Harga Total : " + total);
    }

    public static void perkalian() {
        int i = 2;
        while(i <= 5) {
            int j = 1;
            while(j <= 10) {
                    System.out.println(i + "x" + j + "=" + i*j);
                j++;
                }
            i++;
        }
    }
}

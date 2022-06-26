import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class latihan {
    public static String[][] hori = new String[6][6];
    public static String[][] zon = new String[6][6];
    public static int tile;
    public static Scanner scanner = new Scanner(System.in);

    public static void printhori() {
        for (int i = 0; i < tile; i++) {
            System.out.print("|");
            for (int j = 0; j < tile; j++) {
                System.out.print(hori[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void shufflezon6() {
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
        letters.add("M");
        letters.add("N");
        letters.add("O");
        letters.add("P");
        letters.add("Q");
        letters.add("R");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
        letters.add("M");
        letters.add("N");
        letters.add("O");
        letters.add("P");
        letters.add("Q");
        letters.add("R");


        int index;
        for (int i = 0; i < tile; i++) {
            for (int j = 0; j < tile; j++) {
                index = random.nextInt(letters.size());
                zon[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }

    public static void shufflezon4() {
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");


        int index;
        for (int i = 0; i < tile; i++) {
            for (int j = 0; j < tile; j++) {
                index = random.nextInt(letters.size());
                zon[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }

    public static void shufflezon2() {
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("A");
        letters.add("B");


        int index;
        for (int i = 0; i < tile; i++) {
            for (int j = 0; j < tile; j++) {
                index = random.nextInt(letters.size());
                zon[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }


    public static void checkInput(String[][] zon) {
        int poin1 = 0;
        int poin2 = 0;
        while (true) {
            if (!gameOver()) {
                System.out.println("percobaan oleh pemain 1");
                System.out.println("Baris: ");
                int baris1 = scanner.nextInt();
                System.out.println("Kolom: ");
                int kolom1 = scanner.nextInt();

                if (!hori[baris1 - 1][kolom1 - 1].equals(" ~ ")) {
                    System.out.println("Tile Sudah Terisi");
                    System.out.println();

                    printhori();
                    continue;
                } else {
                    hori[baris1 - 1][kolom1 - 1] = " " + zon[baris1 - 1][kolom1 - 1] + " ";
                    printhori();
                }

                System.out.println("Baris: ");
                int baris2 = scanner.nextInt();
                System.out.println("Kolom: ");
                int kolom2 = scanner.nextInt();

                if (!hori[baris2 - 1][kolom2 - 1].equals(" ~ ")) {
                    System.out.println("Tile Sudah Terisi");
                    hori[baris1 - 1][kolom1 - 1] = " ~ ";
                    System.out.println();

                    printhori();
                    continue;
                } else {
                    hori[baris2 - 1][kolom2 - 1] = " " + zon[baris2 - 1][kolom2 - 1] + " ";

                    if (hori[baris1 - 1][kolom1 - 1].equals(hori[baris2 - 1][kolom2 - 1])) {
                        poin1 = poin1 + 1;
                        printhori();
                        System.out.println("Selamat, Jawaban anda Benar");
                        System.out.println("Sekarang anda memiliki poin = "+poin1);
                    } else {
                        printhori();
                        System.out.println("jawaban anda Salah");
                        hori[baris1 - 1][kolom1 - 1] = " ~ ";
                        hori[baris2 - 1][kolom2 - 1] = " ~ ";
                        printhori();
                    }
                }


            }
            if (!gameOver()) {
                System.out.println("Percobaan oleh Pemain 2");
                System.out.println("Baris: ");
                int baris1 = scanner.nextInt();
                System.out.println("Kolom: ");
                int kolom1 = scanner.nextInt();

                if (!hori[baris1 - 1][kolom1 - 1].equals(" ~ ")) {
                    System.out.println("Tile Sudah Terisi");
                    System.out.println();

                    printhori();
                    continue;
                } else {
                    hori[baris1 - 1][kolom1 - 1] = " " + zon[baris1 - 1][kolom1 - 1] + " ";
                    printhori();
                }

                System.out.println("Baris: ");
                int baris2 = scanner.nextInt();
                System.out.println("Kolom: ");
                int kolom2 = scanner.nextInt();

                if (!hori[baris2 - 1][kolom2 - 1].equals(" ~ ")) {
                    System.out.println("Tile Sudah Terisi");
                    hori[baris1 - 1][kolom1 - 1] = " ~ ";
                    System.out.println();

                    printhori();
                    continue;
                } else {
                    hori[baris2 - 1][kolom2 - 1] = " " + zon[baris2 - 1][kolom2 - 1] + " ";

                    if (hori[baris1 - 1][kolom1 - 1].equals(hori[baris2 - 1][kolom2 - 1])) {
                        poin2 = poin2 + 1;
                        printhori();
                        System.out.println("Selamat, Jawaban anda Benar");
                        System.out.println("Sekarang anda memiliki poin = "+poin2);
                    } else {
                        printhori();
                        System.out.println("jawaban anda Salah");
                        hori[baris1 - 1][kolom1 - 1] = " ~ ";
                        hori[baris2 - 1][kolom2 - 1] = " ~ ";
                        printhori();
                    }
                }


            }
            else {
                System.out.println("GUESSING GAME SELESAI...");
                if(poin1 > poin2)
                {
                    System.out.println(" ");
                    System.out.println("Pemain 1 adalah pemenang GUESSING GAME dengan poin : "+poin1);
                    System.out.println("Dengan jumlah Poin Pemain 1 adalah : "+poin1);
                    System.out.println("Cungratulation Pemain 1....");
                }
                else if(poin2 > poin1)
                {
                    System.out.println(" ");
                    System.out.println("Pemain 2 adalah pemenang GUESSING GAME dengan poin : "+poin2);
                    System.out.println("Dengan jumlah Poin Pemain 2 adalah : "+poin2);
                    System.out.println("Cungratulation Pemain 1....");
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("Seri !! Skor kedua pemain seimbang");
                    System.out.println("Total Poin Pemain 1 : "+poin1);
                    System.out.println("Total Poin Pemain 2 : "+poin2);
                }
                break;
            }
        }
    }

    public static boolean gameOver() {
        for (int i = 0; i < tile; i++) {
            for (int j = 0; j < tile; j++) {
                if (hori[i][j].equals(" ~ ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME IN GUESSING GAME...");
            System.out.print("Untuk Memulai game klik a dan untuk keluar klik z : ");
            String az = scanner.nextLine();

            if (az.equals("z")) {
                System.out.println("Game Keluar");
                break;
            } else if (az.equals("a")) {
                System.out.print("Masukkan berapa jumlah tile yang diinginkan (2,4 atau 6) : ");
                tile = scanner.nextInt();
                if(tile == 2) {
                    shufflezon2();
                    for (int i = 0; i < tile; i++) {
                        for (int j = 0; j < tile; j++) {
                            hori[i][j] = " ~ ";
                        }
                    }
                    printhori();
                    checkInput(zon);
                    break;
                }
                if(tile == 4) {
                    shufflezon4();
                    for (int i = 0; i < tile; i++) {
                        for (int j = 0; j < tile; j++) {
                            hori[i][j] = " ~ ";
                        }
                    }
                    printhori();
                    checkInput(zon);
                    break;
                }
                if(tile == 6) {
                    shufflezon6();
                    for (int i = 0; i < tile; i++) {
                        for (int j = 0; j < tile; j++) {
                            hori[i][j] = " ~ ";
                        }
                    }
                    printhori();
                    checkInput(zon);
                    break;
                }
            } else {
                System.out.println("Input Salah");
                continue;
            }
        }

    }

}
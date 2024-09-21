import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int jumlahSiswa;
        double totalNilai = 0;
        double nilai;

        System.out.println("Masukkan jumlah siswa : ");
            jumlahSiswa = scan.nextInt();
            
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            nilai = scan.nextDouble();
            totalNilai +=nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata nilai dari " + jumlahSiswa + " siswa adalah " + rataRata);

        scan.close();
    }
}

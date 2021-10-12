import java.util.Scanner;

public class TugasHariKetiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TugasHariKetiga ar = new TugasHariKetiga();
		ar.soalTambahan();
	}
	public void nomorSatu() {
		Scanner scan = new Scanner(System.in);
		double jmlangka = 0;
		double jumlah=0;
		double ratarata;
		System.out.println("Masukkan angka sepuasnya, jika sudah puas ketik 'X'");
		while (scan.hasNextDouble()) { // UNTUK MENGECEK BOOLEAN APAKAH INI DOUBLE ? JIKA YA DIRUNNING
			Double angka = scan.nextDouble();
			jmlangka+=angka;
			jumlah++;
		}ratarata=jmlangka/jumlah;
		System.out.println("Rata - rata nya adalah = "+ratarata);
		
	}
	public void nomorDua() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan ukuran persegi = ");
		Integer ulang = scan.nextInt();
		for (int i = 0; i < ulang; i++) {
			for (int j = 0; j < ulang; j++) {
				if(j>i) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void nomorTiga() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Masukkan tinggi persegi = ");
			Integer spasi = scan.nextInt();
			for (int i = 0; i < spasi; i++) {
				for (int j = spasi; j >=0; j--) {
					if(j>i) {
						System.out.print(" ");
				}else {
					System.out.print(j+1);
				}
				
			}System.out.println();
		}
	}
	public void nomorEmpat() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai maksimal deret fibonaci = ");
		Integer maks = scan.nextInt();
		int f = 1;
        int f2 = 1;
        int fib = 1;
        System.out.print(f+" ");
        do {
            System.out.print(f2 + " ");
            fib = f + f2;
            f = f2;
            f2 = fib; 
        }while(f2<=maks);
}
	public void soalTambahan() { //KOTAK DENGAN BOLONG DITENGAHNYA
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan panjang huruf = ");
		Integer angka = scan.nextInt();
		for (int i = 0; i < angka; i++) {
				for (int j = 0; j < angka; j++) {
					if(i==0||i==angka-1 ||j==0||j==angka-1) {
					System.out.print("*");
					}
					else if(j==(angka/2) && i==(angka/2)) {
						System.out.print("x");
					}
					else {
						System.out.print(" ");
					}
					
				}System.out.println();
			}
		}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Perulangan {

	public static void main(String[] args) {
		
		Perulangan ulang = new Perulangan();
		ulang.fungsiWhile();
	}
	public void nestedLoop() {
		int y = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Nilai i adalah "+i);
			for (int j = 0; j < 20; j++) {
				System.out.println("Nilai i,j adalah "+i+","+j);
				y++;
			}
			System.out.println("Total perulangan ada "+y+" kali.");
		}
		
	}
	public void kotak() {
		int urutan = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (urutan%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			} System.out.println();
		}
	}
	public void kotakLanjutan() {
		int urutan = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (urutan==11 ||  urutan ==12) {
					System.out.print("!");
				}
				else if (urutan%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
				urutan++;
			} System.out.println();
		}
	}
	public void kotakLanjut3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang baris :");
		Integer baris = scan.nextInt();
		System.out.print("Masukkan panjang kolom :");
		Integer kolom = scan.nextInt();
		
		for (int i = 0; i < baris ; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print("@");
			}	System.out.println();
		}
		System.out.println("Bentuk Transpose :");
		for (int i = 0; i < kolom ; i++) {
			for (int j = 0; j < baris; j++) {
				System.out.print("@");
			}	System.out.println();
			
		}
	
}
	public void fungsiWhile() {
		String keluar = "";
		Scanner scan = new Scanner (System.in);
		while (!keluar.equalsIgnoreCase("Exit")) {
			System.out.println("Ketikkan 'Exit' untuk Keluar.");
			keluar = scan.nextLine();
		}
		System.out.println("Selesai");
	}
	public void latihanSiang1() {
		int y = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(y);
				y++;
			}
			System.out.println();
		}
	}
	public void latihanSiang2() {
		Integer ulang = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public void latihanSiang3() {
		Integer spasi=5;
		Integer bintang =0;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < spasi; j++) {
				System.out.print(" ");
				spasi--;
			}
			for (int k = 0; k<= bintang; k++) {
				System.out.print("1");
			}
			bintang+=2;
			System.out.println();
		}
	}
	public void fungsiWhileDo() {
		int x =0;
		x=x+11;
		while (x<10) {
			System.out.println("Nilai x adalah "+x);
		}
		
		int y=0;
		y=y+11;
		
		do {
			System.out.println("Nilai y adalah "+y);// DO WHILE, MELAKUKAN DULU BARU PENGECEKAN
		} while(y<10);
	}
	public void fungsiBreakContinue() {
		//JANGAN DIGUNAKAN SERING SERING
		Integer x=0;
		Integer y=2;
		while(x>=0) {
			x++;
			System.out.println("Nilai x = "+x);
			if (x==100) {
				System.out.println("Stop");
				break;
			}
		}
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				continue;
			}System.out.println("Halo Continue");
			
		}
	}
	public void kataPalindrom() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Masukkan sebuah kata : ");
		String kalimat = scan.nextLine();
		String palindrom = "";
		for (int i = kalimat.length()-1; i >= 0; i--) {
			palindrom += kalimat.charAt(i);
		}
		if(palindrom.equalsIgnoreCase(kalimat)) {
			System.out.println("Kalimat Palindrom");
		}
		else {
			System.out.println("Bukan Palindrom");
		}
}
	public void random() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.round(Math.random()*10)); // fungsi math untuk menghasilkan nomor random
		}
		System.out.println("perempuan".compareTo("perempuap")); //untuk menghitung beda karakter pertama yang berbeda
		//namanya eksikal
		
	}
	public void bacaFile() {
		File file = new File ("C:\\Users\\Fajri\\Documents\\ADL BOOTCAMP\\inputteks.txt");
		try { 
			Scanner scan = new Scanner (file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}	
		}
		catch (FileNotFoundException e) {
			System.out.println("File tidak ditemukan");
			e.printStackTrace();
		}
	}
	public void tulisFile() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nama Anda : ");
		String nama = scan.nextLine();
		try {
			Writer w = new FileWriter("C:\\Users\\Fajri\\Documents\\ADL BOOTCAMP\\testaja.txt");
			w.write("Nama anda adalah = "+nama);
			w.close();
			System.out.println("Selesai Ditulis");
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


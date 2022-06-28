package BaiTapRL2;

import java.util.ArrayList;
import java.util.Scanner;

import danhBa.DanhBa;
import serializeFile.SerializeFile;

public class baiTapRL2 {
	static ArrayList<DanhBa> dsDanhBa = new ArrayList<DanhBa>();

	public static void menu() {
		System.out.println("1. Nhap vao danh ba");
		System.out.println("2. Xuat vao danh ba");
		System.out.println("3. Luu vao danh ba");
		System.out.println("4. Doc vao danh ba");
		System.out.println("0. Thoat");
		System.out.println("Moi nhap");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			nhapVaoDB();
			break;
		case 2:
			xuatDB();
			break;
		case 3:
			luuVaoDB();
			break;
		case 4:
			docDB();
			break;
		case 0:
			System.exit(0);
			break;

		default:
			System.out.println("khong chinh xac, vui long nhap lại");
			break;
		}
	}
	private static void docDB() {
		dsDanhBa = SerializeFile.readFile("D:/LearnJava/duLieuDb.dat");
		xuatDB();
		
	}
	private static void luuVaoDB() {
		boolean kiemTra = SerializeFile.saveFile(dsDanhBa, "D:/LearnJava/duLieuDb.dat");
		if(kiemTra) {
			System.out.println("Luu thanh cong");
		}
	}
	private static void xuatDB() {
		for(DanhBa db :dsDanhBa) {
			System.out.println(db);
		}
		
	}
	private static void nhapVaoDB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String ten = sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		String soDT = sc.nextLine();
		DanhBa db = new DanhBa(ten, soDT);
		dsDanhBa.add(db);
		
	}
	public static void main(String[] args) {
		while (true) {
			menu();
			
		}

	}

}

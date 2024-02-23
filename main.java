package quanlygiangvien;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        quanli ds = new quanli();
        System.out.println("======================== QUAN LY GIANG DAY CUA GIANG VIEN TAI KHOA CHUYEN MON TRUONG DAI HOC ======================");
        int chon;
        do {
            menu();

            System.out.print("\nHãy chọn từ 1 đến 3: ");
            chon = sc.nextInt();
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");

            switch (chon) {
                case 1: // Quan ly giang vien
                    ds.QLGiangVien();
                    break;
                case 2:// Quang ly mon hoc
                    ds.QLMonHoc();
                    break;
                case 3: // Quang ly lop tin chi
                    ds.QLLopTinChi();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        } while (chon != 0);

    }

    public static void menu() {

        System.out.println("\n1. Quản lý thông tin giảng viên");
        System.out.println("2. Quản lý thông tin môn học");
        System.out.println("3. Quản lý thông tin lớp tín chỉ");
        System.out.println("0. Thoát");

    }
}


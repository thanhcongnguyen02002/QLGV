package quanlygiangvien;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class quanli {

    Scanner sc = new Scanner(System.in);
    dsgv gv = new dsgv();
    dsmh mh = new dsmh();
    dstc tc = new dstc();

    // quan ly thong tin giang vien
    public void QLGiangVien() throws IOException, FileNotFoundException, ClassNotFoundException {
        int chon;
        do {
            menugiangvien();
            System.out.print("\nHãy chọn từ 1 đến 7: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    gv.nhap();
                    break;
                case 2:
                    gv.xuat();
                    break;
                case 3:
                    gv.sapXep();
                    break;
                case 4:
                    gv.xoagv();
                    break;
                case 5:
                    gv.timkiemGV();
                    break;
                case 6:
                    gv.ghifile();
                    break;
                case 7:
                    ArrayList<nguoi> dsgv = gv.docfile();
                    gv.xuatfile(dsgv);
                    break;
                case 10:
                    return;
                default:
                    break;
             //   case 0: System.exit(0); break ;
            }
        } while (chon != 0);
    }

    // quan ly thong tin mon hoc
    public void QLMonHoc() throws IOException, FileNotFoundException, ClassNotFoundException {
        int chon;
        do {
            menumonhoc();
            System.out.print("\nHãy chọn từ 1 đến 6: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    mh.nhap();
                    break;
                case 2:
                    mh.xuat();
                    break;
                case 3:
                    mh.timTheoTenMon();
                    break;
                case 4:
                    mh.tongmh();
                    break;
                case 5:
                    mh.ghifile();
                    break;
                case 6:
                    ArrayList<monhoc> dsmh = mh.docfile();
                    mh.xuatfile(dsmh);
                    break;
                case 10:
                    return;
                default:
                    break;
            }
        } while (chon != 0);
    }

    // quan ly thong tin lop tin chi
    public void QLLopTinChi() throws IOException, ClassNotFoundException {
        int chon;
        do {
            menuloptinchi();
            System.out.print("\nHãy chọn từ 1 đến 6: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    tc.nhap();
                    break;
                case 2:
                    tc.xuat();
                    break;
                case 3:
                    tc.timloptc();
                    break;
                case 4:
                    tc.demSoLoptc();
                    break;
                case 5:
                    tc.hienLTCsosvMax();
                    break;
                case 6:
                    tc.ghifileT();
                    break;
                case 7:
                    ArrayList<tinchi> dstc = tc.docfile();
                    tc.xuatfile(dstc);
                    return;
                default:
                    break;
            }
        } while (chon != 0);
    }

    //menu giang vien
    public void menugiangvien() {
        System.out.println("\n1. Nhập danh sách giảng viên");
        System.out.println("2. Hiện danh sách giảng viên");
        System.out.println("3. Sắp xếp danh sách giảng viên");
        System.out.println("4. Xóa thông tin giảng viên");
        System.out.println("5. Tìm kiếm giảng viên");
        System.out.println("6. Ghi file danh sách giảng viên");
        System.out.println("7. Đọc file danh sách giảng viên");
        System.out.println("0. Quay lại");
        System.out.print("\n-----------------------------------------------------------------------------------------------\n");
    }

    //menu mon hoc
    public void menumonhoc() {
        System.out.println("\n1. Nhập danh sách môn học");
        System.out.println("2. Hiện danh sách môn học");
        System.out.println("3. Tìm môn học theo tên");
        System.out.println("4. Tong so mon hoc");
        System.out.println("5. Ghi file danh sách môn học");
        System.out.println("6. Đọc file danh sách môn học");
        System.out.println("0. Quay lại");
        System.out.print("\n-----------------------------------------------------------------------------------------------\n");
    }

    //menu lop tin chi
    public void menuloptinchi() {
        System.out.println("\n1. Nhập danh sách lớp tín chỉ");
        System.out.println("2. Hiện danh sách lớp tín chỉ");
        System.out.println("3. Tìm lớp tín chỉ theo mã lớp");
        System.out.println("4. Tổng số lớp tín chỉ");
        System.out.println("5. Tìm lớp tín chỉ có nhiều sinh viên nhất");
        System.out.println("6. Ghi file danh sách lớp tín chỉ");
        System.out.println("7. Đọc file danh sách lớp tín chỉ");
        System.out.println("0. Quay lại");
        System.out.print("\n-----------------------------------------------------------------------------------------------\n");
    }

}

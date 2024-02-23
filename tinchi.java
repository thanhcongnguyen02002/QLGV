package quanlygiangvien;



import java.io.Serializable;
import java.util.Scanner;

public class tinchi implements Serializable {

    private String malop;
    private String tenphong;
    private String cahoc;
    private String ngayhoc;
    private int sosv;
    private monhoc TTMonHoc;
    private nguoi TTGiangVien;

    public tinchi() {
    }

    public tinchi(String malop, String tenphong, String cahoc, String ngayhoc, int sosv, monhoc mh, nguoi gv) {
        this.malop = malop;
        this.tenphong = tenphong;
        this.cahoc = cahoc;
        this.ngayhoc = ngayhoc;
        this.sosv = sosv;
        TTMonHoc = mh;
        TTGiangVien = gv;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getCahoc() {
        return cahoc;
    }

    public void setCahoc(String cahoc) {
        this.cahoc = cahoc;
    }

    public String getNgayhoc() {
        return ngayhoc;
    }

    public void setNgayhoc(String ngayhoc) {
        this.ngayhoc = ngayhoc;
    }

    public int getSosv() {
        return sosv;
    }

    public void setSosv(int sosv) {
        this.sosv = sosv;
    }

    public monhoc getTTMonHoc() {
        return TTMonHoc;
    }

    public void setTTMonHoc(monhoc TTMonHoc) {
        this.TTMonHoc = TTMonHoc;
    }

    public nguoi getTTGiangVien() {
        return TTGiangVien;
    }

    public void setTTGiangVien(nguoi TTGiangVien) {
        this.TTGiangVien = TTGiangVien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");
        malop = sc.nextLine();
        System.out.print("Nhập tên phòng học: ");
        tenphong = sc.nextLine();
        System.out.print("Nhập ca hoc: ");
        cahoc = sc.nextLine();
        System.out.print("Nhập ngày học: ");
        ngayhoc = sc.nextLine();
        System.out.print("Nhập số lượng sinh viên: ");
        sosv = sc.nextInt();
        System.out.println("Lấy thông tin giảng viên");
        System.out.print("Nhập mã giảng viên: ");
        sc.nextLine();
        String magv = sc.nextLine();
        dsgv dsGV = new dsgv();
        nguoi gv = dsGV.timkiem(magv);
        if (gv != null) {
            TTGiangVien = gv;
        } else {
            System.out.println("Giảng viên chưa có trong hệ thống.");
        }
        System.out.println("Lấy thông tin môn học");
        System.out.print("Nhập mã môn học: ");
        String mamh = sc.nextLine();
        dsmh dsMH = new dsmh();
        monhoc mh = dsMH.timkiem(mamh);
        if (mh != null) {
            TTMonHoc = mh;
        } else {
            System.out.print("Môn học này chưa có trong hệ thống.");
        }
    }

    public void xuat() {
        System.out.print("\n----THÔNG TIN LỚP HOC----\n");
        System.out.printf("%20s%20s%20s%20s%20s\n",
                "Ma lop hoc", "Phong hoc", "Ca hoc", "Ngay hoc", "Sl sinh vien");
        System.out.printf("%20s%20s%20s%20s%20d\n",
                getMalop(), getTenphong(), getCahoc(), getNgayhoc(), getSosv());
        TTMonHoc.xuat();
        TTGiangVien.xuat();
    }

}

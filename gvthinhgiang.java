package quanlygiangvien;

import java.io.Serializable;
import java.util.Scanner;

public class gvthinhgiang extends nguoi implements Serializable{

    private String donvi;
    private String nhommon;

    public gvthinhgiang() {
    }

    public gvthinhgiang(String donvi, String nhommon) {
        super();
        this.donvi = donvi;
        this.nhommon = nhommon;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getNhommon() {
        return nhommon;
    }

    public void setNhommon(String nhommon) {
        this.nhommon = nhommon;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập đơn vị giảng dạy: ");
        donvi = sc.nextLine();
        System.out.print("Nhập nhóm môn giảng dạy: ");
        nhommon = sc.nextLine();

    }

    public double tinhLuong() {
        return getHsl() * 2300000;
    }

    public void xuat() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%20s\n",
                "Ma giao vien", "Ten giao vien", "Ngay sinh", "He so luong",
                "DM thanh toan",
                "Don vi GD", "Nhom mon GD", "Tien luong");
        super.xuat();
        System.out.printf("%20s%20s%20.2f\n",
                getDonvi(), getNhommon(), tinhLuong());
    }

}


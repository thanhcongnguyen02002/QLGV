package quanlygiangvien;


import java.io.Serializable;
import java.util.Scanner;

public class nguoi implements Serializable{
    private String magv;
    private String tengv;
    private String ngaysinh;
    private double hsl;
    private double dmtt;

    public nguoi() {
    }

    public nguoi(String magv, String tengv, String ngaysinh, double hsl, double dmtt) {
        this.magv = magv;
        this.tengv = tengv;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
        this.dmtt = dmtt;
    }

    public String getMagv() {
        return magv;
    }
    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getTengv() {
        return tengv;
    }
    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getHsl() {
        return hsl;
    }
    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double getDmtt() {
        return dmtt;
    }
    public void setDmtt(double dmtt) {
        this.dmtt = dmtt;
    }

    @Override
    public String toString() {
        System.out.printf("%20s%20s%20s%20s%20s\n",
                "Ma giao vien", "Ten giao vien", "Ngay sinh", "He so luong",
                "DM thanh toan");
        return String.format("%20s%20s%20s%20.2f%20.2f\n",
                getMagv(),getTengv(),getNgaysinh(),getHsl(), getDmtt());
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã giáo viên: ");
        magv = sc.nextLine();
        System.out.print("Nhập tên giáo viên: ");
        tengv = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        hsl = sc.nextDouble();
        System.out.print("Nhập hệ số định mức: ");
        dmtt = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("%20s%20s%20s%20.2f%20.2f"
                , getMagv(), getTengv(), getNgaysinh(), getHsl(), getDmtt());
    }


}

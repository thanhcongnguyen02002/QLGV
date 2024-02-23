package quanlygiangvien;



import java.io.Serializable;
import java.util.Scanner;

public class gvcohuu extends nguoi implements Serializable{
    private String nhommon;
    private double hspc;
    private int tietnv;

    public gvcohuu() {
    }

    public gvcohuu(String nhommon, double hspc, int tietnv) {
        super();
        this.nhommon = nhommon;
        this.hspc = hspc;
        this.tietnv = tietnv;
    }

    public String getNhommon() {
        return nhommon;
    }
    public void setNhommon(String nhommon) {
        this.nhommon = nhommon;
    }

    public double getHspc() {
        return hspc;
    }
    public void setHspc(double hspc) {
        this.hspc = hspc;
    }

    public int getTietnv() {
        return tietnv;
    }
    public void setTietnv(int tietnv) {
        this.tietnv = tietnv;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập nhóm môn giảng dạy: ");
        nhommon = sc.nextLine();
        System.out.print("Nhập hệ số phụ cấp: ");
        hspc = sc.nextDouble();
        System.out.print("Nhập số tiết nghĩa vụ: ");
        tietnv = sc.nextInt();
    }

    public double tinhLuong() {
        return (getHsl() * 2300000) + ((getHsl() * 2300000) * hspc);
    }

    public void xuat() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%20s%20s\n",
                "Ma giao vien", "Ten giao vien", "Ngay sinh", "He so luong",
                "DM thanh toan",
                "Nhom mon GD", "So tiet NV", "Hs phu cap", "Tien luong");
        super.xuat();
        System.out.printf("%20s%20d%20.2f%20.2f\n",
                getNhommon(), getTietnv(),getHspc(),tinhLuong());
    }


}

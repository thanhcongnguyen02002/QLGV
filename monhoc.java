package quanlygiangvien;



import java.io.Serializable;
import java.util.Scanner;

public class monhoc implements Serializable{

    private String mamon;
    private String tenmon;
    private int sotc;

    public monhoc() {

    }

    public monhoc(String mamon, String tenmon, int sotc) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotc = sotc;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        return String.format("%20s%20s%20d\n",
                getMamon(), getTenmon(), getSotc());
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã môn học: ");
        mamon = sc.nextLine();
        System.out.print("Nhập tên môn học: ");
        tenmon = sc.nextLine();
        System.out.print("Nhập số tín chỉ: ");
        sotc = sc.nextInt();
    }

    public void xuat() {
        System.out.printf("%20s%20s%20s\n",
                "Ma mon hoc", "Ten mon hoc", "Sl tin chi");
        System.out.printf("%20s%20s%20d\n",
                getMamon(), getTenmon(), getSotc());
    }

}


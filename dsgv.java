package quanlygiangvien;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class dsgv {

    ArrayList<nguoi> lstN = new ArrayList<nguoi>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giảng viên: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("1: Giao vien co huu  ");
            System.out.print(" \n2: Giao vien thinh giang  ");
            System.out.print("\nChọn loại giáo viên thứ "+(i+1)+" : ");
            int loai = sc.nextInt();

            switch (loai) {
                case 1:
                    gvcohuu ch = new gvcohuu();
                    ch.nhap();
                    lstN.add(ch);
                    break;
                case 2:
                    gvthinhgiang tg = new gvthinhgiang();
                    tg.nhap();
                    lstN.add(tg);
                    break;
            }
        }
    }

    public void xuat() {
        System.out.print("");
        /*for (nguoi x : lstN) {
            x.xuat();*/
        for (int i = 0; i < lstN.size(); i++)
            lstN.get(i).xuat();
        //   }
    }

    // Sap xep tang dan theo ten
    public void sapXep() {
        nguoi tg = new nguoi();
        for (int i = 0; i < lstN.size(); i++) {
            for (int j = i + 1; j < lstN.size(); j++) {
                if (lstN.get(i).getTengv().compareTo(lstN.get(j).getTengv()) > 0) {
                    tg = lstN.get(i);
                    lstN.set(i, lstN.get(j));
                    lstN.set(j, tg);
                }
            }
        }
        System.out.println("\nDanh sách giảng viên sau khi sắp xếp theo tăng dần là:");
        xuat();
    }

    //Xoa giang vien
    public void xoagv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã giảng viên muốn xóa:");
        String maGv = sc.nextLine();
        int n = lstN.size();
        for (int i = 0; i < n; i++) {
            if (lstN.get(i).getMagv().equals(maGv) == true) {
                lstN.remove(i);
                break;
            }
        }
        System.out.println("Danh sách giảng viên sau khi xóa là: ");
        xuat();
    }
    public void timkiemGV()
    {
        String maGV ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print (" Nhập mã giảng viên cần tìm: ") ;
        maGV = sc.nextLine();
        for(nguoi x: lstN)
            if (x.getMagv().equals(maGV))
                x.xuat();
    }

    //ghi file
    public void ghifile() throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("DSGV.dat");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(lstN);
        out.close();
        file.close();
        System.out.print("\n ghi thành công thông tin vào file DSGV\n");
        System.out.println();
    }

    //doc file
    public ArrayList<nguoi> docfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<nguoi> kq = new ArrayList<nguoi>();
        FileInputStream file = new FileInputStream("DSGV.dat");
        ObjectInputStream in = new ObjectInputStream(file);
        kq = (ArrayList<nguoi>)in.readObject();
        in.close();
        file.close();
        return kq;
    }

    //xuat file
    public void xuatfile (ArrayList<nguoi> kq){
        for(nguoi x: kq) {
            x.xuat();
        }
    }

    //danh sach tim kiem giang vien theo ma
    public nguoi timkiem(String magv) {
        try {
            lstN = docfile();
            for(nguoi nguoi: lstN) {
                if(nguoi.getMagv().equals(magv)) {
                    return nguoi;
                }
            }
        }
        catch(Exception e) {
            System.out.println("không có dữ liệu!");
            return null;
        }
        return null;
    }
}

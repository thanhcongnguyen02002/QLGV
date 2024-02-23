package quanlygiangvien;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class dstc {

    ArrayList<tinchi> lstTC = new ArrayList<tinchi>();

    // Ham nhap 1 danh sach lop tin chi
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng lớp tín chỉ: ");
        int n = sc.nextInt();
        // Nhap tung lop 1
        for (int i = 0; i < n; i++) {
            System.out.println();
            tinchi ltc = new tinchi();
            ltc.nhap();
            System.out.println();
            System.out.print("\n-----------------------------------------------------------------------------------------------");
            lstTC.add(ltc);

        }
    }

    public void xuat() {
        for (int i = 0; i<lstTC.size();i++)
            lstTC.get(i).xuat();
    }

    //Tim lop tin chi theo "ma lop"
    public void timloptc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n-----------------------------------------------------------------------------------------------");
        System.out.print("\nNhập mã lớp tín chỉ cần tìm: ");
        String maLop = sc.nextLine();
        for (int i = 0; i < lstTC.size(); i++) {
            if (lstTC.get(i).getMalop().equals(maLop) == true) {
                lstTC.get(i).xuat();
            }
        }
    }

    // dem so lop tin chi
    public void demSoLoptc() {
        System.out.println("Nhập số lượng lớp tín chỉ: " + lstTC.size());
    }

    //hien lop tin chi co so sinh vien max
    public void hienLTCsosvMax() {
        System.out.print("\nLớp tín chỉ có nhiều sinh viên nhất: ");
        int max = lstTC.get(0).getSosv();
        for (int i = 0; i < lstTC.size(); i++) {
            if (lstTC.get(i).getSosv() > max) {
                max = lstTC.get(i).getSosv();
            }
        }
        for (tinchi x : lstTC) {
            if (x.getSosv() == max) {
                x.xuat();
                System.out.println();
                System.out.println("\n----------------------------------------------\n");
            }
        }
    }

    //luu danh sach vao file
    public void ghifileT() throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("DSTC.dat");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(lstTC);
        out.close();
        file.close();

        System.out.print("\n Lưu thành công thông tin vào file DSTC\n ");
        System.out.println();
    }

    //doc file
    public ArrayList<tinchi> docfile() throws IOException, ClassNotFoundException {
        ArrayList<tinchi> kq = new ArrayList<tinchi>();
        FileInputStream file = new FileInputStream("DSTC.dat");
        ObjectInputStream in = new ObjectInputStream(file);
        kq = (ArrayList<tinchi>)in.readObject();
        in.close();
        file.close();
        return kq;
    }

    //xuat file
    public void xuatfile(ArrayList<tinchi> kq) {
        System.out.print("\n-----------------------------------------------------------------------------------------------");
        System.out.println("\nDanh sách lớp tín chỉ sau khi xuất file\n ");
        for (tinchi x : kq) {
            x.xuat();
            System.out.println();
        }
    }
}


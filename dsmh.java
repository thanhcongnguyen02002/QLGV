package quanlygiangvien;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class dsmh {

    ArrayList<monhoc> lstMH= new ArrayList<monhoc>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng môn học: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            monhoc mh = new monhoc();
            mh.nhap();
            lstMH.add(mh);
        }
    }

    public void xuat() {

        for (int i = 0; i<lstMH.size();i++)
            lstMH.get(i).xuat();
    }

    //tim kiem mon hoc theo ten
    public void timTheoTenMon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        String tenMon = sc.nextLine();
        System.out.printf("%20s%20s%20s\n", "Ma mon hoc", "Ten mon hoc", "Sl tin chi");
        for (int i = 0; i < lstMH.size(); i++) {
            if (lstMH.get(i).getTenmon().equals(tenMon) == true) {
                System.out.print(lstMH.get(i));
                System.out.println();
            }
        }
    }

    //tong so mon hoc
    public void tongmh() {
        System.out.println("Tổng số môn học: " + lstMH.size());
    }


    //ghi file danh sach mon hoc
    public void ghifile() throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("DSMH.dat");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(lstMH);
        out.close();
        file.close();

        System.out.print("\nLưu thanh công thông tin vào file DSMH ");
        System.out.println();
    }

    //doc file danh sach mon hoc
    public ArrayList<monhoc> docfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<monhoc> kq = new ArrayList<monhoc>();
        FileInputStream file = new FileInputStream("DSMH.dat");
        ObjectInputStream in = new ObjectInputStream(file);
        kq = (ArrayList<monhoc>) in.readObject();
        in.close();
        file.close();
        return kq;

    }

    //xuat file
    public void xuatfile(ArrayList<monhoc> kq) {
        System.out.println("\nDanh sách môn học sau khi xuất file\n");
        for (monhoc x : kq) {
            x.xuat();
        }
    }

    // tim kiem thong tin mon hoc
    public monhoc timkiem(String mamh) {
        try {
            lstMH= docfile();
            for(monhoc mh: lstMH) {
                if(mh.getMamon().equals(mamh)) {
                    return mh;
                }
            }
        } catch (Exception e) {
            System.out.println("\nKhông có dữ liệu!\n");
            return null;
        }
        return null;
    }

}


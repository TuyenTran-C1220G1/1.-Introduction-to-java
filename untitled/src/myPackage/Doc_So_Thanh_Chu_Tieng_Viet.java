package myPackage;

import java.util.Scanner;

public class Doc_So_Thanh_Chu_Tieng_Viet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int so = sc.nextInt();
        String[] soThanhChu = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        if (so < 10) {
            System.out.println(soThanhChu[so]);
        } else if (so < 100) {
            int hangChuc = so / 10;
            int hangDonVi = so % 10;
            if (hangChuc == 1) {
                if (hangDonVi == 0) {
                    System.out.println("Mười");
                } else if (hangDonVi == 5) {
                    System.out.println("Mười Lăm");
                } else {
                    System.out.println("Mười " + soThanhChu[hangDonVi]);
                }
            } else {
                if (hangDonVi == 0) {
                    System.out.println(soThanhChu[hangChuc] + " Mươi");
                } else {
                    System.out.println(soThanhChu[hangChuc] + " Mười " + soThanhChu[hangDonVi]);
                }
            }
        } else if (so < 1000) {
            int hangTram = so / 100;
            int hangChuc = (so % 100) / 10;
            int hangDonVi = (so % 100) % 10;
            if (hangDonVi == 0) {
                if (hangChuc == 0) {
                    System.out.println(soThanhChu[hangTram] + " Trăm");
                } else {
                    System.out.println(soThanhChu[hangTram] + " Trăm " + soThanhChu[hangChuc] + " Mươi");
                }
            } else if (hangChuc == 0) {
                System.out.println(soThanhChu[hangTram] + " Trăm Linh " + soThanhChu[hangDonVi]);
            } else {
                System.out.println(soThanhChu[hangTram] + " Trăm " + soThanhChu[hangChuc] + " Mươi " + soThanhChu[hangDonVi]);
            }
        }
    }
}

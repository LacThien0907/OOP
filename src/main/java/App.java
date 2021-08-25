import Entities.PhanSo;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
//        PhanSo ps1 = new PhanSo();
//        ps1.print1();
//
//        PhanSo ps2 = new PhanSo();
//        ps2.print1();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("a/b = ");
        String n1 = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("c/d = ");
        String n2 = sc1.nextLine();

        PhanSo ps1 = new PhanSo();
        ps.fromString(n1);
        ps.print();

        PhanSo ps2 = new PhanSo();
        ps.fromString(n2);
        ps.print();


    }
}

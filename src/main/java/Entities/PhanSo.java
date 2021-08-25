package Entities;

import java.util.Scanner;

public class PhanSo {
    private int tuSo1;
    private  int tuSo2;
    private int mauSo1;
    private int mauSo2;

    public void fromString(String str) {
        String[] parts = str.split("/");
        this.tuSo1 = Integer.parseInt(parts[0]);
        this.mauSo1 = Integer.parseInt(parts[1]);
        this.tuSo2 = Integer.parseInt(parts[2]);
        this.mauSo2 = Integer.parseInt(parts[3]);

    }

}

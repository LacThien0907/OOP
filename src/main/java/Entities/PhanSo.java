package Entities;

import java.util.Scanner;

public class PhanSo {
    private int tuSo1;
    private int tuSo2;
    private int mauSo1;
    private int mauSo2;

    public void print() {
        System.out.format("%d/%d\n", this.tuSo1, this.mauSo1);
        System.out.format("%d/%d\n", this.tuSo2, this.mauSo2);
    }

    public void fromString(String str) {
        String[] parts = str.split("/");
        this.tuSo1 = Integer.parseInt(parts[0]);
        this.mauSo1 = Integer.parseInt(parts[1]);
        this.tuSo2 = Integer.parseInt(parts[2]);
        this.mauSo2 = Integer.parseInt(parts[3]);

    }

    // Rut gon phan so 1
    public int sortFraction(int ps1) {
        int ret = ps1;
        int sorttuSo1 = tuSo1;
        int sortmauso1 = mauSo1;
        if (tuSo1 == mauSo1) {
            ret = 1;
            return ret;
        } else {
            for (int i = 1; i <= tuSo1; i++) {
                if ((tuSo1 % i == 0) && (mauSo1 % i == 0)) {
                    sorttuSo1 = (tuSo1 / i);
                    sortmauso1 = (mauSo1 / i);
                }
            }
        }
        return ret;
    }

    // Tong 2 phan so
    public void sumFraction(int ps1, int ps2) {
        int sumTuSo;
        int sumMauSo;
        sumTuSo = (tuSo1 * mauSo2 + mauSo1 * tuSo2);
        sumMauSo = mauSo1 * mauSo2;
    }

    // Hieu 2 phan so
    public void minusFraction(int ps1, int ps2) {
        int minusTuSo;
        int minusMauSo;
        minusTuSo = (tuSo1 * mauSo2 - mauSo1 * tuSo2);
        minusMauSo = mauSo1 * mauSo2;
    }

    // Nhan 2 phan so
    public void mulFraction(int ps1, int ps2) {
        int mulTuSo;
        int mulMauSo;
        mulTuSo = tuSo1 * tuSo2;
        mulMauSo = mauSo1 * mauSo2;
    }

    // Chia 2 phan so
    public void diFraction(int ps1, int ps2) {
        int diTuSo;
        int diMauSo;
        diTuSo = tuSo1 * mauSo2;
        diMauSo = mauSo1 * tuSo1;
    }

    // Kiem tra phan so 1 toi gian
    public boolean simpleFraction(int ps1) {
        boolean ret;
        int _tuSo1 = tuSo1;
        int _mauSo1 = mauSo1;
        for (int i = 1; i <= tuSo1; i++) {
            if ((tuSo1 % i == 0) && (mauSo1 % i == 0)) {
                ret = true;
            }
        }
        return ret = false;
    }

    // Quy dong 2 phan so
    public void equatetFraction(int ps1, int ps2) {
        int equatetuSo1 = tuSo1 * mauSo2;
        int equatemauso1 = mauSo1 * mauSo2;
        int equatetuSo2 = mauSo1 * tuSo2;
        int equatemauso2 = mauSo1 * mauSo2;
    }

    // Kiem tra phan 1 so am hay duong
    public boolean sizeFaction (int ps1) {
        boolean ret = true;
        if ((tuSo1 * mauSo1) > 0) {
            return ret = true;
        } else if ((tuSo1 * mauSo1) < 0) {
            return ret = false;
        }
        return ret;
    }

    public boolean comepareFraction(int ps1, int ps2){
        boolean ret = true;
        double compare1 = tuSo1/mauSo1;
        double compare2 = tuSo2/mauSo2;
        if ( compare1 > compare2){
            return ret = true;
        }
        else if (compare1 < compare2){
            return ret = true;
        }
        return ret;
    }


}

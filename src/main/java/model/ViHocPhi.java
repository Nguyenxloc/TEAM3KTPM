/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ViHocPhi {
    
    public String maVi;
    
    public String maSV;
    
    public double viHocPhi;
    
    public double viHocPhiThiLai;
    
    public double viKhac;
    
    public double viUuDai;

    public ViHocPhi() {
    }

    public ViHocPhi(String maVi, String maSV, double viHocPhi, double viHocPhiThiLai, double viKhac, double viUuDai) {
        this.maVi = maVi;
        this.maSV = maSV;
        this.viHocPhi = viHocPhi;
        this.viHocPhiThiLai = viHocPhiThiLai;
        this.viKhac = viKhac;
        this.viUuDai = viUuDai;
    }

    public String getMaVi() {
        return maVi;
    }

    public void setMaVi(String maVi) {
        this.maVi = maVi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getViHocPhi() {
        return viHocPhi;
    }

    public void setViHocPhi(double viHocPhi) {
        this.viHocPhi = viHocPhi;
    }

    public double getViHocPhiThiLai() {
        return viHocPhiThiLai;
    }

    public void setViHocPhiThiLai(double viHocPhiThiLai) {
        this.viHocPhiThiLai = viHocPhiThiLai;
    }

    public double getViKhac() {
        return viKhac;
    }

    public void setViKhac(double viKhac) {
        this.viKhac = viKhac;
    }

    public double getViUuDai() {
        return viUuDai;
    }

    public void setViUuDai(double viUuDai) {
        this.viUuDai = viUuDai;
    }

    @Override
    public String toString() {
        return "ViHocPhi{" + "maVi=" + maVi + ", maSV=" + maSV + ", viHocPhi=" + viHocPhi + ", viHocPhiThiLai=" + viHocPhiThiLai + ", viKhac=" + viKhac + ", viUuDai=" + viUuDai + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class LichHoc {
    
    public String maSV;
    
    public String maMonHoc;
    
    public String maLopHoc;
    
    public String maPhongHoc;
    
    public String maChuyenNganh;
    
    public int nam;
    
    public String mua;

    public LichHoc() {
    }

    public LichHoc(String maSV, String maMonHoc, String maLopHoc, String maPhongHoc, String maChuyenNganh, int nam, String mua) {
        this.maSV = maSV;
        this.maMonHoc = maMonHoc;
        this.maLopHoc = maLopHoc;
        this.maPhongHoc = maPhongHoc;
        this.maChuyenNganh = maChuyenNganh;
        this.nam = nam;
        this.mua = mua;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getMaPhongHoc() {
        return maPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        this.maPhongHoc = maPhongHoc;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getMua() {
        return mua;
    }

    public void setMua(String mua) {
        this.mua = mua;
    }

    @Override
    public String toString() {
        return "LichHoc{" + "maSV=" + maSV + ", maMonHoc=" + maMonHoc + ", maLopHoc=" + maLopHoc + ", maPhongHoc=" + maPhongHoc + ", maChuyenNganh=" + maChuyenNganh + ", nam=" + nam + ", mua=" + mua + '}';
    }
    
    
}

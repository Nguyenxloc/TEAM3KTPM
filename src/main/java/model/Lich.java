/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Lich {
    public String maSV;
    public String maMonHoc;
    public String maLopHoc;
    public String maPhongHoc;
    public String maGiangVien;
    public String maChuyenNganh;
    public int nam;
    public String mua;
    public String ngay;
    public String thoiGian;
    
    public Lich() {
    }

    public Lich(String maSV, String maMonHoc, String maLopHoc, String maPhongHoc, String maGiangVien, String maChuyenNganh, int nam, String mua, String ngay, String thoiGian) {
        this.maSV = maSV;
        this.maMonHoc = maMonHoc;
        this.maLopHoc = maLopHoc;
        this.maPhongHoc = maPhongHoc;
        this.maGiangVien = maGiangVien;
        this.maChuyenNganh = maChuyenNganh;
        this.nam = nam;
        this.mua = mua;
        this.ngay = ngay;
        this.thoiGian = thoiGian;
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

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
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

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "LichHoc{" + "maSV=" + maSV + ", maMonHoc=" + maMonHoc + ", maLopHoc=" + maLopHoc + ", maPhongHoc=" + maPhongHoc + ", maGiangVien=" + maGiangVien + ", maChuyenNganh=" + maChuyenNganh + ", nam=" + nam + ", mua=" + mua + ", ngay=" + ngay + ", thoiGian=" + thoiGian + '}';
    }

    
    
}

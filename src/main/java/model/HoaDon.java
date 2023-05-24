/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    
    public String maHoaDon;
    
    public String maSV;
    
    public double soTien;
    
    public String thoiGian;
    
    public String chuThich;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maSV, double soTien, String thoiGian, String chuThich) {
        this.maHoaDon = maHoaDon;
        this.maSV = maSV;
        this.soTien = soTien;
        this.thoiGian = thoiGian;
        this.chuThich = chuThich;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", maSV=" + maSV + ", soTien=" + soTien + ", thoiGian=" + thoiGian + ", chuThich=" + chuThich + '}';
    }
    
    
    
    
}

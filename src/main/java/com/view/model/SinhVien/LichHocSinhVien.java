/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.model.SinhVien;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ADMIN
 */
public class LichHocSinhVien {
    
    public Date ngayHoc;
    
    public String tenPhongHoc;
    
    public String tenLopHoc;
    
    public String tenMonHoc;
    
    public String tengiangVien;
    
    public Time thoiGian;

    public LichHocSinhVien() {
    }

    public LichHocSinhVien(Date ngayHoc, String tenPhongHoc, String tenLopHoc, String tenMonHoc, String tengiangVien, Time thoiGian) {
        this.ngayHoc = ngayHoc;
        this.tenPhongHoc = tenPhongHoc;
        this.tenLopHoc = tenLopHoc;
        this.tenMonHoc = tenMonHoc;
        this.tengiangVien = tengiangVien;
        this.thoiGian = thoiGian;
    }

    public Date getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(Date ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getTengiangVien() {
        return tengiangVien;
    }

    public void setTengiangVien(String tengiangVien) {
        this.tengiangVien = tengiangVien;
    }

    public Time getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Time thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "LichHocSinhVien{" + "ngayHoc=" + ngayHoc + ", tenPhongHoc=" + tenPhongHoc + ", tenLopHoc=" + tenLopHoc + ", tenMonHoc=" + tenMonHoc + ", tengiangVien=" + tengiangVien + ", thoiGian=" + thoiGian + '}';
    }
    
}

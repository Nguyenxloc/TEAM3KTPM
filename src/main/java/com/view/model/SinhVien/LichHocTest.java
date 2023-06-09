/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.model.SinhVien;

/**
 *
 * @author ADMIN
 */
public class LichHocTest {
    
    private String ngay;
    
    private String phongHoc;
    
    private String tenMonHoc;
    
    private String tenLopHoc;
    
    private String tenGiangVien;
    
    private String thoiGian;

    public LichHocTest() {
    }

    public LichHocTest(String ngay, String phongHoc, String tenMonHoc, String tenLopHoc, String tenGiangVien, String thoiGian) {
        this.ngay = ngay;
        this.phongHoc = phongHoc;
        this.tenMonHoc = tenMonHoc;
        this.tenLopHoc = tenLopHoc;
        this.tenGiangVien = tenGiangVien;
        this.thoiGian = thoiGian;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "LichHocTest{" + "ngay=" + ngay + ", phongHoc=" + phongHoc + ", tenMonHoc=" + tenMonHoc + ", tenLopHoc=" + tenLopHoc + ", tenGiangVien=" + tenGiangVien + ", thoiGian=" + thoiGian + '}';
    }

   
}

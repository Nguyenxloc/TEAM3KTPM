/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    
    public String maSV;
    
    public int nienKhoa;
    
    public String hoten;
    
    public int gioitinh;
    
    public String ngaySinh;
    
    public String email;
    
    public String soDienThoai;
    
    public String diaChi;
    
    public String trangThai;

    public SinhVien() {
    }

    public SinhVien(String maSV, int nienKhoa, String hoten, int gioitinh, String ngaySinh, String email, String soDienThoai, String diaChi, String trangThai) {
        this.maSV = maSV;
        this.nienKhoa = nienKhoa;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(int nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", nienKhoa=" + nienKhoa + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", ngaySinh=" + ngaySinh + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", trangThai=" + trangThai + '}';
    }
    
    
}

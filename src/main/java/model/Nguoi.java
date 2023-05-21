/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84374
 */
public class Nguoi {
    private String id;
    private String tenTK;
    private String name;
    private boolean gioiTinh;
    private String  ngaySinh;
    private String email;
    private String sđt;
    private String diaChi;
    private String vaiTro;

    public Nguoi() {
    }

    public Nguoi(String id, String tenTK, String name, boolean gioiTinh, String ngaySinh, String email, String sđt, String diaChi) {
        this.id = id;
        this.tenTK = tenTK;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.sđt = sđt;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getSđt() {
        return sđt;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "id=" + id + ", tenTK=" + tenTK + ", name=" + name + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", email=" + email + ", s\u0111t=" + sđt + ", diaChi=" + diaChi + ", vaiTro=" + vaiTro + '}';
    }
    
    
    
}

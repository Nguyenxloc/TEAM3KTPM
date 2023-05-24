/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    
    public String tentaiKhoan;
    
    public String matKhau;
    
    public String vaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String tentaiKhoan, String matKhau, String vaiTro) {
        this.tentaiKhoan = tentaiKhoan;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    public String getTentaiKhoan() {
        return tentaiKhoan;
    }

    public void setTentaiKhoan(String tentaiKhoan) {
        this.tentaiKhoan = tentaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tentaiKhoan=" + tentaiKhoan + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChuyenNganh {
    
    public String maChuyenNganh;
    
    public String tenChuyenNganh;
    
    public String coSo;
    
    public String thoiGianDaoTao;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String maChuyenNganh, String tenChuyenNganh, String coSo, String thoiGianDaoTao) {
        this.maChuyenNganh = maChuyenNganh;
        this.tenChuyenNganh = tenChuyenNganh;
        this.coSo = coSo;
        this.thoiGianDaoTao = thoiGianDaoTao;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getTenChuyenNganh() {
        return tenChuyenNganh;
    }

    public void setTenChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }

    public String getCoSo() {
        return coSo;
    }

    public void setCoSo(String coSo) {
        this.coSo = coSo;
    }

    public String getThoiGianDaoTao() {
        return thoiGianDaoTao;
    }

    public void setThoiGianDaoTao(String thoiGianDaoTao) {
        this.thoiGianDaoTao = thoiGianDaoTao;
    }

    @Override
    public String toString() {
        return "ChuyenNganh{" + "maChuyenNganh=" + maChuyenNganh + ", tenChuyenNganh=" + tenChuyenNganh + ", coSo=" + coSo + ", thoiGianDaoTao=" + thoiGianDaoTao + '}';
    }
    
    
}

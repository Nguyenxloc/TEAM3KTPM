package model;

import java.sql.Date;

/**
 *
 * @author Hello
 */
public class LichThi {
    private String maSV;
    private String maMonHoc;
    private String maLopHoc;
    private String maPhongHoc;
    private String maGiangVien;
    private String maChuyenNganh;
    private int nam;
    private String mua;
    private String ngay;
    private String thoiGian;

    public LichThi() {
    }

    public LichThi(String maSV, String maMonHoc, String maLopHoc, String maPhongHoc, String maGiangVien, String maChuyenNganh, int nam, String mua, String ngay, String thoiGian) {
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
        return "LichThi{" + "maSV=" + maSV + ", maMonHoc=" + maMonHoc + ", maLopHoc=" + maLopHoc + ", maPhongHoc=" + maPhongHoc + ", maGiangVien=" + maGiangVien + ", maChuyenNganh=" + maChuyenNganh + ", nam=" + nam + ", mua=" + mua + ", ngay=" + ngay + ", thoiGian=" + thoiGian + '}';
    }

    
    
}

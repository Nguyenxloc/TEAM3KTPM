/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.SinhVien;

import com.view.model.SinhVien.LichHocSinhVien;
import java.util.ArrayList;
import ultilities.DbConnection1;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class DAO_LichHocSinhVien {

    private DbConnection1 dbConnection1;

    public ArrayList<LichHocSinhVien> getAll() {
        ArrayList<LichHocSinhVien> lstLichHocSinhVien = new ArrayList<>();
        String sql = "select LICH.NGAYHOC, PHONGHOC.TENPHONGHOC, MONHOC.TENMONHOC, LOPHOC.TENLOPHOC, GIANGVIEN.HOTEN, LICH.THOIGIAN from LICH\n"
                + "JOIN PHONGHOC ON PHONGHOC.MAPHONGHOC = LICH.MAPHONGHOC\n"
                + "JOIN MONHOC ON MONHOC.MAMONHOC = LICH.MAMONHOC\n"
                + "JOIN LOPHOC ON LOPHOC.MALOPHOC = LICH.MALOPHOC\n"
                + "JOIN GIANGVIEN ON GIANGVIEN.MAGV = LICH.MAGIANGVIEN";
        try (Connection con = dbConnection1.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                LichHocSinhVien lh = new LichHocSinhVien();
                lh.setNgayHoc(rs.getDate("NGAYHOC"));
                lh.setTenPhongHoc(rs.getString("TENPHONGHOC"));
                lh.setTenMonHoc(rs.getString("TENMONHOC"));
                lh.setTenLopHoc(rs.getString("TENLOPHOC"));
                lh.setTengiangVien(rs.getString("HOTEN"));
                lh.setThoiGian(rs.getTime("THOIGIAN"));
                lstLichHocSinhVien.add(lh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstLichHocSinhVien;
    }

}

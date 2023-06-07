/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.GiangVien;
import ultilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class DAO_GiangVien {
    public List<GiangVien> getTaiKhoan() throws SQLException{  //Lấy danh sách tài khoản của giảng viên
        List<GiangVien> lstTKGiangVien = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "SELECT MAGV, MATKHAU, VAITRO FROM GIANGVIEN";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
           String ma = rs.getString("MAGV");
           String matKhau = rs.getString("MATKHAU");
           String vaiTro = rs.getString("VAITRO");
           
           GiangVien giangVien = new GiangVien();   
           giangVien.setMaGV(ma);
           giangVien.setMatKhau(matKhau);
           giangVien.setVaiTro(vaiTro);
           
           lstTKGiangVien.add(giangVien);
        }
        rs.close();
        ps.close();
        connection.close();
        return lstTKGiangVien;
    }
    
    public GiangVien xacThucTaiKhoanGiangVien(String username) throws Exception{ // Tìm theo tên tài khoản 
        List<GiangVien> lstTKGiangVien = getTaiKhoan();
        GiangVien maGVCanTim = null;
        for (GiangVien giangVien : lstTKGiangVien) {
            if(giangVien.getMaGV().equals(username)){
                maGVCanTim = giangVien;
                break;
            }
        }
        return maGVCanTim;
    }
}

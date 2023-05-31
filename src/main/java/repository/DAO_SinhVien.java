/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import ultilities.DBConnection;

/**
 *
 * @author 84374
 */
public class DAO_SinhVien{
  
  final String INSERT_SQL = "INSERT INTO [dbo].[SINHVIEN] VALUES(?,?,?,?,?,?,?,?,?)";
  final String UPDATE_SQL = "UPDATE [dbo].[SINHVIEN] SET [Name] = ? WHERE [Id] = ?";
  final String DELETE_SQL = "DELETE FROM [dbo].[SINHVIEN] WHERE [Id] = ?";
  final String SELECT_BY_SQL = "SELECT * FROM [dbo].[SINHVIEN] WHERE [MaSV] = ?";
  final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[SINHVIEN]";
  private SinhVien sinhVien;
  private ArrayList<SinhVien> _lstSV;
      public DAO_SinhVien() {
    _lstSV = new ArrayList<>();

  }
  public ArrayList<SinhVien> findAll() {
     _lstSV = new ArrayList<>();
    return getSelectSql(SELECT_ALL_SQL);
  }

  public SinhVien findById(String id) {
    SinhVien sv;
    sv = getSelectSql(SELECT_BY_SQL, id).get(0);
    return sv;
  }

  public SinhVien save(SinhVien sv) {   
    DBConnection.ExcuteDungna(INSERT_SQL, sv.getHoten(),sv.getNienKhoa(),sv.getHoten()
            ,sv.getGioitinh(),sv.getNgaySinh(),sv.getEmail(),sv.getSoDienThoai(),sv.getDiaChi(),sv.getTrangThai());
    return sv;
  }

  public String delete(String id) {
     DBConnection.ExcuteDungna(DELETE_SQL, id);
        return id;
  }

  public long totalCount() {
    long total = 0;
    total = _lstSV.size();
    return total;
  }

  private ArrayList<SinhVien> getSelectSql(String sql, Object... args) {
    try {
      ResultSet rs = DBConnection.getDataFromQuery(sql, args);
      while (rs.next()) {      
        System.out.println(rs.getLong(4));
        _lstSV.add(new SinhVien(rs.getString(1), rs.getInt(2), rs.getNString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
      }
      return _lstSV;
    } catch (SQLException ex) {
      throw new RuntimeException();
    }
  }
       
}

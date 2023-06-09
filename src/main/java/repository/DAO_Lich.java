/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Lich;
import ultilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class DAO_Lich {
    final String INSERT_SQL = "INSERT INTO [dbo].[LICH] VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[LICH] [MAMONHOC]=?,[MALOPHOC]=?,[MAPHONGHOC]=?,[MAGIANGVIEN]=?,[MACHUYENNGANH]=?,[NAM]=?,[MUA]=?,[NGAYHOC]=?,[THOIGIAN]=?,[LOAILICH]=? WHERE [MASV] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[LICH] WHERE [MASV] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[LICH] WHERE [MASV] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[LICH]";
    
    private Lich lich;
    private ArrayList<Lich> _lstLich;

    public DAO_Lich() {
        _lstLich = new ArrayList<>();
    }
    
    public ArrayList<Lich> findAll() {
        _lstLich = new ArrayList<>();
        return getSelectSql(SELECT_ALL_SQL);
    }

    public Lich findById(String id) {
        Lich lich;
        lich = getSelectSql(SELECT_BY_SQL).get(0);
        return lich;
    }
    
    public Lich save(Lich lich) {
        DBConnection.ExcuteDungna(INSERT_SQL, lich.getMaSV(), lich.getMaMonHoc(), lich.getMaLopHoc(), lich.getMaPhongHoc(), lich.getMaGiangVien(), lich.getMaChuyenNganh(), lich.getNam(), lich.getMua(), lich.getNgayHoc(), lich.getThoiGian(), lich.getLoaiLich());
        return lich;
    }

    public String delete(String id) {
        DBConnection.ExcuteDungna(DELETE_SQL, id);
        return id;
    }
    
    public Lich update(Lich lich) {
        DBConnection.ExcuteDungna(UPDATE_SQL, lich.getMaSV(), lich.getMaMonHoc(), lich.getMaLopHoc(), lich.getMaPhongHoc(), lich.getMaGiangVien(), lich.getMaChuyenNganh(), lich.getNam(), lich.getMua(), lich.getNgayHoc(), lich.getThoiGian(), lich.getLoaiLich());
        return lich;
    }

    private ArrayList<Lich> getSelectSql(String sql, Object... args) {
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                System.out.println(rs.getLong(4));
                _lstLich.add(new Lich(rs.getString("MASV"), rs.getString("MAMONHOC"), rs.getString("MALOPHOC"), rs.getString("MAPHONGHOC"), rs.getString("MAGIANGVIEN"), rs.getString("MACHUYENNGANH"), rs.getInt("NAM"), rs.getString("MUA"), rs.getDate("NGAYHOC"), rs.getString("THOIGIAN"), rs.getString("LOAILICH")));
            }
            return _lstLich;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
}

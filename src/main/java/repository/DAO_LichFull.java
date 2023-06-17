/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Lich;
import model.LichFull;
import ultilities.DBConnection;

/**
 *
 * @author 84374
 */
public class DAO_LichFull {

    final String INSERT_SQL = "INSERT INTO [dbo].[LICH] VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[LICH] [MAPHONGHOC]=?,[MAGIANGVIEN]=?,[MACHUYENNGANH]=?,[NAM]=?,[MUA]=?,[NGAYHOC]=?,[THOIGIAN]=?,[LOAILICH]=? WHERE [MASV] =?,[MAMONHOC]=?,[MALOPHOC]=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[LICH] WHERE [MASV] = ?";
    final String SELECT_BY_SQLSV = "SELECT * FROM [dbo].[LICH] WHERE [MASV] = ?";
    final String SELECT_BY_SQLGV = "SELECT * FROM [dbo].[LICH] WHERE [MAGV] = ?";
    final String SELECT_BY_SQLMH = "SELECT * FROM [dbo].[LICH] WHERE [MAMONHOC] = ?";
    final String SELECT_BY_SQLLH = "SELECT * FROM [dbo].[LICH] WHERE [MALOPHOC] = ?";
    final String SELECT_BY_SQLLHMH = "SELECT * FROM [dbo].[LICH] WHERE [MALOPHOC] = ? AND [MAMONHOC]=?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[LICH]";
    final String SELECT_SPLICH = "SELECT LICH.MASV,sv.HOTEN AS HOTENSV,LICH.MAMONHOC,mh.TENMONHOC,LICH.MALOPHOC,MAPHONGHOC,MAGIANGVIEN,gv.HOTEN AS HOTENGV,LICH.MACHUYENNGANH,LICH.NAM,LICH.MUA,NGAYHOC,THOIGIAN,LOAILICH FROM dbo.LICH \n"
            + "JOIN dbo.SINHVIEN sv\n"
            + "ON sv.MASV = LICH.MASV\n"
            + "JOIN dbo.GIANGVIEN gv\n"
            + "ON gv.MAGV = LICH.MAGIANGVIEN\n"
            + "JOIN  dbo.MONHOC mh\n"
            + "ON mh.MAMONHOC = LICH.MAMONHOC";

    public DAO_LichFull() {

    }

    public ArrayList<LichFull> findAll() {
        LichFull lich;
        ArrayList<LichFull> _lstLichFull;
        return getSelectSql(SELECT_SPLICH);
    }

    public LichFull findByIdSV(String id) {
        LichFull lich;
        lich = getSelectSql(SELECT_SPLICH, id).get(0);
        return lich;
    }

    public LichFull findByIdGV(String id) {
        LichFull lich;
        lich = getSelectSql(SELECT_SPLICH, id).get(0);
        return lich;
    }

    public LichFull findByIdMH(String id) {
        LichFull lich;
        lich = getSelectSql(SELECT_SPLICH, id).get(0);
        return lich;
    }

    public LichFull findByIdLH(String id) {
        LichFull lich;
        lich = getSelectSql(SELECT_SPLICH, id).get(0);
        return lich;
    }

    public LichFull findByIdMHLH(String idmh, String idlh) {
        LichFull lich;
        lich = getSelectSql(SELECT_SPLICH, idmh, idlh).get(0);
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

    public Lich update(Lich lh, String maSv, String maMonHoc, String maLopHoc) {

        DBConnection.ExcuteDungna(UPDATE_SQL, lh.getMaPhongHoc(), lh.getMaGiangVien(), lh.getMaChuyenNganh(), lh.getNam(), lh.getMua(), lh.getNgayHoc(), lh.getThoiGian(), lh.getLoaiLich(), lh.getMaSV(), lh.getMaMonHoc(), lh.getMaLopHoc());
        return lh;
    }

    private ArrayList<LichFull> getSelectSql(String sql, Object... args) {
        ArrayList<LichFull> _lstLichFull = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                _lstLichFull.add(new LichFull(rs.getString("MASV"), rs.getString("HOTENSV"), rs.getString("MAMONHOC"), rs.getString("TENMONHOC"), rs.getString("MALOPHOC"), rs.getString("MAPHONGHOC"), rs.getString("MAGIANGVIEN"), rs.getString("HOTENGV"), rs.getString("MACHUYENNGANH"), rs.getInt("NAM"), rs.getString("MUA"), rs.getDate("NGAYHOC"), rs.getString("THOIGIAN"), rs.getString("LOAILICH")));
            }
            return _lstLichFull;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.GiangVien;
import model.Lich;
import ultilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class DAO_GiangVien {

    final String INSERT_SQL = "INSERT INTO [dbo].[SINHVIEN] VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    
    final String DELETE_SQL = "DELETE FROM [dbo].[SINHVIEN] WHERE [MAGV] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[SINHVIEN] WHERE [MAGV] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[SINHVIEN]";
    private GiangVien giangVien;
    private ArrayList<GiangVien> _lstGiangVien;

    public DAO_GiangVien() {
        _lstGiangVien = new ArrayList<>();
    }
    
    public ArrayList<GiangVien> findAll() {
        _lstGiangVien = new ArrayList<>();
        return getSelectSql(SELECT_ALL_SQL);
    }

    public GiangVien findById(String id) {
        GiangVien giangVien;
        giangVien = getSelectSql(SELECT_BY_SQL, id).get(0);
        return giangVien;
    }

    public GiangVien save(GiangVien giangVien) {
        DBConnection.ExcuteDungna(INSERT_SQL, giangVien.matKhau, giangVien.getVaiTro(), giangVien.getAnh(), giangVien.getMaGV(), giangVien.getHoTen(), 
                giangVien.getGioiTinh(), giangVien.getNgaySinh(), giangVien.getEmail(), giangVien.getSoDienThoai(), giangVien.getDiaChi(), giangVien.getNgayVaoLam());
        return giangVien;
    }

    public String delete(String id) {
        DBConnection.ExcuteDungna(DELETE_SQL, id);
        return id;
    }

    public GiangVien update(GiangVien giangVien) {
        DBConnection.ExcuteDungna(UPDATE_SQL, giangVien.matKhau, giangVien.getVaiTro(), giangVien.getAnh(), giangVien.getMaGV(), giangVien.getHoTen(), 
                giangVien.getGioiTinh(), giangVien.getNgaySinh(), giangVien.getEmail(), giangVien.getSoDienThoai(), giangVien.getDiaChi(), giangVien.getNgayVaoLam());
        return giangVien;
    }

    public long totalCount() {
        long total = 0;
        total = _lstGiangVien.size();
        return total;
    }

    private ArrayList<GiangVien> getSelectSql(String sql, Object... args) {
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                System.out.println(rs.getLong(4));
//                _lstGiangVien.add(new GiangVien(rs.getString("MATKHAU"), rs.getString("VAITRO"), rs.getByte("ANH"), rs.getInt("5"), rs.getString("MAGV"), rs.getString("HOTEN"), rs.getInt("GIOITINH"), rs.getDate("NGAYSINH"), rs.getString("EMAIL"), rs.getString("SDT"), rs.getString("DIACHI"), rs.getDate(""));
            }
            return _lstGiangVien;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
        final String UPDATE_SQL = "UPDATE [dbo].[SINHVIEN] SET [MATKHAU]=?, [VAITRO]=?, [ANH]=?, [HOTEN]=?, [GIOITINH]=?, [NGAYSINH]=?, [EMAIL]=?, [SDT]=?, [DIACHI]=?, [NGAYVAOLAM]=?, WHERE [MAGV] = ?";


    public List<GiangVien> getTaiKhoan() throws SQLException {  //Lấy danh sách tài khoản của giảng viên
        List<GiangVien> lstTKGiangVien = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "SELECT MAGV, MATKHAU, VAITRO FROM GIANGVIEN";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
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

    public GiangVien xacThucTaiKhoanGiangVien(String username) throws Exception { // Tìm theo tên tài khoản 
        List<GiangVien> lstTKGiangVien = getTaiKhoan();
        GiangVien maGVCanTim = null;
        for (GiangVien giangVien : lstTKGiangVien) {
            if (giangVien.getMaGV().equals(username)) {
                maGVCanTim = giangVien;
                break;
            }
        }
        return maGVCanTim;
    }

    public List<GiangVien> getAllGV() throws Exception {
        List<GiangVien> lstGiangVien = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT ANH, MAGV, HOTEN, GIOITINH, NGAYSINH, EMAIL, SDT, DIACHI, NGAYVAOLAM FROM GiangVien";
        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.setString(1, ma);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Blob blob = rs.getBlob("ANH");
            byte[] anh = blob.getBytes(1, (int) blob.length());

            String maGV = rs.getString("MAGV");
            String hoTen = rs.getString("HOTEN");
            Integer gioiTinh = rs.getInt("GIOITINH");
            Date ngaySinh = rs.getDate("NGAYSINH");
            String email = rs.getString("EMAIL");
            String sdt = rs.getString("SDT");
            String diaChi = rs.getString("DIACHI");
            Date ngayVaoLam = rs.getDate("NGAYVAOLAM");

            GiangVien giangVien = new GiangVien();
            giangVien.setAnh(anh);
            giangVien.setMaGV(maGV);
            giangVien.setHoTen(hoTen);
            giangVien.setGioiTinh(gioiTinh);
            giangVien.setNgaySinh(ngaySinh);
            giangVien.setEmail(email);
            giangVien.setSoDienThoai(sdt);
            giangVien.setDiaChi(diaChi);
            giangVien.setNgayVaoLam(ngayVaoLam);

            lstGiangVien.add(giangVien);
        }
        rs.close();
        ps.close();
        connection.close();
        return lstGiangVien;
    }

    public List<GiangVien> getByMaGV(String ma) throws Exception {
        List<GiangVien> lstGiangVien = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT ANH, MAGV, HOTEN, GIOITINH, NGAYSINH, EMAIL, SDT, DIACHI, NGAYVAOLAM FROM GiangVien WHERE MaGV  = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ma);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Blob blob = rs.getBlob("ANH");
            byte[] anh = blob.getBytes(1, (int) blob.length());

            String maGV = rs.getString("MAGV");
            String hoTen = rs.getString("HOTEN");
            Integer gioiTinh = rs.getInt("GIOITINH");
            Date ngaySinh = rs.getDate("NGAYSINH");
            String email = rs.getString("EMAIL");
            String sdt = rs.getString("SDT");
            String diaChi = rs.getString("DIACHI");
            Date ngayVaoLam = rs.getDate("NGAYVAOLAM");

            GiangVien giangVien = new GiangVien();
            giangVien.setAnh(anh);
            giangVien.setMaGV(maGV);
            giangVien.setHoTen(hoTen);
            giangVien.setGioiTinh(gioiTinh);
            giangVien.setNgaySinh(ngaySinh);
            giangVien.setEmail(email);
            giangVien.setSoDienThoai(sdt);
            giangVien.setDiaChi(diaChi);
            giangVien.setNgayVaoLam(ngayVaoLam);

            lstGiangVien.add(giangVien);
        }
        rs.close();
        ps.close();
        connection.close();
        return lstGiangVien;
    }

    public List<Lich> getAllLichHoc() throws Exception {
        List<Lich> lstLichHoc = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String sql = "";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

        }
        return lstLichHoc;
    }
}

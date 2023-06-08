/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.MonHoc;
import ultilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class DAO_MonHoc {

    final String INSERT_SQL = "INSERT INTO [dbo].[CHUYENNGANH] VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[CHUYENNGANH] SET[TENCHUYENNGANH]=?,[COSO]=?,[THOIGIANDAOTAO]=? WHERE [MACHUYENNGANH] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[CHUYENNGANH] WHERE [MACHUYENNGANH] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[CHUYENNGANH] WHERE [MaSV] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[CHUYENNGANH]";
    private MonHoc monHoc;
    private ArrayList<MonHoc> lstMH;

    public DAO_MonHoc() {
        lstMH = new ArrayList<>();
    }

    public ArrayList<MonHoc> findAll() {
        return getSelectSql(SELECT_ALL_SQL);
    }

    public MonHoc update(MonHoc mh) {
        DBConnection.ExcuteDungna(UPDATE_SQL, null, null, null);
        return mh;
    }

    public MonHoc save(MonHoc mh) {
        DBConnection.ExcuteDungna(INSERT_SQL, null, null);
        return mh;
    }

    public MonHoc findById(String id) {
        MonHoc mh;
        mh = getSelectSql(SELECT_BY_SQL, id).get(0);
        return mh;
    }

    public String delete(String id) {
        DBConnection.ExcuteDungna(DELETE_SQL, id);
        return id;
    }

    private ArrayList<MonHoc> getSelectSql(String sql, Object... args) {
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                System.out.println(rs.getLong(4));
                lstMH.add(new MonHoc(rs.getString("MAMONHOC"), rs.getString("MACHUYENNGANH"), rs.getString("MALOPHOC"), rs.getString("TENMONHOC"), rs.getInt("SOTINCHI"), rs.getInt("NAM"), rs.getString("MUA")));
            }
            return lstMH;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}

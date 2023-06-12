/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.view.model.SinhVien.LichHocSinhVien;
import java.util.ArrayList;
import repository.SinhVien.DAO_LichHocSinhVien;

/**
 *
 * @author ADMIN
 */
public class QLLichHocSinhVienServiceIMPL implements QLLichHocSinhVienService{
    
    private DAO_LichHocSinhVien dAO_LichHocSinhVien = new DAO_LichHocSinhVien();

    @Override
    public ArrayList<LichHocSinhVien> getAll() {
        return dAO_LichHocSinhVien.getAll();
    }
    
    
}

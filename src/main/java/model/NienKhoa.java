/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class NienKhoa {
    
    public int nam;

    public NienKhoa() {
    }

    public NienKhoa(int nam) {
        this.nam = nam;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "NienKhoa{" + "nam=" + nam + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Mua {
    
    public String mua;

    public Mua() {
    }

    public Mua(String mua) {
        this.mua = mua;
    }

    public String getMua() {
        return mua;
    }

    public void setMua(String mua) {
        this.mua = mua;
    }

    @Override
    public String toString() {
        return "Mua{" + "mua=" + mua + '}';
    }
    
}

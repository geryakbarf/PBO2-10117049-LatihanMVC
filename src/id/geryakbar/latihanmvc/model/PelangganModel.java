/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.geryakbar.latihanmvc.model;

import id.geryakbar.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gerya
 * Nama : Gery Akbar Fauzi
 * Kelas : IF-2
 * Nim : 10117049
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String nomorTelp;
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
    

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fileOnChange();
    }

    public void setEmail(String email) {
        this.email = email;
        fileOnChange();
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
        fileOnChange();
    }
    
    protected void fileOnChange(){
        if(listener!=null){
            listener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNomorTelp("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        resetForm();
        
    }
    
}

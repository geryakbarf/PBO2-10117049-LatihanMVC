/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.geryakbar.latihanmvc.controller;

import id.geryakbar.latihanmvc.model.PelangganModel;
import id.geryakbar.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author gerya
 * Nama : Gery Akbar Fauzi
 * Kelas : IF-2
 * Nim : 10117049
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        String nama = view.getEt_Nama().getText();
        String email = view.getEt_Email().getText();
        String nomorTelp = view.getEt_Nomor_Telepon().getText();
        
        if(nama.equals("") && email.equals("") && nomorTelp.equals("")){
            
        }else{
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getEt_Nama().getText();
        String email = view.getEt_Email().getText();
        String nomorTelp = view.getEt_Nomor_Telepon().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if(nomorTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nomor Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
        
    }
}

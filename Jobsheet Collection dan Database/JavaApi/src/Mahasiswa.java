/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri Chasanah
 */
import java.util.*;
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa(String nim , String nama, String Alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    
    
}

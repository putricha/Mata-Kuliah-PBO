/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri Chasanah
 */
import java.util.*;
public class InputData {
    ArrayList<Mahasiswa> ListMahasiswa;
   public InputData(){
       ListMahasiswa = new ArrayList<>();
       
   }
   
   public void isiData (String nim, String nama, String alamat){
       Mahasiswa mhs = new Mahasiswa(nim, nama,alamat);
       ListMahasiswa.add(mhs);
       
   }
   
   public ArrayList<Mahasiswa> getData(){
       return ListMahasiswa;
   }
       
}

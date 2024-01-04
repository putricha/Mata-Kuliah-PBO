/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri Chasanah
 */

import java.util.*;
public class CobaHashSet {
    public static void main(String[] args) {
        
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
            
        }
    Kota k1 = new Kota("1","Donomulyo");
    Kota k2 = new Kota("1","Donomulyo");
    Set city = new HashSet();
    city.add(k1.nama);
    city.add(k2.nama);
    System.out.println(city);

    }

       
    
    
}

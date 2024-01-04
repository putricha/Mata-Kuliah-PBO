/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri Chasanah
 */

import java.util.*;
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        
        System.out.println(mListCountry);   
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
        
        List lCity = new ArrayList();
        Kota k1 = new Kota ("1","Batu");
        Kota k2 = new Kota ("1","Batu");
        lCity.add(k1.nama);
        lCity.add(k2.nama);
        Iterator mIterator = lCity.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s",element);
            System.out.println("");
        }
    }
}

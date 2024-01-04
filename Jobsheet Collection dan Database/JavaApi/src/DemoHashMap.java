
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri Chasanah
 */
import java.util.*;
public class DemoHashMap {
    public static void main(String[] args) {
         HashMap hMapItem = new HashMap();
         hMapItem.put("1","Biskuit");
         hMapItem.put("2","Shampoo");
         hMapItem.put("3","Soap");
         System.out.println(hMapItem);
         System.out.format("HashMap Item Total : %d,\n\n",hMapItem.size());
         
         Object mObject = hMapItem.remove("1");
         System.out.format("%s remove from Hashmap\n",mObject);
         System.out.format("HashMap Item Total : %d,\n\n",hMapItem.size());
         
         hMapItem.clear();
         System.out.format("HashMap Item Total : %d,\n\n",hMapItem.size());
         
    
    }
}

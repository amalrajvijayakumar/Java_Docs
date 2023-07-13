package com.learning;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

  static int a = 10; 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//     MapDemo md = new MapDemo(); 
//     md.add(a);
   TreeMap hm = new TreeMap();
    
    hm.put("Idli", 20);
    hm.put("Dosai", 30);
    hm.put("Poori", 30);
    hm.put("Pongal", 40);
    hm.put("Dosai", 45);
    System.out.println(hm.containsKey("Poori"));
    System.out.println(hm.get("Poori"));
    System.out.println(hm); 
    System.out.println(hm.keySet());
    System.out.println(hm.values()); 
    System.out.println(hm.entrySet()); 
    Set s = hm.entrySet(); 
    for(Object ob: s)
    {
  Entry entry = (Entry) ob; 
  
  String item = (String)entry.getKey(); 
  if(item.equals("Dosai"))
  {
    entry.setValue(50);
      System.out.println(entry.getValue());
  }
    }
    

  }
  public void add(int a)
  {
    HashMap hm = new HashMap(); 
    hm.put("Idli", a);
    
  }

}

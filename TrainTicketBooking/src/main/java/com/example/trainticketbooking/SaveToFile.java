package com.example.trainticketbooking;

import java.io.*;
import java.util.ArrayList;

public class SaveToFile {
    private ArrayList obj;

    public SaveToFile(){
        this.obj=null;
    }
    public SaveToFile(ArrayList obj){
        this.obj=obj;
    }

    public ArrayList getObj() {
        return obj;
    }

    public void savetoFile(ArrayList obj){
        try{
            File file=new File("ticketBooking.txt");
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }




}

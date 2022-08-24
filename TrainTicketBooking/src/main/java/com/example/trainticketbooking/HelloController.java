package com.example.trainticketbooking;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   @FXML
    private CheckBox businessClass;
   @FXML
    private CheckBox economiClass;
   @FXML
    private Label ticketClass;
   @FXML
    private ChoiceBox addressChoice;
   @FXML
    private ChoiceBox timePicker;
   @FXML
    private DatePicker datePicker;
   @FXML
    private Button bookNow;
   @FXML
    private Label messageShow;

   private String [] address={"Dhaka-Khula","Khula-Dhaka","Rangpur-Dhaka","Dhaka-Rangpur","Nuwakhali-Dhaka","Dhaka-Nuwakhali","Cumilla-Dhaka","Dhaka-Cumilla"};
   public String [] times={"08:15 AM-01:15 PM","08:30 AM-01:30PM","08:45 AM-01:45 PM","02:30 PM-11:30 PM","03:00 PM-12:00 AM"};

   ArrayList<String> objects=new ArrayList<String>();

   @FXML
    public void bookNow(){

       if(businessClass.isSelected()){
           BusinessClass businessClass=new BusinessClass(String.valueOf(addressChoice.getValue()),String.valueOf(timePicker.getValue()),String.valueOf(datePicker.getValue()));
           objects.add(String.valueOf(businessClass));
           SaveToFile stf=new SaveToFile(objects);
           stf.savetoFile(objects);
           messageShow.setText("Business Class Ticket Booked");

       } else if (economiClass.isSelected()) {
           EconomicClass economicClass=new EconomicClass(String.valueOf(addressChoice.getValue()),String.valueOf(timePicker.getValue()),String.valueOf(datePicker.getValue()));
           objects.add(String.valueOf(economicClass));
           SaveToFile stf=new SaveToFile(objects);
           stf.savetoFile(objects);
           messageShow.setText("Economic Class Ticket Booked");
       }else {
           messageShow.setText("Plese Book Again");
       }

       File file=new File("ticketBooking.txt");
       try{
           FileReader fileReader=new FileReader(file);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
           while (bufferedReader.readLine()!=null){
               System.out.println(objects);
           }
       }catch (Exception e){
           System.out.println(e);
       }


   }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addressChoice.getItems().addAll(address);
        timePicker.getItems().addAll(times);
    }
}
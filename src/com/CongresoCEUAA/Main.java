package com.CongresoCEUAA;

import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        //Excell
        /*System.out.println("Inicio");

        FileOutputStream file = new FileOutputStream("NewExcel.xlsx");

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("TheSheet");

        HSSFRow row = sheet.createRow(2);
        HSSFCell cell = row.createCell(2);
        cell.setCellValue("A value");



        workbook.write(file);
        file.close();*/


        //Save
       /* Student su = new Student();
        su.name = "Luis Gómez";
        su.group = "IE 6";

        try
        {
            FileOutputStream fileOut = new FileOutputStream("/Users/LuisGomez/Desktop/stLuis.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(su);
            out.close();


        }
        catch (IOException i)
        {
            i.printStackTrace();
        }*/


       //Load
       /*Student si = null;
       try
       {
           FileInputStream fileIn = new FileInputStream("/Users/LuisGomez/Desktop/stLuis.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           si = (Student) in.readObject();
           in.close();
       }
       catch (IOException i)
       {
           System.out.println("Student file not found");
           i.printStackTrace();
           return;
       } catch (ClassNotFoundException c)
       {
           System.out.println("Student not found");
           c.printStackTrace();
           return;
       }

        System.out.println("Name: " + si.name);
        System.out.println("Group: " + si.group);*/

       EventSession session = new EventSession();

       Student st1 = new Student("Luis", "IE 8");

       Student st2 = new Student("Pp", "ISC 8");

       //Cambio

       session.AddStudent(149531, st1);
       session.AddStudent(149532, st2);

       try
       {
           FileOutputStream fileOut = new FileOutputStream("/Users/LuisGomez/Desktop/Session1.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(session);
           out.close();


       }
       catch (IOException i)
       {
           i.printStackTrace();
       }

   }
}

package com.CongresoCEUAA;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class EventSession implements java.io.Serializable
{

   Map<Integer, Student> students = new HashMap<Integer, Student>();

   public void AddStudent(Integer id, Student student)
   {
      students.put(id, student);
   }

   public void FillRegister(Map<Integer, Student> students)
   {
       this.students = students;
   }
}

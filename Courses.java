
package com.codemulo.classcourses;

import java.util.Scanner;
public class Courses{
    public static void main(String[] args) {
        String SCoourse[]={"Software Engineering","BSE", "900,000"};
        String ICoourse[]={"Information Technology","BIT", "750,000"};
        String CCoourse[]={"Computer Science","BCS", "800,000"};
        String ECoourse[]={"Computer Engineering","BCE", "950,000"};
        Scanner code=new Scanner(System.in);
        System.out.println("Please enter the Course ID");
        String CourseID= code.next();
         if(CourseID.equals("BSE")){
             System.out.println(
                     "Course Name:" +SCoourse[0]+ ","
                     +" Course ID:"+SCoourse[1]+ ","
                     +" Tution:" +SCoourse[2]
             );
         }else if(CourseID.equals("BIT")){
             System.out.println(
                     "Course Name:" +ICoourse[0]+ ","
                             +" Course ID:"+ICoourse[1]+ ","
                             +" Tution:" +ICoourse[2]
             );
         } else if(CourseID.equals("BCS")){
             System.out.println(
                     "Course Name:" +CCoourse[0]+ ","
                             +" Course ID:"+CCoourse[1]+ ","
                             +" Tution:" +CCoourse[2]
             );
         }
         else if(CourseID.equals("BCE")){
             System.out.println(
                     "Course Name:" +ECoourse[0]+ ","
                             +" Course ID:"+ECoourse[1]+ ","
                             +" Tution:" +ECoourse[2]
             );
         }else{
          System.out.println("Wrong CourseID Detail");
         }
    }


}
package ProgrammingIQ;

import java.util.*;
import java.util.LinkedList;

public class StringTest {

public static void main(String[] args) {
   
          Map<String,List<String>> quote_Level_Tasks = new HashMap<>();
        String s = "Complete Quote for Rating,Edit Quote Information:AUTOEDGE_PKG\nComplete Quote for Rating,Edit Quote Information:GRGELIAB_PKG,Complete Quote for Rating,Edit Quote Information:UMB_PKG";
        String[] lobList ="AUTO EDGE:AUTOEDGE_PKG,Garage Liablity:GRGELIAB_PKG,Commercial Property:PROP_PKG,Commercial Inland Marine:CIM_PKG,Crime:CRIME_PKG,Professional Liability:PL_PKG,CGL:CGL_PKG,Commercial Umbrella Liability Policy:UMB_PKG".split(",");
         List<String> tasksNameList=new LinkedList<String>(Arrays.asList(s.split("\n")));
         for(int i=0;i<lobList.length;i++){
             String lob=lobList[i].substring(lobList[i].indexOf(":")+1, lobList[i].length());
             List<String> tasks = new ArrayList<>();
             for (Iterator iterator = tasksNameList.iterator(); iterator.hasNext();) {
                 String taskNames = (String) iterator.next();
                 String taskLob = taskNames.substring(taskNames.indexOf(":")+1, taskNames.length());
                 if(lob.equalsIgnoreCase(taskLob)){
                     tasks=Arrays.asList(taskNames.substring(0, taskNames.indexOf(":")).split(","));
                     iterator.remove();
                     //break;
                 }

             }
             if(null!=tasks && !tasks.isEmpty()){
                     quote_Level_Tasks.put(lob, tasks);
                 }
             }
             System.out.println(quote_Level_Tasks);
         }

         
     
}
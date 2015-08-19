
/**
 * Write a description of class TodoList here.
 * 
 * @author (Yaswanth) 
 * @version (09-08-2015)
 */
public class TodoList
{
 private String taskName;
 private String description;
 private String dueDate;
 private String remainder;
 private String importence;
 TodoList(String name,String descrip,String date,String rem)
 {
    taskName=name;
    description=descrip;
    dueDate=date;
    remainder=rem;
  
    }
 public void getImportence(String importence)
 {
  if(importence=="importent and urgent")
     {
         System.out.println("Red");
     }
     else if(importence=="importent and noturgent")
     {
        System.out.println("Pink");
     }
     else if(importence=="Notimportent and urgent")
     {
         System.out.println("Blue");
     }
     else
     {
         System.out.println("Green");
        }  
    }
 public static void main(String args[])
 {
     TodoList tdl1=new TodoList("JavaProgram","Todolist Program","08-08-2015","09-08-2015");
     tdl1.importence="importent and urgent";
     tdl1.getImportence(tdl1.importence);
     
 }
}

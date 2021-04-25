package alistirma2;

public class Kurs {
	
	int id;
	String name;
	String teacher;
	String details;

 public Kurs(int id,String name,String teacher,String details) {
	 this.id=id;
	 this.name=name;
	 this.teacher=teacher;
	 this.details=details;
 } 
 
 public Kurs(String name) {
	 this.name="";
 } 

}
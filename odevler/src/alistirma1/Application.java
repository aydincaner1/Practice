package alistirma1;

import odev6document.PDFDocument;


public class Application {

	public static void main(String[] args) {
		
			Courses courses1=new Courses
					("\\image\\coursesImage1.jpg", "Java Kamp�", "Engin Demiro�", 0);
			
			Courses courses2=new Courses
					("\\image\\coursesImage1.jpg", "C# Kamp�", "Engin Demiro�", 0);
			
			Courses courses3=new Courses
					("\\image\\coursesImage1.jpg", "Flutter Kamp�", "Engin Demiro�", 0);
			
			Courses courses4=new Courses
					("Unity Kamp�", "Engin Demiro�", 0);
			
			
			Courses courses5=new Courses
					("C++ Kamp�", "Engin Demiro�", 0);

			Courses[] coursesArray= {courses1,courses2,courses3,courses4,courses5};
			
			for (Courses courses : coursesArray) {
				System.out.print("A��lan kurs ad�:" +courses.name);
			}
			System.out.print("\n");
			
			
			
			CourseManager courseManager=new CourseManager();
			courseManager.AddCourse(courses1);
			courseManager.AddCourse(courses2);
			courseManager.AddCourse(courses3);
			courseManager.AddCourse(courses4);
			courseManager.AddCourse(courses5);
			
			courseManager.GetCourseInfo(courses5);
			courseManager.GetCourseInfo(courses3);
		}
	
	}
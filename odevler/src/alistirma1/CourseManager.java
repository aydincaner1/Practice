package alistirma1;

public class CourseManager {

	public void AddCourse(Courses course) {
		System.out.println
		(course.name+ " Kursu eklendi.");
	}
	
	public void GetCourseInfo(Courses course) {
		System.out.println(
				"\nKursun Adi:"+course.name+"\n"+
				"Kursun Hocasi:"+course.teacher+"\n"+
				"Kursun Resmi:"+course.imagePath+"\n"+
				"Kursun Bitis Yüzdesi:"+course.finishAmount);
	}

}

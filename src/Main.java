import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup sgrp=new StudentGroup(10);

	Date date=new Date(1997,6,29);
	Student st=new Student(519,"sashank",date,69.8);

                sgrp.addFirst(st);

              System.out.println(sgrp.getStudent(0).getId());






	}

}

package jo.secondstep.session2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String std_name;
	String std_class;
	int subjects_num;
	ArrayList<Subject> subjects;
	Scanner reder;
	double avg;
	int marks_sum;

	public Student() {
		this.reder = new Scanner(System.in);
		this.marks_sum = 0;
		this.subjects_num = 0;
		this.subjects = new ArrayList<Subject>();
	}

	public void setStd_class() {
		System.out.print("Please enter the student class name: ");
		String std_class = reder.next();
		this.std_class = std_class;
	}

	public void setStd_name() {
		System.out.print("Please enter the student name: ");
		String student_name = reder.nextLine();
		this.std_name = student_name;
	}

	public void setSubjects_num() {
		System.out.print("Please enter subject(s) number: ");
		int subjects_num = reder.nextInt();
		if (subjects_num < 0)
			subjects_num = 0;
		this.subjects_num = subjects_num;

	}

	public void setSubjects_names() {
		if (this.subjects_num > 0) {
			for (int i = 0; i < this.subjects_num; i++) {
				this.subjects.add(new Subject());
				System.out.print("Please enter the Subject number(" + (i + 1) + ") name: ");
				String subject_name = reder.next();
				this.subjects.get(i).setName(subject_name);
			}
		} else {
			System.out.println("the student did not take any subject.");
		}
	}

	public void setSubjects_marks() {
		if (this.subjects_num > 0) {
			for (int i = 0; i < this.subjects_num; i++) {
				System.out.print("Please enter the student mark in " + this.subjects.get(i).getName() + ": ");
				double subject_mark = reder.nextDouble();
				if (subject_mark >= 0 && subject_mark <= 100 && subject_mark == (int) subject_mark) {
					this.subjects.get(i).setMark(subject_mark);
					marks_sum += subject_mark;
				} else {
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
					System.out.println("///it is invalid mark, it is should be between 0 to 100 and integer number please try again.///");
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
					i--;
				}
			}
		} else {
			System.out.println("the student did not have any marks.");
		}
	}

	public double calculatAvg() {
		if (this.subjects_num > 0) {
			return marks_sum / subjects_num;
		}
		return 0;
	}

	public void printStuedentInfo() {
		System.out.println("\n\nthe student name is: " + this.std_name + " and in class: " + this.std_class);
		if (this.subjects_num > 0) {
			System.out.println("the number of subject(s) is: " + this.subjects_num);
			for (int i = 0; i < this.subjects_num; i++) {
				System.out.println("the student mark in \"" + this.subjects.get(i).getName() + "\" is: "+ this.subjects.get(i).getMark());
			}
			System.out.println("the student mark average is " + calculatAvg());
		} else {
			System.out.println("the student did not take any subject for that we can not make any Average calculation.");
		}
	}
	
}

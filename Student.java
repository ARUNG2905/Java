class Student{
	int sid;
	String sname;
	Student(int x,String nm){
	this.sid= x;
	this.sname= nm;
}
		public static void main(String[] args){
		Student s1 = new Student(10,"Arun");
		Student s2 = new Student(11,"Pavan");
		Student s3 = new Student(12,"Kumar");
		Student s4 = new Student(15,"Darshan");
			System.out.println(s1.sid+"   "+s1.sname);
			System.out.println(s2.sid+"   "+s2.sname);
			System.out.println(s3.sid+"   "+s3.sname);
			System.out.println(s4.sid+"   "+s4.sname);
}
}
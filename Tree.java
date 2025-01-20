class Tree {
int height;
String type;
int age;
	public static void main(String[] args){
	Tree t1 = new Tree();
	t1.height=25;
	t1.type="coconut";
	t1.age=10; 
	Tree t2 = new Tree();
	t2.height=60;
	t2.type="peepal";
	t2.age=50;
		System.out.println(t1.type+" "+t1.height+" "+t1.age);	
		System.out.println(t2.type+" "+t2.height+" "+t2.age);
} 
}
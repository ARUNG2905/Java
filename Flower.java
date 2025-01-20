class Flower {
	 String type = "Gerbara";
	 String color;
	 
	 public static void main(String[] args){
	 Flower f1 = new Flower();
	 f1.color="orange";
	 Flower f2 = new Flower();
	 f2.color="pink";
	 Flower f3 = new Flower();
	 f3.color="white";
	 System.out.println("Flower is" + f1.color);
	 System.out.println("Flower is" + f2.color);
	 System.out.println("Flower is" + f3.color);
}
}
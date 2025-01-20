class Cartoon {
	 String type = "animation";
	 String character;
	 
	 public static void main(String[] args){
	 Cartoon f1 = new Cartoon();
	 
	 Cartoon f2 = new Cartoon();
	 
	 Cartoon f3 = new Cartoon();
	 f1.character="Bheem";
	 f1.type="animation";
	 f2.character="Doremon";
	 f3.character="Nobita";
	 System.out.println("character is " + f1.character +" "+ f1.type);
	 System.out.println("character is " + f2.character);
	 System.out.println("character is " + f3.character);
}
}
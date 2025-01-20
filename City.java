class City{
 int p;
 String cname;
	City(int x,String v){
	this.p=x;
	this.cname=v;
}
		public static void main(String[] args){
		City c1 = new City(3000,"Nelamangala");
		City c2 = new City(7000,"Bangalore");
		System.out.println(c1.p+"  "+c1.cname);
		System.out.println(c2.p+"  "+c2.cname);
}
} 


class SuperMarket {
	static String vegetables[]={"Potato","Carrot","Beans","Brinjal","Onion","Tomato","Corn","Radish","Cucumber","Okra"};
	static String perfumes[]={"one8","Jaguar","Perk Avenue","Puma","Adidas"," Denver","Creed Aventus","Dior Sauvage","Dior Sauvage","Armani"};
	static String biscuits[]={"Parle","Brittania","Good Day","Anmol","Unibic","Orian","Sunfeast","NutriChoice","Cremica","Cadbury"};
	static String groceries[]={"Salt","Pepper","Cooking Oil","Veginar","Honey","Chilly Powder","Ginger","Sugar","Garlic","Rice"};
	static String alcohols[] = {"Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Beer", "Wine", "Scotch", "Brandy", "Sake",
                            "Bourbon", "Absinthe", "Cognac", "Rye", "Rum and Coke", "Mojito", "Margarita", "Martini",
                            "Sangria", "Mimosa", "Piña Colada", "Old Fashioned", "Negroni", "Manhattan", "Caipirinha",
                            "Moscow Mule", "Cosmopolitan", "Mai Tai", "Irish Coffee", "Gimlet"};


	public static void main(String market[]){
			System.out.println("Main started\n");
		    System.out.println("List of vegetables");
			System.out.println(vegetable[0]+ "\n"+vegetable[1]+ "\n"+vegetable[2]+ "\n"+vegetable[3]+ "\n"+vegetable[4]+ "\n"+vegetable[5]+ "\n"+vegetable[6]+ "\n"+vegetable[7]+ "\n"+vegetable[8]+ "\n"+vegetable[9]+"\n");
			System.out.println("List of perfumes");
			System.out.println(perfume[0]+"\n"+ perfume[1]+"\n"+ perfume[2]+"\n"+ perfume[3]+"\n"+perfume[4]+"\n"+ perfume[5]+"\n"+ perfume[6]+"\n"+ perfume[7]+"\n"+ perfume[8]+"\n"+ perfume[9]+"\n");
			System.out.println("List of biscuits");
			System.out.println(biscuits[0]+"\n"+ biscuits[1]+"\n"+ biscuits[2]+"\n"+ biscuits[3]+"\n"+ biscuits[4]+"\n"+ biscuits[5]+"\n"+ biscuits[6]+"\n"+ biscuits[7]+"\n"+ biscuits[8]+"\n"+ biscuits[9]+"\n");
			System.out.println("List of groceries");
			System.out.println(groceries[0]+ "\n" + groceries[1]+ "\n" + groceries[2]+ "\n" + groceries[3]+ "\n" + groceries[4]+ "\n" + groceries[5]+ "\n" + groceries[6]+ "\n" + groceries[7]+ "\n" + groceries[8]+ "\n" + groceries[9]);
			System.out.println(alcohol[0] +"\n"+ alcohol[1] +"\n"+ alcohol[2] +"\n"+ alcohol[3] +"\n"+ alcohol[4] +"\n"+ alcohol[5] +"\n"+ alcohol[6] +"\n"+ alcohol[7] +"\n"+ alcohol[8] +"\n"+ alcohol[9] +"\n"+ alcohol[10] +"\n"+ alcohol[11] +"\n"+ alcohol[12] +"\n"+ alcohol[13] +"\n"+ alcohol[14] +"\n"+ alcohol[15] +"\n"+ alcohol[16] +"\n"+ alcohol[17] +"\n"+ alcohol[18] +"\n"+ alcohol[19] +"\n"+ alcohol[20] +"\n"+ alcohol[21] +"\n"+ alcohol[22] +"\n"+ alcohol[23] +"\n"+ alcohol[24] +"\n"+ alcohol[25] +"\n"+ alcohol[26] +"\n"+ alcohol[27] +"\n"+ alcohol[28] +"\n"+ alcohol[29] );
			
	}



	public static void vegetables(){
		System.out.println("the vegetables are");
		for(String vegetable:vegetables){
			System.out.println(vegetable);
		}
	}
	public static void perfumes(){
		System.out.println("the perfumes are");
		for(String perfume:perfumes){
			System.out.println(perfume);
		}
	}
	public static void biscuits(){
		System.out.println("the biscuits are");
		for(String biscuit:biscuits){
			System.out.println(biscuit);
		}
	}
		public static void groceries(){
			System.out.printlv("the groceries are");
			for(String grocery:groceries){
			System.out.println(grocery);
		}
	}
public static void alcohols(){
	System.out.println("the alcohols are");
		for(String alcohol:alcohols){
		System.out.println(alcohol);
		}
	}
}























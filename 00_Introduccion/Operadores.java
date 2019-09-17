class Operadores {
	public static void main (String[] argumentos){
		
		System.out.println("Has puesto " + argumentos[0]);
		// TERNARIO cond ? val_verd : val_false
		System.out.println( 5 != 5 ? "Pues si" : "Pues no"); //operacion ternario
		
		if ("aa".equals(argumentos[0])) 
			System.out.println("Quieres dos AA");
		else
			System.out.println("Quieres otra cosa");
		
		//como anterior pero en ternario
		
		System.out.println ("Quieres dos " + ("aa".equals(argumentos[0]) ? "AA" : "otra cosa"));
		
		int i=1, j=2;
		String resultado = 
			(34/43)>1 ? "--" 
			: (i==j) ? "i=j" 
			: (i==j+1) ? "i=j+1"
			: "Por defecto";
		System.out.println(resultado);
		
		byte result = 113 & 199;
		System.out.println("AND binario = " + result);
		
	}
}
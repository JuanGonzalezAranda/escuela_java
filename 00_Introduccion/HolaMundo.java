class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola mundo!");
		String nombre = "German";
		System.out.println("Hola " + nombre + "!");
		byte unByte = -128; // -127 a 128. 1 byte
		System.out.println("Byte: " + unByte);
		// comentario hasta final de linea
		/* comentario varias
		lineas */
		int numero = 1234567890; // -2000000000 a 2000000000 . 4 bytes
		System.out.println("Entero: " + numero);
		float decimalFloat = 32345678901f;//8 bytes
		System.out.println("Float: " + decimalFloat);
		double decimalDoble = 1.234567890123456789; // 8 bytes
		System.out.println("Double: " + decimalDoble);
		
		long entLargo = 1234567890123456789L;//trillones
		System.out.println("entLargo: " + entLargo);
		
		char caracter= 110; //'z';
		System.out.println("caracter: " + caracter);
		{ //bloque instruccion
			char[] texto = {'a','b','c'};
			
			for (int i=0;i<texto.length;i=i+1)
				System.out.println("caracter: "+ texto[i]);
		}
		
	}
}
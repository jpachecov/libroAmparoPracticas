public class PruebaTriangulo {
	public static void main(String [] args){
				Triangulo t1 =new Triangulo();
		Triangulo t2 = new Triangulo(new Punto(2,3), new Punto(10,3), new Punto(4,15));
		Triangulo t3 = new Triangulo(new Punto(5,20), new Punto(13,20), new Punto(7,32));
		Triangulo t4 = new Triangulo(new Punto(13,20), new Punto(5,20), new Punto(7,32));
		System.out.println("***PROGRAMA PARA PROBAR LA CLASE TRIANGULO***");


		System.out.println("\n Triangulo 1 : " + t1);
		System.out.println("\n Triangulo 2 : " + t2);
		System.out.println("\n Triangulo 3 : " + t3);
		System.out.println("\n Triangulo 4 : " + t4);

		System.out.println("\n***PERIMETRO DE LOS TRIANGULOS 1 Y 2***");
		System.out.println("El perimetro del triangulo 1 es: " + t1.perimetro());
		System.out.println("El perimetro del triangulo 2 es: " + t2.perimetro());

		System.out.println("\n***AREA DE LOS TRIANGULOS 1 Y 2***");
		System.out.println("El area del triangulo 1 es: " + t1.area());
		System.out.println("El area del triangulo 2 es: " + t2.area());

		System.out.println("\n***TIPO DE LOS TRIANGULOS 1 Y 2***");
		System.out.println("El tipo del triangulo 1 es: " + t1.tipo());
		System.out.println("El tipo del triangulo 2 es: " + t2.tipo());

		System.out.println("\n***VERIFICAR SI LOS TRIANGULOS 2 Y 3 SON IGUALES***");
		if(t2.equals(t1))
			System.out.println("Los triangulos 2 y 1 son iguales!!!");
		else
			System.out.println("Los triangulos 2 y 1 no son iguales!!!");
		if(t3.equals(t4))
			System.out.println("Los triangulos 3 y 4 son iguales!!!");
		else
			System.out.println("Los triangulos 3 y 4 no son iguales!!!");
	} //Fin main()
}//Fin PruebaTriangulo



Algoritmo sumaRepetitiva
	// Definimos variables
	Definir num1,gNum1,i Como Entero
	// Igualamos la vriable de guardar a 0
	gNum1 <- 0
	// bucle for para repetir 10 veces (desde 0 incluido hasta 9 incluido)
	Para i<-0 Hasta 9 Hacer
		// Pide un n�mero cada vez que entra en el bucle
		Escribir 'Dime un n�mero'
		Leer num1
		// Va sumando los n�meros escritos uno a uno
		gNum1 <- gNum1+num1
	FinPara
	// Escribe el resultado de la suma de los 10 n�meros
	Escribir 'El resultado de la suma de los 10 n�meros es: '+ConvertirATexto(gNum1)
FinAlgoritmo

Algoritmo elMenor
	// Definimos variables
	Definir num1,num2 Como Real
	// Pedimos un número
	Escribir 'Escribe un número'
	Leer num1
	// Pedimos otro número
	Escribir 'Escribe otro número'
	Leer num2
	// Condicional para verificar si son iguales
	Si num1=num2 Entonces
		// Si lo son escribe el resultado
		Escribir 'Los número son iguales'
	SiNo
		// Si no lo son analiza cual es el menor
		Si num1>num2 Entonces
			Escribir 'El menor es: '+ConvertirATexto(num2)
		SiNo
			Escribir 'El menor es: '+ConvertirATexto(num1)
		FinSi
	FinSi
FinAlgoritmo

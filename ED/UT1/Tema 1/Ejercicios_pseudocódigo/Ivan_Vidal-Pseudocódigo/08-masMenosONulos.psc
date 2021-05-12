Algoritmo masMenosONulos
	// Definimos variables e igualamos los contadores a 0
	Definir num,nulos,posi,nega,i Como Entero
	nulos <- 0
	posi <- 0
	nega <- 0
	// Bucle for para repetir 10 veces
	Para i<-0 Hasta 9 Hacer
		// Pedimos un n�mero (esto 10 veces)
		Escribir 'Dime un n�mero'
		Leer num
		// Por cada n�mero a�adido, verificamos si es nulo
		Si num=0 Entonces
			// De ser nulo, se le suma 1 al contador
			nulos <- nulos+1
		SiNo
			// De no ser nulo, comprueba si es positivo o negativo
			Si num>0 Entonces
				// Si es positivo suma 1 al contador posi
				posi <- posi+1
			SiNo
				// Sino, es negativo por lo que suma 1 al contador nega
				nega <- nega+1
			FinSi
		FinSi
	FinPara
	// Una vez terminado muestra el resultado de cada contador
	Escribir 'Hay: '+ConvertirATexto(nulos)+' n�meros nulos'
	Escribir 'Hay: '+ConvertirATexto(posi)+' n�meros positivos'
	Escribir 'Hay: '+ConvertirATexto(nega)+' n�meros negativos'
FinAlgoritmo

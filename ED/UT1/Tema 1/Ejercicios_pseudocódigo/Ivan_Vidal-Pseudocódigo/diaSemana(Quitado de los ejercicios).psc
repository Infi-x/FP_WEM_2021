Algoritmo diaSemana
	//Defino una variable
	Definir num Como Entero
	//Escribo como funciona el programa y pido un n�mero
	Escribir "Dime un n�mero para un d�a a la semana: "
	Escribir "0 = Domingo"
	Escribir "1 = Lunes"
	Escribir "2 = Martes"
	Escribir "3 = Mi�rcoles"
	Escribir "4 = Jueves"
	Escribir "5 = Viernes"
	Escribir "6 = S�bado"
	Leer num
	//Seg�n el valor del n�mero realiza una operaci�n u otra
	Segun num Hacer
		0:
			Escribir "Es domingo"
		1:
			Escribir "Es lunes"
		2:
			Escribir "Es martes"
		3:
			Escribir "Es mi�rcoles"
		4:
			Escribir "Es jueves"
		5:
			Escribir "Es viernes"
		6:
			Escribir "Es s�bado"
		De Otro Modo:
			//Si no es ninguno dice que el valor se encuentra fuera de los posibles
			Escribir "El n�emero escrito no se encuentra dentro de los valores permitidos"
	Fin Segun
FinAlgoritmo

Algoritmo diaSemana
	//Defino una variable
	Definir num Como Entero
	//Escribo como funciona el programa y pido un número
	Escribir "Dime un número para un día a la semana: "
	Escribir "0 = Domingo"
	Escribir "1 = Lunes"
	Escribir "2 = Martes"
	Escribir "3 = Miércoles"
	Escribir "4 = Jueves"
	Escribir "5 = Viernes"
	Escribir "6 = Sábado"
	Leer num
	//Según el valor del número realiza una operación u otra
	Segun num Hacer
		0:
			Escribir "Es domingo"
		1:
			Escribir "Es lunes"
		2:
			Escribir "Es martes"
		3:
			Escribir "Es miércoles"
		4:
			Escribir "Es jueves"
		5:
			Escribir "Es viernes"
		6:
			Escribir "Es sábado"
		De Otro Modo:
			//Si no es ninguno dice que el valor se encuentra fuera de los posibles
			Escribir "El núemero escrito no se encuentra dentro de los valores permitidos"
	Fin Segun
FinAlgoritmo

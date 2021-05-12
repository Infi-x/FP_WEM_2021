Algoritmo nota
	// Definimos una vaible entera (suponiendo que la nota tiene valores enteros)
	Definir num Como Entero
	// Pedimos una nota de 0-10
	Escribir 'Dime tu nota (0-10)'
	Leer num
	// Si la nota está entre los valores de 0-10 escribe un mensaje dependiendo de esta
	Segun num  Hacer
		0,1,2,3,4:
			Escribir 'Insuficiente'
		5:
			Escribir 'Suficiente'
		6:
			Escribir 'Bien'
		7,8:
			Escribir 'Notable'
		9,10:
			Escribir 'Sobresaliente'
		De Otro Modo:
			// si no está en estos valores dice que la nota es "inválida"
			Escribir 'La nota es inválida'
	FinSegun
FinAlgoritmo

# Tarea Final

## Descripción
La tarea final consiste en una serie de ejercicios que se dejarán periódicamente, cada ejercicio se relacionan con los temas de laboratorio vistos. Los ejercicios son diseñados para ser entregados en el menor tiempo posible

## Prerrequisitos

- Los nombres de cada clase debe de ser EF<#>
- Los únicos archivos que se deben de subir son los .java
- En la descripción del commit debe de llevar la fecha de entrega el ejercicio

| Ejercicio | Nombre |descripción del commit|
| ------ | ------ | ------ |
| Ejercicio 1 | EF1.java |Ejercicios para 26/8/2017|
| Ejercicio 2 | EF2.java |Ejercicios para 26/8/2017|
| Ejercicio 3 | EF3.java |Ejercicios para 2/9/2017|
| Ejercicio 4 | EF4.java |Ejercicios para 2/9/2017|



Deben de recordar que el nombre del archivo debe de ser el mismo que el nombre de la clase para el ejercicio 1.

```java
public class EF1{
	código...
}
```

## Ejercicio 1
Deben de realizar por medio un algoritmo recursivo el Factorial de un número dado como entrada por un parámetro del método main.  Deben de entregar el sábado 26 de agosto antes de las 15:00

```java
public class EF1{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		System.out.println(Factorial(n));
	}
}
```


## Ejercicio 2

Deben de realizar el algoritmo de ordenamiento de búrbuja
con el siguiente arreglo, deben de imprimir únicamente de salida el arreglo ordenado separado por comas entre llaves, deben de considerar que el último no lleva coma. Deben de entregar el sábado 26 de agosto antes de las 15:00

 __Entrada__
```
{2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2}
```
__Salida__
```
{2, 2, 3, 4, 8, 10, 11, 13, 13, 18, 18, 23, 50, 109}
```



## Ejercicio 3

En criptografía, el cifrado por sustitución es un método de cifrado por el que unidades de texto plano son sustituidas con texto cifrado siguiendo un sistema regular; las "unidades" pueden ser una sola letra (el caso más común), pares de letras, tríos de letras, mezclas de lo anterior, entre otros. El receptor descifra el texto realizando la sustitución inversa.

Dada un entrada es necesario cifrar el mensaje por medio del cifrado afín. Para el ejercicio 3 deben crear un menú que permita cifrar mensajes, mostrar mensajes cifrados, mostrar mensjaes decifrados, los mensajes se deben de almacenar en un arreglo de máximo de 5 mensajes.

Fecha de entrega septiembre 2.

### Cifrado Afín


 __Fórmula para cifrar__
```
C = (5X + 11 ) mod 26 + 1

```
__Fórumla para descifrar__
```
D = (ai * (C - 11)) mod 26
```


__Donde:__

- __C__ es la posición de la letra en el alfabeto resultante cifrada
- __D__ es la posición de la letra en el alfabeto resultante descifrada
- __X__ es la posición de la letra en el alfabeto de la Entrante
- __ai__ es inverso multiplicativo de 5 mod 26, ai = 21


## Ejercicio 4
El ejercicio 4 consiste en la realización de una ventana con un JTextField donde se puede ingresar números separados por comas y en JLabel debe de mostrar el resultado de la suma al presionar un botón.

Para la separación de la cadena existe el método de Split que recibe como parámetro la cadena con la cual se hará la división devuelve un arreglo.

En el método getSuma deben de realizar las operaciones para colocar en el JLabel el resultado de la operación


__Split__
```java
  String[] numeros = entrada.split(",");
```

Como recordatorio no deben de borrar el código de las clases que se les da como plantilla sino deben de escribir sobre ellas.

Fecha de entrega septiembre 10.


__Entrada__
```
212, 31, 50, 10, 23, 4, 1, 0, 25
```
__Salida__
```
356
```


## Ejercicio 5
El ejercicio 5 consiste en la realización de completación del TAD (Tipo de dato abstracto) de diferentes Estructura de datos, y su llenado por medio la lectura de un archivo de entrada.

Las estructuras de datos son:

- Pila
- Cola
- Lista doble (InsertaralFrente)
- Lista circular (InsertaralFinal)

__Entrada__
```
Fibonacci.txt
```
__Salida__
```
Pila:
89, 55, 34, 21, 13, 8, 5, 2, 1, 1, 0

Cola:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

Lista Doble:
89, 55, 34, 21, 13, 8, 5, 2, 1, 1, 0

Lista Circular:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

```

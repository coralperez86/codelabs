/* Asignatura: Programación para Dispositivos Móviles
Unidad: Unidad 1 - Fundamentos de Kotlin
Nombre del estudiante: Coral D. Pérez Manrique
Código: 45343
Fecha de entrega: 03/09/2026
*/ 

// EJERCICIO 1: CONVERSOR DE TEMPERATURA
fun ejercicio1_Temperatura() {
    // Guardo el valor inicial en grados centígrados
    val celsius = 25.0
    
    // Aplico la fórmula multiplicando por 9/5 y sumando 32 para pasar a Fahrenheit
    val fahrenheit = (celsius * 9 / 5) + 32
    
    // Muestro el mensaje combinando las dos variables para que sea fácil de leer y tal cual como está en el taller
    println("$celsius°C equivale a $fahrenheit°F")
}

// EJERCICIO 2: CALCULADORA DE IMC
fun ejercicio2_IMC() {
    // Defino las variables del usuario (peso en kilos y altura en metros)
    val peso = 70.0
    val altura = 1.75
    
    // Calculo el IMC dividiendo el peso entre la altura al cuadrado
    val imc = peso / (altura * altura)
    
    // Uso 'when' para evaluar en qué rango cae el resultado y asignarle su etiqueta correspondiente
    val clasificacion = when {
        imc < 18.5 -> "Bajo peso"
        imc in 18.5..24.9 -> "Peso normal"
        imc in 25.0..29.9 -> "Sobrepeso"
        else -> "Obesidad"
    }
    
    // Imprimo el peso, la altura, el IMC limitado a 2 decimales y el diagnóstico final
    println("Peso: ${peso}kg, Altura: ${altura}m")
    println("IMC: %.2f".format(imc))
    println("Clasificación: $clasificacion")
}

// EJERCICIO 3: NÚMERO PAR O IMPAR
fun ejercicio3_ParImpar() {
    // Número de prueba para la validación
    val numero = 42
    
    // Si al dividir el número entre 2 el residuo es cero sé que es par, si no es impar
    val resultado = if (numero % 2 == 0) "Par" else "Impar"
    
    // Muestro en pantalla la decisión tomada
    println("El número $numero es: $resultado")
}

// EJERCICIO 4: NÚMEROS PRIMOS
fun ejercicio4_NumeroPrimo() {
    val numero = 17
    var esPrimo = true

    // Empiezo descartando: los números menores o iguales a 1 nunca son primos
    if (numero <= 1) {
        esPrimo = false
    } else {
        // Pruebo dividiendo entre cada número desde el 2 hasta antes de llegar al número evaluado
        for (i in 2 until numero) {
            if (numero % i == 0) {
                // Si encuentro al menos una división exacta, significa que no es primo y paro el ciclo
                esPrimo = false
                break 
            }
        }
    }

    // Muestro la conclusión según lo que haya pasado en el ciclo
    if (esPrimo) {
        println("El número $numero ES primo")
    } else {
        println("El número $numero NO es primo")
    }
}

// EJERCICIO 5: SUMA DE NÚMEROS PARES
fun ejercicio5_SumaPares() {
    // Creo un acumulador en cero para ir guardando la suma
    var suma = 0

    // Recorro todos los números enteros del 1 al 100
    for (i in 1..100) {
        // Solo tomo en cuenta el número actual si es divisible entre 2
        if (i % 2 == 0) {
            suma += i // Se lo sumo a lo que ya llevaba acumulado
        }
    }

    // Imprimo el total acumulado al finalizar el recorrido
    println("La suma de números pares del 1 al 100 es: $suma")
}

// EJERCICIO 6: FACTORIAL
fun ejercicio6_Factorial() {
    val numero = 5
    // Uso 'Long' por si el resultado de multiplicar llega a ser un número muy grande
    var factorial: Long = 1

    // Voy multiplicando en orden desde 1 hasta llegar al número indicado
    for (i in 1..numero) {
        factorial *= i
    }

    // Muestro el resultado final de la multiplicación acumulada
    println("El factorial de $numero es: $factorial")
}

// EJERCICIO 7: PALÍNDROMO
fun ejercicio7_Palindromo() {
    val palabra = "anilina"

    // Invierto la palabra y la comparo con la original sin importar mayúsculas o minúsculas
    val esPalindromo = palabra.equals(palabra.reversed(), ignoreCase = true)

    // Guardo el texto que voy a mostrar según el resultado de la comparación
    val resultado = if (esPalindromo) "ES un palíndromo" else "NO es un palíndromo"

    // Imprimo el resultado final
    println("La palabra '$palabra' $resultado")
}

// ============================================================================
// FUNCIÓN MAIN
// ============================================================================
fun main() {
    println("=".repeat(50))
    println("TALLER 1: KOTLIN FUNDAMENTALS")
    println("Nombre: Coral D. Pérez Manrique")
    println("=".repeat(50))
    println()
    println("--- Ejercicio 1: Conversor de Temperatura ---")
    ejercicio1_Temperatura()
    println()
    println("--- Ejercicio 2: Calculadora de IMC ---")
    ejercicio2_IMC()
    println()
    println("--- Ejercicio 3: Número Par o Impar ---")
    ejercicio3_ParImpar()
    println()
    println("--- Ejercicio 4: Números Primos ---")
    ejercicio4_NumeroPrimo()
    println()
    println("--- Ejercicio 5: Suma de Números Pares ---")
    ejercicio5_SumaPares()
    println()
    println("--- Ejercicio 6: Factorial ---")
    ejercicio6_Factorial()
    println()
    println("--- Ejercicio 7: Palíndromo ---")
    ejercicio7_Palindromo()
    println()
    println("=".repeat(50))
    println("FIN DEL TALLER")
    println("=".repeat(50))
}

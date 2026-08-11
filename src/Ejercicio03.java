void main() {
    int[] numeros = {12, 7, 43, 92, -34, 10, 5, 61};

    int maximo = encontrarMaximo(numeros);
    int minimo = encontrarMinimo(numeros);
    int sumados = sumarTodos(numeros);
    int paresTotales = cantidadDePares(numeros);

    System.out.println("Máximo encontrado: " + maximo);
    System.out.println("Mínimo encontrado: " + minimo);
    System.out.println("Suma total: " + sumados);
    if (paresTotales == 0) {
        System.out.println("No se encontraron números pares en el arreglo");
    } else {
        System.out.println("Total de números pares encontrados: " + paresTotales);
    }
}

int encontrarMaximo(int[] arreglo) {
    int max = arreglo[0];
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] > max) {
            max = arreglo[i];
        }
    }

    return max;
}

int encontrarMinimo(int[] arreglo) {
    int min = arreglo[0];
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] < min) {
            min = arreglo[i];
        }
    }

    return min;
}

int sumarTodos(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
        suma += arreglo[i];
    }

    return suma;
}

int cantidadDePares(int[] arreglo) {
    int pares = 0;
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] % 2 == 0) {
            pares++;
        }
    }

    return pares;
}
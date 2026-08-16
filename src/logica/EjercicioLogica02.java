// Dado un arreglo de números enteros, mueve todos los ceros (0) al
// final del arreglo manteniendo el orden relativo de los demás elementos que no son cero.

void main(String[] args) {
    int[] arreglo = {0, 1, 0, 3, 12};

    moverCeros(arreglo);

    System.out.println(Arrays.toString(arreglo));
}

public static void moverCeros(int[] arreglo) {
    int pos = 0;

    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] != 0) {
            arreglo[pos] = arreglo[i];
            pos++;
        }
    }

    while (pos < arreglo.length) {
        arreglo[pos] = 0;
        pos++;
    }
}

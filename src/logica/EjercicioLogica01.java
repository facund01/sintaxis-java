// Diseña un método estático que reciba dos cadenas de texto y devuelva un boolean
// (true si son anagramas, false si no lo son)

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Texto 1:");
    String texto1 = scanner.nextLine();
    String texto1Formateado = texto1.toLowerCase().replace(" ", "");

    System.out.println("Texto 2:");
    String texto2 = scanner.nextLine();
    String texto2Formateado = texto2.toLowerCase().replace(" ", "");

    boolean comparacion = sonAnagramas(texto1Formateado, texto2Formateado);

    if (!comparacion) {
        System.out.println("Los textos " + texto1 + " y " + texto2 + " no son anagramas.");
    } else {
        System.out.println("Los textos " + texto1 + " y " + texto2 + " son anagramas.");
    }
}

public static boolean sonAnagramas(String cadena1, String cadena2) {
    if (cadena1 == null || cadena2 == null) {
        return false;
    }

    if (!(cadena1.length() == cadena2.length())) {
        return false;
    }

    char[] caracteres1 = cadena1.toCharArray();
    char[] caracteres2 = cadena2.toCharArray();

    ordenar(caracteres1);
    ordenar(caracteres2);

    for (int i = 0; i < caracteres1.length; i++) {
        if (!(caracteres1[i] == caracteres2[i])) {
            return false;
        }
    }

    return true;
}

public static void ordenar(char[] caracteres) {
    for (int i = 0; i < caracteres.length - 1; i++) {
        for (int j = 0; j < caracteres.length - 1 - i; j++) {
            if (caracteres[j] > caracteres[j + 1]) {
                char aux = caracteres[j];
                caracteres[j] = caracteres[j + 1];
                caracteres[j + 1] = aux;
            }
        }
    }
}

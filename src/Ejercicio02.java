void main() throws Exception {
    int calificacion = 43;

    if (calificacion >= 90 && calificacion <= 100) {
        System.out.println("Excelente (A)");
    } else if (calificacion >= 80 && calificacion < 90) {
        System.out.println("Bueno (B)");
    } else if (calificacion >= 70 && calificacion < 80) {
        System.out.println("Suficiente (C)");
    } else if (calificacion >= 60 && calificacion < 70) {
        System.out.println("Insuficiente (D)");
    } else if (calificacion < 60) {
        System.out.println("Reprobado (F)");
    } else {
        throw new Exception("El valor de la calificación está fuera del rango 0-100");
    }
}
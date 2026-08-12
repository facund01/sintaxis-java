import poo.ejercicio02.Empleado;
import poo.ejercicio02.EmpleadoAsalariado;
import poo.ejercicio02.EmpleadoPorHora;

void main() {
    Empleado[] empleados = new Empleado[2];

    empleados[0] = new EmpleadoAsalariado("Facundo", "001", 1500000);
    empleados[1] = new EmpleadoPorHora("Alejandra", "002", 50, 12500);

    for (Empleado empleado : empleados) {
        empleado.mostrarInformacion();
        System.out.println("Salario: $" + empleado.calcularSalario());
        System.out.println("----------");
    }
}

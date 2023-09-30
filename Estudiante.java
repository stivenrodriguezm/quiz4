import java.util.Date;
public class Estudiante {
    private String nombre;
    private int fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;



    /******************************************* CONSTRUCTOR ******************************************/
    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param nombre nombre del estudiante
     * @param fechaNacimiento fecha de nacimiento del estudiante
     * complejidad O(1) constante
     */
    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * complejidad O(1) constante
     * @param nombre nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * complejidad O(1) constante
     * @param fechaNacimiento fecha de nacimiento del estudiante
     */
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * complejidad O(1) constante
     * @param notaMateria1 nota de la materia 1
     * @param notaMateria2 nota de la materia 2
     * @param notaMateria3 nota de la materia 3
     */
    public void setNotas(int notaMateria1, int notaMateria2, int notaMateria3) {
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
    }

    /**
     * complejidad O(1) constante
     * @return edad del estudiante
     */
    public int getEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth() ||
                (fechaActual.getMonth() == fechaNacimiento.getMonth() &&
                        fechaActual.getDay() < fechaNacimiento.getDay())) {
            edad--;
        }
        return edad;
    }

    /**
     * @return promedio del estudiante
     * complejidad O(1) constante
     */
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }
}


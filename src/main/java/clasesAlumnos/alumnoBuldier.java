package clasesAlumnos;
import java.time.LocalDate;

public class alumnoBuldier {
    public static class alumnoBuilder {
        protected Alumno alumno;
        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;

        public alumnoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public alumnoBuilder clave(String clave) {
            this.clave = clave;
            return this;
        }

        public alumnoBuilder claveDeCarrera(String claveDeCarrera) {
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public alumnoBuilder anioDeIngreso(int anioDeIngreso) {
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public alumnoBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return new Alumno(nombre, clave, claveDeCarrera, anioDeIngreso, fechaNacimiento);
        }
    }
}

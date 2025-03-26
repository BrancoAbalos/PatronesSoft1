import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {
    ArrayList<Empleado> empleados = new ArrayList();

    public void agregarEmpleado(Empleado empleado) {
    //que los agregue al array, debiera ser otra
    //entidad la que los tenga contenido??
    }

    public Empleado obtenerEmpleado(String nombre) {
        return null;
    }

    public void eliminarEmpleado(String nombre) {

    }

    public void actualizarEmpleado(Empleado empleado) {}
}

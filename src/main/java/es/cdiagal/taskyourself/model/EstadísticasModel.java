package es.cdiagal.taskyourself.model;
import java.util.Objects;

public class EstadísticasModel {
    private String idTarea;
    private int numUsuarios;
    private int numTareas;
    private int numTareasCompletadas;
    private int numTareasPenditentes;
    private int numTareasModificadas;

    //Constructor vacío para la clase.
    public EstadísticasModel (){

    }

    //Constructor con el atributo único de la clase.
    public EstadísticasModel(String idTarea){
        this.idTarea = idTarea;
    }

    //Constructor con todos los atributos de la clase.
    public EstadísticasModel(String idTarea, int numUsuarios, int numTareas, int numTareasCompletadas, int numTareasPenditentes, int numTareasModificadas){
        this.idTarea = idTarea;
        this.numUsuarios = numUsuarios;
        this.numTareas = numTareas;
        this.numTareasCompletadas = numTareasCompletadas;
        this.numTareasPenditentes = numTareasPenditentes;
        this.numTareasModificadas = numTareasModificadas;
    }

    //Getters y setters.


    public String getIdTarea() {
        return this.idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    public int getNumUsuarios() {
        return this.numUsuarios;
    }

    public void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    public int getNumTareas() {
        return this.numTareas;
    }

    public void setNumTareas(int numTareas) {
        this.numTareas = numTareas;
    }

    public int getNumTareasCompletadas() {
        return this.numTareasCompletadas;
    }

    public void setNumTareasCompletadas(int numTareasCompletadas) {
        this.numTareasCompletadas = numTareasCompletadas;
    }

    public int getNumTareasPenditentes() {
        return this.numTareasPenditentes;
    }

    public void setNumTareasPenditentes(int numTareasPenditentes) {
        this.numTareasPenditentes = numTareasPenditentes;
    }

    public int getNumTareasModificadas() {
        return this.numTareasModificadas;
    }

    public void setNumTareasModificadas(int numTareasModificadas) {
        this.numTareasModificadas = numTareasModificadas;
    }

    //toString() y equals().


    @Override
    public String toString() {
        return "{" +
            " idTarea='" + getIdTarea() + "'" +
            ", numUsuarios='" + getNumUsuarios() + "'" +
            ", numTareas='" + getNumTareas() + "'" +
            ", numTareasCompletadas='" + getNumTareasCompletadas() + "'" +
            ", numTareasPenditentes='" + getNumTareasPenditentes() + "'" +
            ", numTareasModificadas='" + getNumTareasModificadas() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EstadísticasModel)) {
            return false;
        }
        EstadísticasModel estadísticasModel = (EstadísticasModel) o;
        return Objects.equals(idTarea, estadísticasModel.idTarea);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(idTarea, numUsuarios, numTareas, numTareasCompletadas, numTareasPenditentes, numTareasModificadas);
    }
    

}

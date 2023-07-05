package com.marielagcw;



import java.io.Serializable;
import java.util.List;

public class Empresa implements Serializable {

    //ATRIBUTOS
    private String cuit;
    private String razonSocial;
    List<Empleado> listadoEmpleados;

    //CONSTRUCTORES
    public Empresa(String cuit,
                   String razonSocial,
                   List<Empleado> listadoEmpleados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.listadoEmpleados = listadoEmpleados;
    }

    // GETTERS Y SETTERS

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getListadoEmpleados() {
        return listadoEmpleados;
    }

    public void setListadoEmpleados(List<Empleado> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }

    //TO_STRING

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", listadoEmpleados=" + listadoEmpleados +
                '}';
    }
}

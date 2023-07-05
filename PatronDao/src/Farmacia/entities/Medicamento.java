package Farmacia.entities;

public class Medicamento {
    private Long id;
    private String nombreMedicamento;
    private String empresaMedicamento;

    public Medicamento(Long id, String nombreMedicamento, String empresaMedicamento) {
        this.id = id;
        this.nombreMedicamento = nombreMedicamento;
        this.empresaMedicamento = empresaMedicamento;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombreMedicamento() { return nombreMedicamento; }

    public void setNombreMedicamento(String nombreMedicamento) { this.nombreMedicamento = nombreMedicamento; }

    public String getEmpresaMedicamento() { return empresaMedicamento; }

    public void setEmpresaMedicamento(String empresaMedicamento) { this.empresaMedicamento = empresaMedicamento; }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", empresaMedicamento='" + empresaMedicamento + '\'' +
                '}';
    }
}

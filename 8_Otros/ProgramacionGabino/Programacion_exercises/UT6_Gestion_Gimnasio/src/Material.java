import java.time.LocalDate;
import java.util.Objects;

public class Material {
    protected static int idContador = 0;
    protected final int id;
    protected String name;
    protected final LocalDate fechaFabricacion;

    public Material() {
        idContador++;
        id = idContador;
        name = "Default";
        fechaFabricacion = LocalDate.now();
    }

    public Material(String name) {
        idContador++;
        id = idContador;
        this.name = name;
        fechaFabricacion = LocalDate.now();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Material)) {
            return false;
        }
        Material material = (Material) o;
        return id == material.id && Objects.equals(name, material.name)
                && Objects.equals(fechaFabricacion, material.fechaFabricacion);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", fechaFabricacion='" + getFechaFabricacion() + "'" +
                "}";
    }

}

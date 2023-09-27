package ar.charlycimino.quickupb;
public class Cliente {
    private String nombre, documento;
    private int n;

    public Cliente(String nombre,String documento, int n) {
        this.nombre = nombre;
        this.documento = documento;
        this.n = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

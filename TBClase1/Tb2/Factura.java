package TBClase1.Tb2;

public class Factura {
    private int IDCliente;
    private int IDFactura;
    private String NombreCliente;
    private float Importe;

    Factura(int IDFactura, Cliente clientes, float Importe) {
        this.IDCliente = clientes.getId();
        this.IDFactura = IDFactura;
        this.NombreCliente = clientes.getNombre();
        this.Importe = Importe;
    }
    public int getIDCliente() {
        return IDCliente;
    }
    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    public int getIDFactura() {
        return IDFactura;
    }
    public void setIDFactura(int IDFactura) {
        this.IDFactura = IDFactura;
    }
    public String getNombreCliente() {
        return NombreCliente;
    }
    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    public float getImporte() {
        return Importe;
    }
    public void setImporte(float Importe) {
        this.Importe = Importe;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "IDCliente=" + IDCliente +
                ", IDFactura=" + IDFactura +
                ", NombreCliente='" + NombreCliente + '\'' +
                ", Importe=" + Importe +
                '}';
    }
}

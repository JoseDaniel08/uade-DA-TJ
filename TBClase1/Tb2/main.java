package TBClase1.Tb2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Sistema s = new Sistema();

        s.NuevoCliente();
        s.CargarClientes();
        ArrayList<Cliente> listadoClientes = s.getClientes();

        s.NuevaFactura(listadoClientes.get(2));
        s.NuevaFactura(listadoClientes.get(2));
        s.NuevaFactura(listadoClientes.get(2));
        s.NuevaFactura(listadoClientes.get(1));
        s.NuevaFactura(listadoClientes.get(1));
        s.NuevaFactura(listadoClientes.get(1));


        s.CargarFacturas();

        s.CargarTotalxCliente(listadoClientes.get(2));

    }
}

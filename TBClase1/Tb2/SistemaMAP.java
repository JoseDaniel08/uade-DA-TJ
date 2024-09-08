package TBClase1.Tb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.random.RandomGenerator;

public class SistemaMAP {

    protected ArrayList<Cliente> clientes;
    protected ArrayList<Factura> facturas;


    SistemaMAP() {
        clientes = new ArrayList<>();
        facturas = new ArrayList<>();
    }

    void NuevoCliente(){
        clientes.add(new Cliente("Joaco", RandomGenerator.getDefault().nextInt()));
        clientes.add(new Cliente("Jose", RandomGenerator.getDefault().nextInt()));
        clientes.add(new Cliente("Daniel", RandomGenerator.getDefault().nextInt()));
    }
    void CargarClientes(){
        for (int i = 0; i <clientes.toArray().length; i++) {
            System.out.println(clientes.get(i).getNombre());
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    void NuevaFactura(Cliente cliente){
        if (ExisteUsuario(cliente)){
            facturas.add(new Factura(RandomGenerator.getDefault().nextInt(),cliente,RandomGenerator.getDefault().nextInt(200,500)));
            }
        else{
            System.out.println("No existe el cliente");
        }
    }

    private boolean ExisteUsuario(Cliente cliente){
        for (int i = 0; i <clientes.size(); i++) {
            if(clientes.get(i).getId() == cliente.getId()){
                return true;
            }
        }
        return false;
    }

    void CargarFacturas(){
        for (int i = 0; i <facturas.toArray().length; i++) {
            System.out.println("ID Factura: "+facturas.get(i).getIDFactura()+" "+facturas.get(i).getNombreCliente()+" Importe: "+facturas.get(i).getImporte());
        }
    }
    void CargarTotalxCliente(Cliente cliente){
        Map<Integer, Double> sumaPorCliente = new HashMap<>();
        for (Factura f : facturas) {
            sumaPorCliente.put(f.getIDCliente(),sumaPorCliente.getOrDefault(f.getIDCliente(), 0.0)+ f.getImporte());
        }
        for (Cliente c : clientes) {
            System.out.println("Cliente: " + c.getNombre() + "Suma de importe: " + sumaPorCliente.get(c.getId()));
        }
    }
}


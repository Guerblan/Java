import java.util.Scanner;

public class Gimnasio {
    private Material[] materiales = new Material[100];
    private String name;
    private static int idContador = 0;
    private int id;
    private int numMateriales = 0;

    public Gimnasio() {
        idContador++;
        id = idContador;
        name = "Default";
    }

    public Gimnasio(String name) {
        this.name = name;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // id
    public int getId() {
        return id;
    }

    // materiales
    public Material[] getMateriales() {
        return materiales;
    }

    // methods
    public void agregar(Material material) {
        if (notFull()) {
            materiales[numMateriales++] = material;
        }
    }

    public void listar() {
        for (int i = 0; i < numMateriales; i++) {
            if (materiales[i] != null) {
                materiales[i].toString();
            }
        }
    }

    public void cambiarEstado(int id) {
        for (int i = 0; i < numMateriales; i++) {
            if (materiales[i].getId() == id) {
                if (materiales[i] instanceof Maquina) {
                    Maquina maquina = (Maquina) materiales[i];
                    if (maquina.getEstado() == Estado.LIBRE) {
                        maquina.ocupar();
                    } else {
                        maquina.desocupar();
                    }
                    Material material = (Material) maquina;
                    materiales[i] = material;
                }
            }
        }
    }

    public void usar(Utilizable material) {
        material.utilizar();
    }
    
    public Material searchMaterial(int id) {
        for (int i = 0; i < numMateriales; i++) {
            if (materiales[i].getId() == id) {
                return materiales[i];
            }
        }
        return null;
    }

    // other methods
    public void reorganice() {
        for (int i = 0; i < numMateriales; i++) {
            if (materiales[i] == null) {
                for (int j = i; j < numMateriales - 1; j++) {
                    materiales[j] = materiales[j + 1];
                }
                materiales[numMateriales - 1] = null;
            }
        }
    }

    public boolean notFull() {
        if (numMateriales < materiales.length) {
            return true;
        } else {
            return false;
        }
    }

    //main para testear
    public static void main(String[] args) {
        Gimnasio gym = new Gimnasio();

        Pesa pesa8 = new Pesa("Pesa_8kg", 8);
        Pesa pesa4 = new Pesa("Pesa_4kg", 4);
        Maquina cinta = new Maquina("Cinta");
        Maquina bicicleta = new Maquina("Bicicleta");
        Material prensa = new Maquina("Presa");

        gym.agregar(pesa8);
        gym.agregar(pesa4);
        gym.agregar(cinta);
        gym.agregar(bicicleta);
        gym.agregar(prensa);

        gym.listar();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nId: ");
        int id = Integer.parseInt(sc.nextLine());
        gym.searchMaterial(id);
        
        sc.close();
    }
}

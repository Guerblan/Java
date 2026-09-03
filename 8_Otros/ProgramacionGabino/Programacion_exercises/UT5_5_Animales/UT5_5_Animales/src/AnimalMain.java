public class AnimalMain {
    public static void main(String args[]){
        Conejo conejo1 = new Conejo();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro("Perro grande", "Come huesos", 33, Size.BIG, "Dalmata", 100, Fur.LONG);
        Perro perro3 = new Perro("Perro pequenio", "Come biberon", 10, Size.SMALL, "Dalmatita", 20, Fur.SHORT);
        Gato gato1 = new Gato();
        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo();
        Caballo caballo3 = new Caballo("Caballo3", "come zanahorias", 33, 180, 120);
        Animal caballo4 = new Caballo();


        Animal[] animales = new Animal[9];
        animales[0] = conejo1;
        animales[1] = perro1;
        animales[2] = perro2;
        animales[3] = perro3;
        animales[4] = gato1;
        animales[5] = caballo1;
        animales[6] = caballo2;
        animales[7] = caballo3;
        animales[8] = caballo4;

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].toString());
            animales[i].hacerSonido();
        }

        for (int i = 3; i <= 8; i++) {
            if (i != 5) {
                if (animales[5].equals(animales[i])) {
                    System.out.println("\n5 es igual a "+i);
                }else{
                    System.out.println("\n5 es distinto de "+i);
                }
            }
            
        }
    }
}

package Practica.src;

         public class Persona {
        
            int edad;
            String nombre;

            public Persona(int edad,String nombre){
                this.edad=edad;
                this.nombre=nombre;
            }
            
       

        public static void main(String[] args) throws Exception {
            //Creo el array personas con capacidad para 3 personas
            Persona [] personas = new Persona[3];

            //Doy valores a ese array
            personas [0] = new Persona(24,"Luis");
            personas [1] = new Persona(14,"Ana");
            personas [2] = new Persona(27,"Sara");

            for (int i = 0; i < personas.length; i++) {
                System.out.println("Nombre: " + personas[i].nombre);
                System.out.println("Edad: " + personas[i].edad);
                System.out.println();
            }
        }
    }
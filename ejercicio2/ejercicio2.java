public class ejercicio2{
    public static void main(String[] args) {
        
        Gato g1 = new Gato("macho", "Blanquito");
        Gato g2 = new Gato("macho", "Chocolate");

        try{

            Gato mini = g1.apareaCon(g2, "Enano");

        }catch(ExcepcionApareamientoImposible eai){
            
            eai.printStackTrace();
        }
    }
}
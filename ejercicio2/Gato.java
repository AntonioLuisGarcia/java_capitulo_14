class Gato extends Animal{
    
    private int edad;
    private String raza;
    
    public Gato(String sexo, String nombre, int edad, String raza) {
        super(sexo, nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public Gato(String sexo, String nombre){
        super(sexo, nombre);
    }

    public void mostrarRaza(){
        System.out.println(nombre+" es de la raza: "+raza);
    }

    public String toString(){
        return nombre + " es " + sexo + " de raza " + raza + " y tiene " + edad + " años";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Gato apareaCon(Gato g, String nombre)throws ExcepcionApareamientoImposible {

        if (this.sexo.equals(g.sexo)) {
          throw new ExcepcionApareamientoImposible();
        }

        System.out.println(this.nombre + " se ha apareado con " + g.nombre + " y a salido un gato muy bonito llamado " + nombre);
        Gato gato = new Gato("macho", nombre);
        return gato;
    }
}
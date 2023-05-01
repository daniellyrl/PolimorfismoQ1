public final class Gato extends Mamifero{
    public Gato(String nome, String especie, String habitat){
        super(nome, especie, habitat);
    }
    @Override
    public void Som(){
        System.out.println("Miau Miau Miau");
    }

    @Override
    public void Correr(){
        System.out.println("Este animal Corre");
    }
}

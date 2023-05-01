public final class Cachorro extends Mamifero{
    public Cachorro(String nome, String especie, String habitat){
        super(nome, especie, habitat);
    }

    @Override
    public void Som(){
        System.out.println("Au Au Au");
    }

    @Override
    public void Correr(){
        System.out.println("Este animal Corre");
    }

}

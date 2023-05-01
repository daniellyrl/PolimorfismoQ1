public final class Passarinho extends Ave implements Voar{
    public Passarinho(String nome, String especie, String habitat){
        super(nome, especie, habitat);
    }
    @Override
    public void Voar(){
        System.out.println("Este animal voa");
    };
    @Override
    public void Som(){
        System.out.println("Piu Piu Piu");
    }
}

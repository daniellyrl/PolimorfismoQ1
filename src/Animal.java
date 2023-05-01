public abstract class Animal {
    protected String nome, especie, habitat;

    public Animal(String nome, String especie, String habitat){
        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
    }
    public void Som(){
        System.out.println("Este animal emite som");
    }
    public void Correr(){
        System.out.println("Este animal corre");
    }
    public void Voar(){
        System.out.println("Este animal voa");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

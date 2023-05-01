public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Thimoteo","Pastor Alemão","Alemanha");
        Animal a2 = new Passarinho("Renatinho","Calopsita","Deserto australiano");
        Animal a3 = new Gato("Vick","Siâmes","Indía");

        System.out.println("\n Informações do Cachorro: \n" +
                "Mamífero: " +
                "Nome: " + a1.getNome() + "\n" +
                "Espécie: " + a1.getEspecie() + "\n" +
                "Habitat: " + a1.getHabitat());
        a1.Correr();
        a1.Som();
        System.out.println("\n Informações sobre o Gato: \n" +
                "Mamífero: " +
                "Nome: " + a2.getNome() + "\n" +
                "Espécie: " + a2.getEspecie() + "\n" +
                "Habitat: " + a2.getHabitat());
        a2.Correr();
        a2.Som();
        System.out.println("\n Informações sobre o Passarinho: \n" +
                "Ave: " + "\n" +
                "Nome: " + a3.getNome() + "\n" +
                "Espécie: " + a3.getEspecie() + "\n" +
                "Habitat: " + a3.getHabitat());
        a3.Correr();
        a3.Som();
        a3.Voar();
    }
}
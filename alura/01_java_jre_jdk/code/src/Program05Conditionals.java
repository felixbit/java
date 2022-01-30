public class Program05Conditionals {

    public static void main(String[] args) {
        System.out.println("Testing conditionals");

        int age = 20;
        int numberOfPeople = 3;

        if (age >= 18) {
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (numberOfPeople >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
            } else {
                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }
}
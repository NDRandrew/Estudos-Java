public class Estudo1 {
    static void nomeIdade(String name, int age){
        if (name.equals("Andre")){
            System.out.println(name + " tem " + age + " anos!");
        } else {
            System.out.println("Voce nao e o Andre!");
        }
    }
    public static void main(String[] args){
        nomeIdade("Andre", 22);
    }
}
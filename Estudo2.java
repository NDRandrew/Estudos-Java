public class Estudo2 {
    static String nomeObjeto = "Andre"; //Atributos a serem usados pelo objeto.
    static String numeroTelefoneObjeto = "198519851652";
    
    static void Ficha(String numeroTelefone , String nome){ 
        if (nome.equals(null) || numeroTelefone.equals(null) ) { //para nao aceitar valores errados (mais funcional com Scanner).
            System.out.println("Valores nao permitidos");
        } else {  //parte de funcionalidade, onde ira printar o nome e o numero de telefone da pessoa.
            System.out.println("seu nome e: " + nome);
            System.out.println("Seu numero de telefone e: " + numeroTelefone);
        }
    }
    public static void main(String[] args){
        Estudo2 myObj = new Estudo2();  //criacao do objeto
        System.out.println("------------------------------\n" + myObj.nomeObjeto + " " + myObj.numeroTelefoneObjeto + "\n"); //print dos valores no objeto
        Ficha("11 999999999" , "Andre"); //Metodo sendo implementado
        System.out.println("-----------------------------");
    }
}

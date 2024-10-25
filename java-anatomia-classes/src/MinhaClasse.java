
public class MinhaClasse{
    public static void main (String [] args){

        String primeiroNome = "Daniel";
        String segundoNome = "Bento";

        String nomeCompleto = nomeCompleto( primeiroNome,  segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Retono do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
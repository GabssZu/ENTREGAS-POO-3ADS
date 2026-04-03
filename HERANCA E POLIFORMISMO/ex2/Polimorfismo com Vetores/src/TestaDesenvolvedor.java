import java.util.ArrayList;

public class TestaDesenvolvedor {



    //polimorifco - quando passa como parametro ele passa a representar o JR, SR ou PL
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " bonus " + camaleao.calcularBonus());
    }
    public static void main(String[] args){
        Junior jr = new Junior("Beltrano","Fulano", "java", 4000);
        exibeDados(jr);


        Pleno pl = new Pleno(0,"Beltrano", "java", 6000);
        exibeDados(pl);

        Senior sr = new Senior(30000,"Ciclano", "java", 9000);
        exibeDados(sr);




        // vetor de desenvolvdeor

        ArrayList <Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        // adiciona ao vetor

        desenvolvedores.add(jr);
        desenvolvedores.add(sr);
        desenvolvedores.add(pl);
        System.out.println ("               ");
        System.out.println (desenvolvedores + "\n");



    }
}
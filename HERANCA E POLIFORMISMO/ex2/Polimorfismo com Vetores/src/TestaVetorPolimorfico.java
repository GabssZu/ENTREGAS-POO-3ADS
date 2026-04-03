public class TestaVetorPolimorfico {

    public static void main(String[] args) {


        Desenvolvedor[] devs = new Desenvolvedor[4];


        devs[0] = new Junior("Beltrano","Fulano", "java", 4000);

        devs[1] = new Pleno(0,"Beltrano", "java", 6000);

        devs[2] = new Senior(30000,"Ciclano", "java", 9000);

        devs[3] = new Desenvolvedor("Fulaninho", "C++", 3000);


        System.out.println("    FOLHA DE PAGAMENTO  \n");

        for (Desenvolvedor d : devs) {

            d.codar();
            System.out.println("Bônus calculado: R$ " + d.calcularBonus());

            System.out.println("Dados Completos: " + d.toString());
            System.out.println("--------------------------------------------------\n");
        }
    }
}
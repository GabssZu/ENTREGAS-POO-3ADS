public class Pleno extends Desenvolvedor{

    private int projEntr;

    public Pleno (){
        super();  // o super chama os parametros do pai
    }
    // construtor deve chamar o dele + as da classe pai
    public Pleno (int projEntr, String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);

        this.projEntr = projEntr;


    }
    // gera getter e setter *SOMENTE* do filho


    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public void codar (){
        System.out.println(" Pleno codando e fazendo code review " );
    }

    @Override
    public float calcularBonus (){
        return this.salarioBase * 0.15f;

    }



    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() + // puxa o tooString do pai
                "projEntr=" + projEntr +
                '}';
    }
}
public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior (){
        super(); // o super chama os parametros do pai
    }
    // construtor deve chamar o dele + as da classe pai
    public Senior (float verba, String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }
    // gera getter e setter *SOMENTE* do filho


    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }


    @Override
    public void codar (){
        System.out.println(" Senior define arquitetura e lidera pessoas " );
    }

    @Override
    public float calcularBonus (){
        return this.salarioBase * 0.30f;

    }


    @Override
    public String toString() {
        return "Senior{" +
                super.toString() + // puxa o tooString do pai
                "verbaLider=" + verbaLider +
                '}';
    }
}
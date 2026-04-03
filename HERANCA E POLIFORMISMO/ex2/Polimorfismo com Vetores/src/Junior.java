public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super();    // o super chama os parametros do pai
    }

    // construtor deve chamar o dele + as da classe pai

    public Junior( String mentor, String nome, String linguagem, float salarioBase){

        super(nome, linguagem, salarioBase);
        this.mentor = mentor;

    }


    // gera getter e setter *SOMENTE* do filho


    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void codar (){
        System.out.println(" Junior criando código com mentoria de " + this.mentor);
    }


    @Override
    public String toString() {
        return "Junior{" +

                super.toString() +   // puxa o tooString do pai
                "mentor='" + mentor + '\'' +
                '}';
    }
}
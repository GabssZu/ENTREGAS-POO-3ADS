
public class Drone {
    private String codigo;
    float altura;
    int bateria;
    boolean emVoo;

    public Drone() {
    }
    public void setCodigo(String c) {
        this.codigo = c;
    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
            System.out.println("ALTURA VÁLIDA");
        } else {
            System.out.println("ALTURA INVALIDA");
        }
    }



    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {

            this.bateria = b;
        } else {
            System.out.println(" Sem bateria");
        }
    }



    public void decolar() {
        if (bateria > 20 && testarMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Drone decolou");
        } else {
            System.out.println("Não foi possível decolar");
        }
    }


        private boolean testarMotores(){
            System.out.println("Testando hélices...\n Calculando GPS...");
            int numero = (int)(Math.random() * 9);
            if (numero < 8) {
                System.out.println("Os motores estão prontos");
                return true;
            } else {
                System.out.println("ATENÇÃO! FALHA NOS MOTORES");
                return false;
            }
        }
    public void subir(float x) {
        setAltura(altura + x);
    }

    public void descer(float x) {
        setAltura(altura - x);
    }

    @Override
    public String toString() {
        return "Drone{" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria +
                ", emVoo=" + emVoo +
                '}';
    }
}

import java.time.LocalDateTime;
public class TestaConsulta {
    public static void main(String[] args){
        Medico medico = new Medico(1, "Angela", "Oftomologista" );
        Paciente paciente = new Paciente(2, "Danilo", "999.999.999-99");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 15, 30);
        Consulta consulta = new Consulta(data, 400.0, medico, paciente);
        System.out.println(consulta);


    }
}

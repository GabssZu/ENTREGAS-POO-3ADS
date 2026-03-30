public class TestaDrone {

    public static void main(String[] args) {
        Drone drone = new Drone();
            drone.setCodigo("ABCDE");
            drone.setBateria(25);
            drone.decolar();
            drone.subir(15);
            drone.descer(5);
        System.out.println(drone);

}}

public class Taller {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2022, 25000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Mustang", 2021, 45000);
        Vehiculo vehiculo3 = new Vehiculo("Honda", "Civic", 2023, 22000);
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Camaro", 2022, 40000);
        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Altima", 2020, 18000);

        // Prueba de funcionalidad
        System.out.println(vehiculo1.getMarca() + " " + vehiculo1.getModelo());
        System.out.println(vehiculo2.getMarca() + " " + vehiculo2.getModelo());
        System.out.println(vehiculo3.getMarca() + " " + vehiculo3.getModelo());
        System.out.println(vehiculo4.getMarca() + " " + vehiculo4.getModelo());
        System.out.println(vehiculo5.getMarca() + " " + vehiculo5.getModelo());
    }
}
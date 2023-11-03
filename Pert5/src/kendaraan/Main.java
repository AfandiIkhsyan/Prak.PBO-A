package kendaraan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilMitsubishi = new Mobil("Lamborgini");
        mobilMitsubishi.suaraMesin();
        SepedaMotor motorYamaha = new SepedaMotor("Kawasaki Ninja ZX-10R");
        motorYamaha.suaraMesin();
    }
}
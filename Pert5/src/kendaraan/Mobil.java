package kendaraan;

class Mobil extends Kendaraan {
    public Mobil(String merk) {
        super(merk);
    }

    @Override
    public void suaraMesin() {
        System.out.println("kendaraan Mobil bermerk" + getMerk() + " memiliki suara mesin 'mbrem mbrem'");
    }
}
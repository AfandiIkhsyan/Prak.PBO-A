package Hewan;

class Onta extends Hewan implements Pemakan {
    public Onta (String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " berjalan dengan empat kaki.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan kaktus.");
    }
}
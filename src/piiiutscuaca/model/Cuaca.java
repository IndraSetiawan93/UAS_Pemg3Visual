/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.model;

/**
 * model untuk menampung data cuaca
 * @author hahn
 */
public class Cuaca {
    
    private String id;
    private String namaKota;
    private double suhu;
    private double suhuMaks;
    private double suhuMin;
    private double kecepatanAngin;
    private double kelembapan;
    private double tekanan;

    public Cuaca(String id, String namaKota, double suhu, 
            double suhuMaks, double suhuMin, double kecepatanAngin,
            double kelembapan, double tekanan) {
        this.id = id;
        this.namaKota = namaKota;
        this.suhu = suhu;
        this.suhuMaks = suhuMaks;
        this.suhuMin = suhuMin;
        this.kecepatanAngin = kecepatanAngin;
        this.kelembapan = kelembapan;
        this.tekanan = tekanan;
    }

    public Cuaca() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    public double getSuhu() {
        return suhu;
    }

    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }

    public double getSuhuMaks() {
        return suhuMaks;
    }

    public void setSuhuMaks(double suhuMaks) {
        this.suhuMaks = suhuMaks;
    }

    public double getSuhuMin() {
        return suhuMin;
    }

    public void setSuhuMin(double suhuMin) {
        this.suhuMin = suhuMin;
    }

    public double getKecepatanAngin() {
        return kecepatanAngin;
    }

    public void setKecepatanAngin(double kecepatanAngin) {
        this.kecepatanAngin = kecepatanAngin;
    }
    
    public double getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(double kelembapan) {
        this.kelembapan = kelembapan;
    }

    public double getTekanan() {
        return tekanan;
    }

    public void setTekanan(double tekanan) {
        this.tekanan = tekanan;
    }
public static void main(String[] args) {
    Cuaca ca=new Cuaca();
    ca.setNamaKota("Tasikmalaya");
    ca.setSuhu(10);
    ca.setSuhuMaks(20);
    ca.setSuhuMin(5);
    ca.setKecepatanAngin(27);
    ca.setKelembapan(250.6);
    ca.setTekanan(230.5);
    
    System.out.println("Cuaca di "+ca.getNamaKota());
    System.out.println("Suhu "+ca.getSuhu()+" C");
    System.out.println("Suhu Maksimal "+ca.getSuhuMaks()+" C");
    System.out.println("Suhu Minimal "+ca.getSuhuMin()+" C");
    System.out.println("Kecepatan Angin "+ca.getKecepatanAngin()+" m/s");
    System.out.println("Kelembapan "+ca.getKelembapan()+" %");
    System.out.println("Tekanan Udara "+ca.getTekanan()+" hPa\n\n");
    
    
    ca.setNamaKota("Bandung");
    ca.setSuhu(15);
    ca.setSuhuMaks(18);
    ca.setSuhuMin(9);
    ca.setKecepatanAngin(33);
    ca.setKelembapan(280.6);
    ca.setTekanan(255.5);
    
    System.out.println("Cuaca di "+ca.getNamaKota());
    System.out.println("Suhu "+ca.getSuhu()+" C");
    System.out.println("Suhu Maksimal "+ca.getSuhuMaks()+" C");
    System.out.println("Suhu Minimal "+ca.getSuhuMin()+" C");
    System.out.println("Kecepatan Angin "+ca.getKecepatanAngin()+" m/s");
    System.out.println("Kelembapan "+ca.getKelembapan()+" %");
    System.out.println("Tekanan Udara "+ca.getTekanan()+" hPa");
}
    
}

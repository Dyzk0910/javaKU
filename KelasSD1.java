package MatematikaSD1;

import java.util.Scanner;
import java.util.regex.Pattern;



public class KelasSD1{

public static void main(String[] args) {
    int pilihan;
    String Keluarmateri;   
    Scanner input = new Scanner(System.in);
    boolean keluar = true;

    var materi1 = new BilanganCacah();
    var materi2 = new PenjumlahanDanPengurangan();
    var materi3 = new WaktudanPanjang();
    var materi4 = new Bangnan();
    var materi5 = new BangunRuang();

while (keluar) {
    System.out.println("SELAMAT DATANG DI MATERI MATEMATIKA KELAS 1 SD");
    System.out.println(" 1. BILANGAN CACAH \n 2. PENJUMLAHAN DAN PENGURANGAN BILANGAN \n 3. PENGENALAN SATUAN WAKTU DAN PANJANG  \n 4. BANGUN RUANG \n 5. NILAI TEMPAT DAN PENGGUNAANNYA \n 6. SATUAN BERAT \n 7. BANGUN DATAR");
    System.out.println("Pilih Materi : ");       
    pilihan = input.nextInt();

    if (pilihan == 1){
    
        while (true) {
            System.out.println("1. BILANGAN CACAH");
            System.out.print("Masukan angka : ");
            materi1.angkaTo = input.next();
            materi1.convertdata();
            materi1.hasil();
            System.out.println("ingin mencoba kembali ??");
            System.out.print("y/n : ");
            Keluarmateri = input.next();
            if(Keluarmateri.equals("n")){
                break;
            }
        }  
    }
    
    else if(pilihan == 2){

        while(true){
            System.out.println("2. PENJUMLAHAN DAN PENGURANGAN BILANGAN ");
            System.out.print("Masukan angka ke 1       : ");
            materi2.x = input.nextInt();
            System.out.print("Masukan operator + / -   : ");
            materi2.operator = input.next();
            System.out.print("Masukan angka ke 2       : ");
            materi2.y = input.nextInt();
            materi2.hitung();
            materi2.show();
            System.out.println("ingin mencoba kembali ??");
            System.out.print("y/n : ");
            Keluarmateri = input.next();
            if(Keluarmateri.equals("n")){
                break;
            }
        }   
        
    }else if(pilihan == 3){
            /*
             * PILIH WAKTU / PANJANG
             * PILIH DATA YANG MAU DI CONVERT
             * 
             */

            System.out.println("3. PENGENALAN SATUAN WAKTU DAN PANJANG");    
            System.out.println("Masukan Materi 1/2 : ");
        while (true){    

            materi3.pilihan = input.nextByte();
            switch (materi3.pilihan) {
                case 1:
                materi3.waktu();        
                    break;
                case 2:
                materi3.panjang();        
                    break;
                default:
                    break;
            }
            System.out.print("y/n : ");
            Keluarmateri = input.next();
            if(Keluarmateri.equals("n")){
                break;
            }
        }
            // materi3.inputanWaktu = input.nextLong();
            // INI ERRRORNYA DI METHOD 
    }else if(pilihan == 4){ 
    System.out.println("4. BANGUN RUANG 3D");  
while (keluar) {

    materi5.SayHelloBangunan();
    materi5.pilihanbangunan3d = input.nextByte();


    switch (materi5.pilihanbangunan3d) {
        case 1: 
            System.out.println("Kamu Memilih Banguna Ruang 3D (Kubus) ");
            System.out.print("Masukan Nilai sisi : ");
            materi5.x = input.nextDouble();
            materi5.RumusKubus(materi5.x);
            // materi5.RumusKubus(mat);
            break;
           
        case 2: 
        System.out.println("Kamu Memilih Banguna Ruang 3D (Balok) ");
        System.out.print("Masukan Nilai Panjang : ");
        materi5.x = input.nextDouble();
        System.out.print("Masukan Nilai Lebar : ");
        materi5.y = input.nextDouble();
        System.out.print("Masukan Nilai Tinggi : ");
        materi5.z = input.nextDouble();
        materi5.RumusBalok(materi5.x, materi5.y, materi5.z);
        // materi5.RumusKubus(mat);
        break;

        default:
        System.out.println("Maaf masukan angka 1 - 7");
      
    }

    System.out.print("ingin melanjutkan ?? y/n : ");
    Keluarmateri = input.next();
    if(Keluarmateri.equals("n")){
        break;
    }
}
    }else if(pilihan == 5){
    System.out.println("5. NILAI TEMPAT DAN PENGGUNAANNYA ");
    }else if(pilihan == 6){
    System.out.println("6. SATUAN BERAT");

    }else if(pilihan == 7){
    System.out.println("7. BANGUN DATAR 2D");    

      
    System.out.println("Pilih bangunan yang  ingin dihitung");
    System.out.println(" 1. Persegi 2. Persegi Panjang 3. jajar genjang 4. segitiga \n 5. belah ketupat 6. layang layang 7. trapesium 8. lingkaran ( done )");
    System.out.print("Masukan Nama bangun : ");
    pilihan = input.nextInt();
    switch (pilihan) {
        case 1:
            System.out.println("Persegi");
            System.out.print("Masukan Nilai Sisi : ");
            materi4.SISI = input.nextDouble();
            Bangnan.luasPersegi(materi4.SISI);
            Bangnan.KelilingPersegi(materi4.SISI);
            break;
        case 2:
            System.out.println("Persegi Panjang");
            System.out.println("Masukan NIlai Panjang : ");
            materi4.PANJANG = input.nextDouble();
            System.out.println("Masukan Nilai Lebar : ");
            materi4.LEBAR = input.nextDouble();
            Bangnan.luasPersegiPanjang(materi4.PANJANG,materi4.LEBAR);
        case 3:
            System.out.println("Jajar Genjang\n\n");
            System.out.println("{ Mencari Keliling }");
            System.out.println("Aturan bangun Jajargenjang \n + sisi atas = sisi bawah \n + sisi kanan = sisi kiri \n + sisi atas & sisi bawah > sisi kiri & sisi kanan ");
            System.out.print("Masukan Nilai sisi Atas : ");
            materi4.A = input.nextDouble();
            System.out.print("Masukan Nilai sisi Bawah : ");
            materi4.B = input.nextDouble();
            System.out.print("Masukan Nilai sisi kiri : ");
            materi4.C = input.nextDouble();
            System.out.print("Masukan Nilai sisi kanan : ");
            materi4.D = input.nextDouble();
            Bangnan.kelilingJajargenjang(materi4.A, materi4.B, materi4.C, materi4.D);

            System.out.println("{ Mencari Luas } ");
            System.out.print("Masukan Nila Alas : ");
            materi4.E = input.nextDouble();
            System.out.print("Masukan Nilai TInggi :");            
            materi4.F = input.nextDouble();
            Bangnan.luasJajargenjang(materi4.E, materi4.F);
        case 4:
            System.out.println("Segitiga");
            System.out.println("Mencai Luas ");
            System.out.print("Masukan Nilai ALas : ");
            materi4.A = input.nextDouble();
            System.out.print("Masukan Nilai TInggi : ");
            materi4.B = input.nextDouble();
            Bangnan.luasSegitiga(materi4.A,materi4.B);


            
            System.out.println("Mencari Keliling ");
            System.out.print("Masukan NIlai Sisi kanan : ");
            materi4.C = input.nextDouble();
            System.out.print("Masukan NIlai Sisi kiri : ");
            materi4.D = input.nextDouble();
            System.out.print("Masukan NIlai Sisi bawah : ");
            materi4.E = input.nextDouble();
            Bangnan.kelilngSegitiga(materi4.C, materi4.D, materi4.E);

        case 5:
            
            System.out.println("Belah Ketupat");
            System.out.println("Mencari Luas");

            System.out.print("Masukan Nilai A : ");
            materi4.E = input.nextDouble();
            System.out.print("Masukan Nilai B : ");
            materi4.F = input.nextDouble();
            Bangnan.luasBelahketupat(materi4.E , materi4.F);            
            System.out.println("Mencari Keliling");


            System.out.print("Memasukan Nilai a ");
            materi4.A = input.nextDouble();
            System.out.print("Memasukan Nilai b ");
            materi4.B = input.nextDouble();
            System.out.print("Memasukan Nilai c ");
            materi4.C = input.nextDouble();
            System.out.print("Memasukan Nilai d ");
            materi4.D = input.nextDouble();
            Bangnan.kelilingBelahketupat(materi4.A, materi4.B, materi4.C, materi4.D);
           
        case 6:
            System.out.println("LayangLayang");
            System.out.println("Mencari Luas");
            System.out.print("Masukan Nilai D1 :");
            materi4.A = input.nextDouble();
            System.out.print("Masukan Nilai D2 :");
            materi4.B = input.nextDouble();
            Bangnan.luasLayanglayang(materi4.A,materi4.B);

            System.out.println("Mencari Keliling");
            
            
            System.out.print("Masukan Nilai A :");
            materi4.C = input.nextDouble();
            System.out.print("Masukan Nilai B :");
            materi4.D = input.nextDouble();
            System.out.print("Masukan Nilai C :");
            materi4.E = input.nextDouble();
            System.out.print("Masukan Nilai D :");
            materi4.F = input.nextDouble();
            Bangnan.kelilingLayanglayang(materi4.C, materi4.D, materi4.E, materi4.F);
        
        case 7:
            System.out.println("Trapesium");
            System.out.println("Mencari Luas");
            System.out.print("Memasukan Sisi atas : ");
            materi4.A = input.nextDouble();
            System.out.print("Memasukan Sisi Bawah : ");
            materi4.B = input.nextDouble();
            System.out.print("Memasukan Sisi TInggi");
            materi4.C = input.nextDouble();
            Bangnan.luasTrapesium(materi4.A, materi4.B , materi4.C);


            System.out.println("Mencari Keliling");
            System.out.print("Masukan Nilai A :");
            materi4.D = input.nextDouble();
            System.out.print("Masukan Nilai B :");
            materi4.E = input.nextDouble();
            System.out.print("Masukan Nilai C :");
            materi4.F = input.nextDouble();
            System.out.print("Masukan Nilai D :");
            materi4.G = input.nextDouble();
            Bangnan.kelilingTrapesium(materi4.D, materi4.E, materi4.F,materi4.G);
        case 8 :

                System.out.println("Lingkaran");
                System.out.println("Mengunkaan Diameter / Jari Jari");
                System.out.print("masukan nilai D/J : ");
            while (keluar) {
                
            
                materi4.pilihandiameterataujari =  materi4.keyboardku.nextLine();

                if (materi4.pilihandiameterataujari.equals("D")|| materi4.pilihandiameterataujari.equals("d") ) {
                
                    System.out.print("Masukan Nilai Diameter : ");
                    materi4.A = input.nextDouble();
                    materi4.A = materi4.A / 2;
                    break;

                }if (materi4.pilihandiameterataujari.equals("J")|| materi4.pilihandiameterataujari.equals("j")) {
                    
                    System.out.print("Masukan Nilai Jari Jari : ");
                    materi4.A = input.nextDouble();
                    break;
                } else {
                 System.out.println("Masukan antara D/J");   
                }
            }
            
            Bangnan.luasLingkaran(materi4.A);
            Bangnan.kelilingLingkaran(materi4.A);


            default:
            System.out.println("Masukan dengan anggka 1 digit");
            break;
    }   
    }
}
}
}

 class BilanganCacah extends KelasSD1{
    
    String angkaTo;
    int angkaKe;
    int hasil;
    
    // if(Pattern.matches("[^a-zA-Z]", materi1.angkaTo) == false && materi1.angkaTo.length() > 2){
        
    //     materi1.hasil = Integer.parseInt(materi1.angkaTo);
    //     materi1.hasil();
    //     keluar1 = false;
    // }

    void convertdata(){
            if(Pattern.matches("[^a-zA-Z]", angkaTo) == false && angkaTo.length() > 1){
                angkaKe = Integer.parseInt(angkaTo);
            }else{
                System.out.println("yang kamu masukan selain number");
            }
    }

    void hasil(){   
        if(angkaKe > 0){
        int d = angkaKe;
        for (int a = 0;  a <= angkaKe  ; angkaKe--) {
            hasil = d - angkaKe;
                System.out.print(hasil + " ");
            }
        }else System.out.println("maaf yang anda masukan mungkin bukan angka atau bilangan negatif");
    }
}
class PenjumlahanDanPengurangan extends KelasSD1{
    
    int x;
    int y;
    String operator;
    int hasil;

      public int hitung(){

        switch (this.operator){
            case "+":
            return this.hasil = x + y;
            case "-" :
            return this.hasil = x - y;
            default: System.out.println("Maff operator nya salah  : " + operator);// jika semua kondisi tidak terpenuhi / else
               
        }
        return 0;
    }

    void show(){
        System.out.println("Hasil nya ("+x+") "+operator+" ("+y+") = "+hasil);
    }
}
class WaktudanPanjang extends KelasSD1{
Double inputanWaktu,inputPanjang;
Byte pilihan;

Double detik,menit,jam,hari,minggu,bulan,tahun;

String [] kmtomm = {
    "wkkwkw","KM","HM","DAM","M","DM","CM","MM"
};
Double hasilPanjang;
Scanner scannerMateri3 = new Scanner(System.in);


void panjang(){
    System.out.println("halo panjang");
   
        System.out.println("Kamu memilih Materi Panjang");
        System.out.println("1.KM || 2.HM || 3.DAM || 4.M || 5.DM || 6.CM || 7.MM");
        System.out.print("Masukan angka 1/2/3/4/5/6/7 : ");
        pilihan = scannerMateri3.nextByte();
        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih KM");
                break;
            case 2:
                System.out.println("Kamu memilih HM");
                break;
            case 3:
                System.out.println("Kamu memilih DAM");
                break;
            case 4:
                System.out.println("Kamu memilih M");
                break;
            case 5:
                System.out.println("Kamu memilih DM");
                break;
            case 6:
                System.out.println("Kamu memilih CM");
                break;
            case 7:
                System.out.println("Kamu memilih MM");
                break;
            default: System.out.println("maff coba lagi");
                break;
        }

        System.out.println("Masukan NIlai : ");
        FungsiPanjang(scannerMateri3.nextDouble());
}

Double FungsiPanjang (Double Objekpanjang){

    byte x = pilihan;
    byte y = pilihan;
    double naik = Objekpanjang;
    double turun =  Objekpanjang;

    System.out.println("");

    System.out.println("  NAIK  TANGGA \n ");

        y++;
    for (int k = 7; k >= y; y++) {
        naik= naik *10;
        System.out.println(kmtomm[y]+" = "+naik);
    }

    System.out.println("\n TURUN TANGGA  \n");
    x --;
    for (int i = 1; i <= x; ) {
     
        turun = turun/10;
        System.out.println(kmtomm[x]+" = "+turun);
        x--;
    }

   
    return Objekpanjang;
}

// Seleksi 
void waktu(){   
        System.out.println("Kamu memilih Materi Waktu");
        System.out.println(" ||1 menit = 60 detik || 1 jam = 60 menit  || 1 jam = 3600 detik  ||  1 hari = 24 jam   || \n || 1 hari = 1440 menit  || 1 hari = 86400 detik  || 1 minggu = 7 hari || 1 minggu = 168 jam  || \n || 1 minggu = 10080 menit    ||  1 minggu = 604800 detik   ||  1 bulan = 28, 29, 30 atau 31 hari   || \n ||   1 tahun = 12 bulan   || 1 tahun = 365 atau 366 hari\n");
        System.out.println("Pilih 1.detik || 2. Menit || 3.jam || 4.hari || 5.minggu || 6.bulan || 7.tahun");
        System.out.print("Masukan angka 1/2/3/4/5/6 : ");
        pilihan = scannerMateri3.nextByte();
        System.out.println(pilihan);

        if (pilihan == 1) {
            System.out.println("Kamu Memilih Detik");
            System.out.print("Masukan Detik :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiDetik(inputanWaktu);
        }else if(pilihan == 2){
            System.out.println("Kamu Memilih Menit");
            System.out.print("Masukan Menit :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiMenit(inputanWaktu);

        }else if(pilihan == 3){
            System.out.println("Kamu Memilih Jam");
            System.out.print("Masukan JAM :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiJam(inputanWaktu);

        }else if(pilihan == 4){
            System.out.println("Kamu Memilih Hari");
            System.out.print("Masukan Hari :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiHari(inputanWaktu);

        }else if(pilihan == 5){
            System.out.println("Kamu Memilih Minggu");
            System.out.print("Masukan Minggu :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiMinggu(inputanWaktu);
        }
        else if(pilihan == 6){
            System.out.println("Kamu Me%milih Bulan");
            System.out.print("Masukan Bulan :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiBulan(inputanWaktu);
        }else if(pilihan == 7){
            System.out.println("Kamu Memilih Tahun");
            System.out.print("Masukan Tahun :");
            inputanWaktu = scannerMateri3.nextDouble();
            FungsiTahun(inputanWaktu);
        }



    display();
}
    Double FungsiDetik (Double BerapaDetik){
        detik = BerapaDetik;
        menit = detik/60;
        jam   = menit/60;
        hari  = jam/24;
        minggu = hari/7;
        bulan = minggu/4;
        tahun = bulan/12;
        return BerapaDetik;
    }
    Double FungsiMenit (Double BerapaMenit){
        menit = BerapaMenit;

        detik = menit * 60;
        jam   = menit / 60;
        hari  = jam / 60;
        minggu = hari/7;
        bulan = minggu/4;
        tahun = bulan/12;

        return BerapaMenit;

    }
    Double FungsiJam (Double BerapaJam){
        jam   = BerapaJam;

        detik = jam * 3600;
        menit = detik / 60;
        hari   = jam / 60;
        minggu = hari/7;
        bulan = minggu/4;
        tahun = bulan/12;

        return BerapaJam;

    }
    Double FungsiHari (Double BerapaHari){
        hari = BerapaHari;
      

        detik = hari * 86400;
        menit = detik / 60;
        jam   = menit / 60;
        minggu = hari/7;
        bulan = minggu/4;
        tahun = bulan/12;

        return BerapaHari;

    }
    Double FungsiMinggu (Double BerapaMinggu){
        minggu = BerapaMinggu;

        detik = minggu * 604800;
        menit = detik / 60;
        jam   = menit / 60;
        minggu = hari/7;
        bulan = minggu/4;
        tahun = bulan/12;

        return BerapaMinggu;

    }
    Double FungsiBulan (Double BerapaBulan){
        bulan = BerapaBulan;

        detik = bulan * 2592000;
        menit = detik / 60;
        jam   = menit / 60;
        minggu = hari/7;
        tahun = bulan/12;

        return BerapaBulan;

    }
    Double FungsiTahun (Double BerapaTahun){
        tahun = BerapaTahun;

        detik = tahun * 31536000;
        menit = detik / 60;
        jam   = menit / 60;
        hari = jam / 24;
        minggu = hari/7;
        bulan = minggu/4;

        return BerapaTahun;

    }

   

    void displayBerat(){

    }
    void display (){
         System.out.println("Detik   :"+detik);
        System.out.println("Menit   :"+menit);
        System.out.println("jam     :"+jam);
        System.out.println("hari    :"+hari);
        System.out.println("minggu  :"+minggu);
        System.out.println("bulan   :"+bulan);
        System.out.println("tahun   :"+tahun);
    }
}
class Bangnan extends KelasSD1 {

    Double SISI,PANJANG,LEBAR,t,D1,D2,JariJari,PIH,Diameter;
    Double A,B,C,D,E,F,G,H,I;
    String pilihandiameterataujari;
    int pilihan;
    Scanner keyboardku = new Scanner(System.in);
/* 
    8. lingkaran ( done )
     */
static  void luasPersegi(double sisi){
    double hasil = 0;
    hasil = sisi*sisi;
    System.out.println("LUAS PERSEGI : "+ hasil);
}
static void KelilingPersegi(double sisi){
    double hasil =0 ;
    hasil = 4*sisi;
    System.out.println("KELILING PERSEGI : "+ hasil);
}
static void kelilingPersegiPanjang(double panjang ,double lebar ){
    double hasil = 0;
    if (panjang > lebar  ){
        hasil =  (2* panjang) + (2*lebar);
        System.out.println(hasil);
    }else {
        System.out.println("Kemungkinan ini bukan bentuk persegi panjang karena lebar nya lebih besar");
    }
}
static void luasPersegiPanjang( double panjang, double lebar ){
    double hasil = 0;
    if (panjang > lebar  ){
        hasil =  panjang*lebar;
        System.out.println(hasil);
    }else {
        System.out.println("Kemungkinan ini bukan bentuk persegi panjang karena lebar nya lebih besar");
    }
}
static  void kelilingJajargenjang(double sisiatas , double sisibawah , double sisikanan , double sisikiri){
    double hasil = 0;
    if(sisiatas == sisibawah && sisikanan == sisikiri && sisiatas > sisikanan){
        hasil = sisiatas+sisibawah+sisikanan+sisikiri;
        System.out.println(hasil);
    }else {
        System.out.println("Kemungkinan ini bukan jajargenjang karena sudut nya tidak sama");
    }
}
static  void  luasJajargenjang(double alas , double tinggi ){
    double hasil = 0;
    hasil = alas*tinggi;
    System.out.println(hasil);
}
static void luasSegitiga(double alas , double tinggi){
    double hasil = 0;
    hasil = (alas*tinggi);
    hasil = hasil/2;
    System.out.println(hasil);
}
static void kelilngSegitiga(double sisikiri , double sisikanan , double sisibawah){
    double hasil = 0;
    String BerdasarkanPanjangSisi;
    hasil = sisikiri+sisikanan+sisibawah;
    if (sisikanan == sisikiri || sisikanan == sisibawah|| sisibawah == sisikiri){
        BerdasarkanPanjangSisi = "SEGITIGA SAMA KAKI";
    } else if (sisikanan/sisibawah == sisikiri/sisikiri) {
        BerdasarkanPanjangSisi = "SEGITIGA SAMA SISI";
    }else {
        BerdasarkanPanjangSisi = "SEGITIGA SEMBARANGAN";
    }


    System.out.println("Keliling : " + hasil);
    System.out.println("Berdasarkan ukuran :  " + BerdasarkanPanjangSisi);
}
static void kelilingBelahketupat (double a, double b ,double c,double d ){
    double hasil = 0;
    hasil = a + b + c + d;
    System.out.println(hasil);
}
static  void luasBelahketupat (double d1 , double d2 ){
    double hasil = 0 ;
    hasil = d1 * d2;
    System.out.println(hasil);
}
static void kelilingLayanglayang(double a , double b , double c , double d){
    double hasil = 0 ;
    hasil = a+b+c+d;
    System.out.println(hasil);
}
static void luasLayanglayang(double d1 , double d2 ){
    double hasil = 0 ;
    hasil = d1 * d2;
    System.out.println(hasil);
}
static void kelilingTrapesium(double a , double b , double c , double d){
    double hasil = 0 ;
    hasil = a+b+c+d;
    System.out.println(hasil);
}
static void luasTrapesium(double a, double b , double t ){
    double hasil = 0;
    hasil = ((a+b)/2)*t;
    System.out.println(hasil);
}
static  void kelilingLingkaran( double r){


    double hasil = 0;
    hasil = 2*Math.PI*r;
    System.out.println(hasil);
}
static  void  luasLingkaran (double r){
    double hasil = 0;
    hasil = Math.PI*r;
    System.out.println(hasil);
}


/*
* Bangun ruang ada 
*/
}
class BangunRuang extends KelasSD1{

byte pilihanbangunan3d;
double a,b,c,d,e,f,g,h,x,y,z;
    static void SayHelloBangunan(){


        System.out.println("Selamat Datang di Bangunana 3 Dimensi");
        System.out.println("Pilih Bangun Ruang : ");
        System.out.println("1. Kubus \n 2. Balok \n 3. Prisma \n 4. Limas \n 5. Tabung \n 6. Kerucut \n 7. Bola");
        
    }
    static void RumusKubus (double Sisi){
        double hasil;
        hasil = Sisi*Sisi*Sisi*Sisi;
        System.out.println("Ket : Sisi kubus = " + Sisi);
        System.out.println("Hasil Volume = "+ hasil);

    }
        static void RumusBalok (double panjang , double lebar , double tinggi){
        double hasil;
        if (panjang >= 0 && lebar >= 0 && tinggi >= 0 && panjang > lebar ) {
            hasil = panjang * lebar * tinggi;

        System.out.println("Ket : Panjang = " + panjang + " Lebar = "+ lebar+ " Tinggi = "+tinggi );
        System.out.println("Hasil Volume Balok = "+ hasil);

            
        }else {
            System.out.println("Mungin yang kamu masukan itu Pnjang/lebar/tinggi = 0 \n Lebar Lebih besar di bandingkan panjang ");
        }
        


    }
    /*
     * 1. Kubus
     * 2. Balok
     * 3. Prisma
     * 4. Limas
     * 5. tabung
     * 6. Kerucut
     * 7. Bola
     * 
     */
}



















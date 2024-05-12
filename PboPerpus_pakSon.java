package com.mycompany.pboperpus_pakson;

 import java.util.ArrayList;

interface PeminjamanInterface {
    void pinjamBuku(int idSiswa,int idBuku, int banyak);
    void kembalikanBuku(int idSiswa,int idBuku, int banyak);
}

class Peminjaman implements PeminjamanInterface {
    private ArrayList<Integer> idSiswa = new ArrayList<>();
    private ArrayList<Integer> idBuku = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

public void pinjamBuku(int idSiswa,int idBuku, int banyak){
     if(!status.get(idSiswa)){
         System.out.println("siswa tidakbisa menyeleh buku.");
        return;
     }
     this.idSiswa.add(idSiswa);
     this.idBuku.add(idBuku);
     this.banyak.add(banyak);
     
     status.set(idSiswa, false);
     System.out.println("Bukune berhasil diseleh");     
 }
public void kembalikanBuku(int idSiswa, int idBuku, int banyak) {
        for(int i = 0; i< this.idSiswa.size(); i++){
            if (this.idSiswa.get(i) == idBuku && this.idBuku.get(i)== idBuku && this.banyak.get(i)== banyak) {
           this.idSiswa.remove(i);
           this.idBuku.remove(i);
           this.banyak.remove(i);
           break;
            }
        }
        status.set(idSiswa, true);
        System.out.println("buku berhasil di balekkan");
  }
 }
class Siswa{
        private String namaSiswa;
        private String alamat;
        private String telepon;
        private boolean status;
        
        //konstruktor
        public Siswa(String namaSiswa, String alamat,String telepon ){
                this.namaSiswa = namaSiswa;
                this.alamat = alamat;
                this.telepon = telepon;
                this.status = true;
                
}
            //get set
            public String getNamaSiswa(){
                    return namaSiswa;
}
            public void setNamaSiswa(String namaSiswa){
                    this.namaSiswa = namaSiswa;
}
            public String getAlamat(){
                    return alamat;
}
            public void setAlamat(String alamat){
                    this.alamat = alamat;
}
            public String getTelepon(){
                    return telepon;
}
            public void setTelepon(String telepon){
                    this.telepon =  telepon;
}
            public boolean getStatus(){
                   return status;
}
            public void setStatus(boolean status){
                    this.status = status;
}

}

class Petugas implements PeminjamanInterface {
    private ArrayList<String> namaKaryawan = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    
    public void pinjamBuku(int idSiswa , int idBuku , int banyak){
        
    }
    public void kembalikanBuku(int idSiswa, int idBuku ,int banyak ){
    }
}


class Buku {
    private String namaBuku;
    private int stok;
    private int harga;
    
public Buku(String namaBuku,int stok,int harga){
this.namaBuku = namaBuku;
this.stok = stok;
this.harga = harga;
}
// getter setter
public String getNamaBuku(){
    return namaBuku;
}
public void setNamaBuku(String namaBuku) {
    this.namaBuku = namaBuku;
}
public int getStok(){
return stok;
}
public void setStok(int stok) {
    this.stok = stok;
}
public int getHarga(){
    return harga;
}
public void setHarga(int harga){
    this.harga = harga;
            }
}
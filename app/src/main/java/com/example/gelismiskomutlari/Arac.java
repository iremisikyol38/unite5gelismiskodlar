package com.example.gelismiskomutlari;


public class Arac {
    private Integer kapisayisi;
    private Integer maksimumhiz;

    public void setMaksimumhiz(Integer maksimumhiz) {
        this.maksimumhiz = maksimumhiz;
    }

    public  Integer getKapisayisi(){
        return kapisayisi;

    }
    public void setkapisayisi(Integer kapisayisi){
     this.kapisayisi = kapisayisi;
    }
    public void getMaksimumhiz() {
        this.maksimumhiz = maksimumhiz;

    }
    public String kapiSayisiGoster(){
        return "Aracın kapı sayısı :" + this.kapisayisi.toString();

    }
    public String maksimumHizGoster(){
        return "Aracın maksimum hızı :" + this.maksimumhiz.toString();
    }
    public String calistir(){
        return "Araç çalışıyor";
    }

}

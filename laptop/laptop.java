package laptop;

import java.util.HashMap;
import java.util.Map;

public class laptop {
    private String vendor;
     private String memory; // ОЗУ
    private String volume_storage; // Объём ЖД
    private String kind_storage; // тип ЖД
    private String OS; // Операционная система
    private String color; // Цвет
    private String year; // год выпуска

    public laptop(
            String vendor,
            String memory,
            String volume_storage,
            String kind_storage,
            String OS,
            String color,
            String year){
        this.vendor = vendor;
        this.memory = memory;
        this.volume_storage = volume_storage;
        this.kind_storage = kind_storage;
        this.OS = OS;
        this.color = color;
        this.year = year;
    }

    public Map<String, String> getLaptop(){
        Map<String, String> laptop = new HashMap<>();

        laptop.put("vendor", this.vendor == null ? "" : this.vendor);
        laptop.put("memory", this.memory == null ? "" : this.memory);
        laptop.put("volume_storage", this.volume_storage == null ? "" : this.volume_storage);
        laptop.put("kind_storage", this.kind_storage == null ? "" : this.kind_storage);
        laptop.put("OS", this.OS == null ? "" : this.OS);
        laptop.put("color", this.color == null ? "" : this.color);
        laptop.put("year", this.year == null ? "" : this.year);

        return laptop;
    }

    public String getVendor() {
        return this.vendor == null ? "" : this.vendor;
    }
   public String getMemory(){
        return this.memory == null ? "" : this.memory;
    }
    public String getVolume_storage(){
        return this.volume_storage == null ? "" : this.volume_storage;
    }
    public String getKind_storage(){
        return this.kind_storage == null ? "" : this.kind_storage;
    }
    public String getOS(){
        return this.OS == null ? "" : this.OS;
    }
    public String getColor(){
        return this.color == null ? "" : this.color;
    }
    public String getYear(){
        return this.year == null ? "" : this.year;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
   public void setVolume_storage(String volume_storage) {
        this.volume_storage = volume_storage;
    }
    public void setKind_storage(String kind_storage) {
        this.kind_storage = kind_storage;
    }
   public void setOS(String OS) {
        this.OS = OS;
    }
   public void setColor(String color) {
        this.color = color;
    }
    public void setYear(String year) {
        this.year = year;
    }
}

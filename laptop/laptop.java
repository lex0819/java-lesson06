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
        this.vendor = vendor == null ? "" : vendor;
        this.memory = memory == null ? "" : memory;
        this.volume_storage = volume_storage == null ? "" : volume_storage;
        this.kind_storage = kind_storage == null ? "" : kind_storage;
        this.OS = OS == null ? "" : OS;
        this.color = color == null ? "" : color;
        this.year = year == null ? "" : year;
    }

    public Map<String, String> getLaptop(){
        Map<String, String> laptop = new HashMap<>();

        laptop.put("vendor", this.vendor);
        laptop.put("memory", this.memory);
        laptop.put("volume_storage", this.volume_storage);
        laptop.put("kind_storage", this.kind_storage);
        laptop.put("OS", this.OS);
        laptop.put("color", this.color);
        laptop.put("year", this.year);

        return laptop;
    }

    public String getVendor() {
        return vendor;
    }

    public String getMemory(){
        return this.memory;
    }
    public String getVolume_storage(){
        return this.volume_storage;
    }
    public String getKind_storage(){
        return this.kind_storage;
    }
    public String getOS(){
        return this.OS;
    }
    public String getColor(){
        return this.color;
    }
    public String getYear(){
        return this.year;
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

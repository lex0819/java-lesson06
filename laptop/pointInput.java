package laptop;

import java.util.*;

public class pointInput {
    public static Set<laptop> searchRange(String memory,
                                   String volume_storage,
                                   String year,
                                   HashSet<laptop> laptops){
        Set<laptop> filterRange = new HashSet<>();
        for(laptop item : laptops){
            if(Integer.parseInt(memory) <= Integer.parseInt(item.getMemory())
                    && Integer.parseInt(volume_storage) <= Integer.parseInt(item.getVolume_storage())
                    && Integer.parseInt(year) <= Integer.parseInt(item.getYear())){
                filterRange.add(item);
            }
        }
        return filterRange;
    }

    public static Set<laptop> searchVendor(String vendor, HashSet<laptop> laptops){
        Set<laptop> filterVendor = new HashSet<>();
        for(laptop item : laptops){
            if(Objects.equals(vendor, item.getVendor())){
                filterVendor.add(item);
            }
        }
        return filterVendor;
    }
    public static Set<laptop> searchOS(String OS, HashSet<laptop> laptops){
        Set<laptop> filterOS = new HashSet<>();
        for(laptop item : laptops){
            if(Objects.equals(OS, item.getOS())){
                filterOS.add(item);
            }
        }
        return filterOS;
    }

    public static Set<laptop> SetIntersection(Set<laptop> s1, Set<laptop> s2){
        Set<laptop> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        return intersection;
    }

    public static void main(String[] args){
        laptop computer01 = new laptop("ASUS","4096", "512", "SSD", "Win11", "black", "2022");
        laptop computer02 = new laptop("HP","8192", "1024", "HDD", "Win10", "black", "2019");
        laptop computer03 = new laptop("Lenovo","8192", "512", "SSD", "Win11", "black", "2021");
        laptop computer04 = new laptop("Lenovo","4096", "512", null, "Win11", null, "2021");
        laptop computer05 = new laptop("MacBook","8192", "256", "SSD", "MacOS", null, "2022");
        laptop computer06 = new laptop("MacBook","8192", "512", "SSD", "MacOS", "grey", "2022");
        laptop computer07 = new laptop("MacBook","16384", "512", "SSD", "MacOS", "grey", "2023");

        HashSet<laptop> laptops = new HashSet<>();
        laptops.add(computer01);
        laptops.add(computer02);
        laptops.add(computer03);
        laptops.add(computer04);
        laptops.add(computer05);
        laptops.add(computer06);
        laptops.add(computer07);
        System.out.println("\nAll our computers: ");
        for (laptop item: laptops){
            System.out.println(item.getLaptop());
        }

        Set<laptop> filtered01 = searchVendor("MacBook", laptops);
        System.out.println("\nSearching of computers by Vendor: ");
        for (laptop item: filtered01){
            System.out.println(item.getLaptop());
        }

        Set<laptop> filtered02 = searchRange("4000","0","2022", laptops);
        System.out.println("\nSearching of computers by memory and year: ");
        for (laptop item: filtered02){
            System.out.println(item.getLaptop());
        }

        Set<laptop> filtered03 = searchOS("Win11", laptops);
        System.out.println("\nSearching of computers by OS: ");
        for (laptop item: filtered03){
            System.out.println(item.getLaptop());
        }

        Set<laptop> filtered04 = SetIntersection(filtered01, filtered02);
        System.out.println("\nIntersection range and vendor of computers: ");
        for (laptop item: filtered04){
            System.out.println(item.getLaptop());
        }

        Set<laptop> filtered05 = SetIntersection(filtered03, filtered02);
        System.out.println("\nIntersection range and OS of computers: ");
        for (laptop item: filtered05){
            System.out.println(item.getLaptop());
        }
    }
}

package laptop;

import java.util.ArrayList;

public class pointInput {
    public static ArrayList<laptop> searchLaptops(String vendor,
                                       String memory,
                                       String year,
                                       ArrayList<laptop> laptops){
        ArrayList<laptop> searchList = new ArrayList<laptop>();
        for(laptop item : laptops){
            if(memory == null){
                if(item.getVendor() == vendor && item.getYear() == year){
                    searchList.add(item);
                }
            }else {
                if(item.getVendor() == vendor && item.getMemory() == memory && item.getYear() == year){
                    searchList.add(item);
                }
            }

        }
        return searchList;
    }
    public static void main(String[] args){
        laptop computer01 = new laptop("ASUS","4096", "512", "SSD", "Win11", "black", "2020");
        laptop computer02 = new laptop("HP","8192", "1024", "HDD", "Win10", "black", "2019");
        laptop computer03 = new laptop("Lenovo","8192", "512", "SSD", "Win11", "black", "2021");
        laptop computer04 = new laptop("Lenovo",null, "512", null, "Win11", null, "2021");

        ArrayList<laptop> laptops = new ArrayList<laptop>();
        laptops.add(computer01);
        laptops.add(computer02);
        laptops.add(computer03);
        laptops.add(computer04);
        System.out.println("All our computers: ");
        for (laptop item: laptops){
            System.out.println(item.getLaptop());
        }

        ArrayList<laptop> searchList = new ArrayList<laptop>();
        searchList = searchLaptops("Lenovo", null, "2021", laptops);

        System.out.println("Searching of computers: ");
        for (laptop item: searchList){
            System.out.println(item.getLaptop());
        }
    }
}

package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductTest {

    public static void main(String[] args) {
        Product[]  arr1 = {
                new Product("1","Belt", "gucci", 1200),
                new Product("2", "Computer", "Lg", 5000),
                new Product("3", "Phone", "Lava", 5000),
                new Product("4", "Air purifier", "Lion", 5000),
                new Product("5", "Toy", "ABC", 123),
                new Product("6", "Laptop", "Dell", 123),
                new Product("7", "Perfume", "Dior", 123),
                new Product("8", "Bus", "Hick", 123),
                new Product("9", "Car", "Hifi", 123)
        };

        List<Product> arrList = Arrays.asList(arr1);

        String s2 = arrList.stream().
                map( (p) -> p.toString())
                .collect(Collectors.joining("*****"));

        System.out.println(s2);





//        Function< List<Product>, List<Product>> mapToUpper = (p) -> {
//            if(p.getDescription().length()>=3){
//                String desc = p.getDescription();
//                char x = desc.charAt(2);
//                String newDesc = desc.substring(0,1) + Character.toUpperCase(x);
//                if(desc.length()>3){
//                    newDesc += desc.substring(3);
//                }
//                p.setDescription(newDesc);
//            }


//        for(Product p: arrList){
//            System.out.println(p.getDescription());
//            if(p.getDescription().length()>=3){
//                String desc = p.getDescription();
//                char x = desc.charAt(2);
//                String newDesc = desc.substring(0,2) + Character.toUpperCase(x);
//                if(desc.length()>3){
//                    newDesc += desc.substring(3);
//                }
//                p.setDescription(newDesc);
//            }
//        }

//        List<Product> arrList2 = arrList.stream()
//                .map( (p) -> {
//                    String newDesc = p.getDescription();
//                    if(p.getDescription().length()>=3){
//                        String desc = p.getDescription();
//                        char x = desc.charAt(2);
//                        newDesc = desc.substring(0,2) + Character.toUpperCase(x);
//                        if(desc.length()>3){
//                            newDesc += desc.substring(3);
//                        }
////                        p.setDescription(newDesc); //changes the current list
//                    }
//// without changing the current list
////                    return p;
//                    return new Product(p.getProductId(), newDesc, p.getManufacturer(), p.getPrice());
//                })
//                .collect(Collectors.toList())
//        ;
//
//        System.out.println("original list:");
//        arrList.forEach((p)-> System.out.printf("%s ", p.getDescription()) );
//        System.out.println("\nArrList2 New List:");
//        arrList2.forEach((p) -> System.out.printf("%s ", p.getDescription()));
//
//        OptionalDouble d = arrList.stream().mapToDouble(Product::getPrice).max();
//
//        System.out.println("Max Price:" + (d.isPresent() ? d.getAsDouble() : 0));
    }
}

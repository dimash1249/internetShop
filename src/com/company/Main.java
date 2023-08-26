package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ///Devices
        Laptop laptop1 = new Laptop("Lenovo", 195000, 6, 0, "corei5", 8, true);
        Laptop laptop2 = new Laptop("HP", 257000, 3, 0, "corei7", 16, true);
        Laptop laptop3 = new Laptop("Asus", 245000, 5, 0, "corei7", 16, true);
        Laptop laptop4 = new Laptop("MacBook", 965000, 0, 0, "corei9", 32, true);
        Smartphone smartphone1 = new Smartphone("Oppo", 105000, 4, 0, "qualcom700", 4, "g3");
        Smartphone smartphone2 = new Smartphone("Samsung", 236000, 4, 0, "qualcom800", 8, "g4");
        Tablet tablet1 = new Tablet("iPad", 255000, 3, 0, "qualcom700", 8, 7.9);
        Tablet tablet2 = new Tablet("Huawei", 198000, 3, 0, "qualcom600", 4, 7.0);
        ///Devices
        ///Clothes
        T_shirt shirt1 = new T_shirt("Nike", 10000, 6, 0, "S", "white", true, true, "silk");
        T_shirt shirt2 = new T_shirt("Adidas", 7000, 10, 0, "XL", "black", false, true, "polyester");
        T_shirt shirt3 = new T_shirt("Tommy Hilfiger", 17000, 3, 0, "M", "blue", false, false, "silk");
        Sneakers sneakers1 = new Sneakers("Timberland", 20000, 4, 0, "39", "yellow", true, false, "winter");
        Sneakers sneakers2 = new Sneakers("Ecco", 19000, 7, 0, "43", "grey", false, true, "summer");
        ///Clothes
        ///ArrayLists
        ArrayList<Good> goods = new ArrayList<Good>();
        goods.add(laptop1);
        goods.add(laptop2);
        goods.add(laptop3);
        goods.add(laptop4);
        goods.add(smartphone1);
        goods.add(smartphone2);
        goods.add(shirt1);
        goods.add(shirt2);
        goods.add(shirt3);
        goods.add(sneakers1);
        goods.add(sneakers2);
        goods.add(tablet1);
        goods.add(tablet2);
        ArrayList<Integer> shopcard = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        ArrayList<Smartphone> smartphones = new ArrayList<Smartphone>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        ArrayList<Tablet> tablets = new ArrayList<Tablet>();
        tablets.add(tablet1);
        tablets.add(tablet2);
        ArrayList<T_shirt> shirts = new ArrayList<T_shirt>();
        shirts.add(shirt1);
        shirts.add(shirt2);
        shirts.add(shirt3);
        ArrayList<Sneakers> sneakers = new ArrayList<Sneakers>();
        sneakers.add(sneakers1);
        sneakers.add(sneakers2);
        ///ArrayLists
        ///Menu
        while(true){
            System.out.print("PRESS [1] to open the Internet-Shop\nPRESS [0] to exit\n");
            int key0 = input.nextInt();
            ///Open
            if(key0 == 1){
                System.out.println("PRESS [1] to select USER");
                System.out.println("PRESS [2] to select ADMIN");
                System.out.println("PRESS [0] to exit");
                int key1 = input.nextInt();
                ///USER
                if(key1 == 1){
                    System.out.println("PRESS [1] to show products");
                    System.out.println("PRESS [2] to filter");
                    System.out.println("PRESS [3] to search");
                    System.out.println("PRESS [4] to buy");
                    int key2 = input.nextInt();
                    ///SHOW
                    if(key2 == 1){
                        for(int i=0;i< goods.size();i++){
                            goods.get(i).showDetails();
                        }
                    }
                    ///SHOW
                    ///FILTER
                    else if(key2 == 2){
                        System.out.println("PRESS [1] to filter DEVICES");
                        System.out.println("PRESS [2] to filter CLOTHES");
                        int key3 = input.nextInt();
                        ///DEVICES
                        if(key3 == 1){
                            System.out.println("PRESS [1] to show the DEVICES - Smartphones");
                            System.out.println("PRESS [2] to show the DEVICES - Laptops");
                            System.out.println("PRESS [3] to show the DEVICES - Tablets");
                            int key4 = input.nextInt();
                            //Smartphones
                            if(key4 == 1){
                                for(int i=0;i< goods.size();i++){
                                    if(goods.get(i) instanceof Smartphone){
                                        goods.get(i).showDetails();
                                    }
                                }
                            }
                            //Smartphones
                            //Laptops
                            else if(key4 == 2){
                                for(int i=0;i< goods.size();i++){
                                    if(goods.get(i) instanceof Laptop){
                                        goods.get(i).showDetails();
                                    }
                                }
                            }
                            //Laptops
                            //Tablets
                            else if(key4 == 3){
                                for(int i=0;i< goods.size();i++){
                                    if(goods.get(i) instanceof Tablet){
                                        goods.get(i).showDetails();
                                    }
                                }
                            }
                            //Tablets
                        }
                        ///DEVICES
                        ///CLOTHES
                        else if(key3 == 2){
                            System.out.println("PRESS [1] to show the CLOTHES for Men(boys)");
                            System.out.println("PRESS [2] to show the CLOTHES for Women(girls)");
                            int key5 = input.nextInt();
                            ///BOYS
                            if(key5 == 1){
                                for(int i=0;i<shirts.size();i++){
                                    if((shirts.get(i).isKid() == true || shirts.get(i).isKid() == false) && shirts.get(i).isMan() == true){
                                        shirts.get(i).showDetails();
                                    }
                                }
                            }
                            ///BOYS
                            ///GIRLS
                            else if(key5 == 2){
                                for(int i=0;i<shirts.size();i++){
                                    if((shirts.get(i).isKid() == true || shirts.get(i).isKid() == false) && shirts.get(i).isMan() == false){
                                        shirts.get(i).showDetails();
                                    }
                                }
                            }
                            ///GIRLS
                        }
                        ///CLOTHES
                    }
                    ///FILTER
                    ///SEARCH
                    else if(key2 == 3){
                        System.out.println("Enter the model of product: ");
                        String modelPro = input.next();
                        System.out.println("Enter the minimum price of product: ");
                        int minPrice = input.nextInt();
                        System.out.println("Enter the maximum price of product: ");
                        int maxPrice = input.nextInt();
                        for(int i=0;i< goods.size();i++){
                            if(goods.get(i).getModel().equals(modelPro) && goods.get(i).getPrice()>=minPrice && goods.get(i).getPrice()<=maxPrice){
                                goods.get(i).showDetails();
                            }
                        }
                    }
                    ///SEARCH
                    ///BUY
                    else if(key2 == 4){
                        boolean sw = true;
                        while(sw){
                            System.out.println("PRESS [1] to buy");
                            System.out.println("PRESS [2] to exit");
                            int key6 = input.nextInt();
                            //Buy
                            if(key6 == 1){

                                System.out.print("Enter the model of product: ");
                                String modelPro = input.next();
                                int q = 0;
                                for(int i=0;i< goods.size();i++){
                                    if(goods.get(i).getModel().equals(modelPro) && goods.get(i).getCount() > 0){
                                        System.out.println("The product is added to cart");
                                        shopcard.add(goods.get(i).getPrice());
                                        names.add(goods.get(i).getModel());
                                        //goods.get(i).setCount(goods.get(i).getCount() - 1);
                                        //goods.get(i).setSold(goods.get(i).getSold() + 1);
                                        if(goods.get(i).getCount() == 0){
                                            goods.remove(i);
                                        }
                                        q = 1;
                                    }
                                }
                                if(q == 0){
                                    System.out.println("The product is out of stock, please come back later!");
                                }
                            }
                            //Buy
                            //Exit
                            else if(key6 == 2){
                                System.out.print("You bought: ");
                                for(int i=0;i< names.size();i++){
                                    System.out.print(names.get(i));
                                    if(i == names.size()-1){

                                    }
                                    else{
                                        System.out.print(", ");
                                    }
                                }
                                System.out.print("\nThe total sum of your products: ");
                                int sum = 0;
                                for(int i=0;i<shopcard.size();i++) sum+= shopcard.get(i);
                                System.out.println(sum);
                                shopcard.clear();
                                names.clear();
                                sw = false;
                            }
                            //Exit
                        }
                    }
                    ///BUY
                }
                ///USER
                ///ADMIN
                else if(key1 == 2) {
                    System.out.println("PRESS [1] to show products");
                    System.out.println("PRESS [2] to add product");
                    System.out.println("PRESS [3] to delete product");
                    System.out.println("PRESS [4] to report");
                    int key7 = input.nextInt();
                    ///SHOW
                    if(key7 == 1){
                        for(int i=0;i<goods.size();i++){
                            goods.get(i).showDetails();
                        }
                    }
                    ///SHOW
                    ///ADD
                    else if(key7 == 2){
                        boolean status = true;
                        while(status){
                            System.out.println("PRESS [1] - Smartphone");
                            System.out.println("PRESS [2] - Laptop");
                            System.out.println("PRESS [3] - Tablet");
                            System.out.println("PRESS [4] - T-shirt");
                            System.out.println("PRESS [5] - Sneakers");
                            System.out.println("PRESS [0] to exit");
                            int key8 = input.nextInt();
                            //SmartPhone
                            if(key8 == 1){
                                System.out.println("Model | Price | Count | CPU | RAM | Generation");
                                String model = input.next();
                                int price = input.nextInt();
                                int count = input.nextInt();
                                //int sold = input.nextInt();
                                String cpu = input.next();
                                int ram = input.nextInt();
                                String gen = input.next();
                                Smartphone sm1 = new Smartphone(model, price, count, 0, cpu, ram, gen);
                                goods.add(sm1);
                            }
                            //SmartPhone
                            //Laptop
                            else if(key8 == 2){
                                System.out.println("Model | Price | Count | CPU | RAM | SSD");
                                String model = input.next();
                                int price = input.nextInt();
                                int count = input.nextInt();
                                //int sold = input.nextInt();
                                String cpu = input.next();
                                int ram = input.nextInt();
                                boolean ssd = input.nextBoolean();
                                Laptop lp1 = new Laptop(model, price, count, 0, cpu, ram, ssd);
                                goods.add(lp1);
                            }
                            //Laptop
                            //Tablet
                            else if(key8 == 3){
                                System.out.println("Model | Price | Count | CPU | RAM | Resolution");
                                String model = input.next();
                                int price = input.nextInt();
                                int count = input.nextInt();
                                //int sold = input.nextInt();
                                String cpu = input.next();
                                int ram = input.nextInt();
                                double res = input.nextDouble();
                                Tablet tb1 = new Tablet(model, price, count, 0, cpu, ram, res);
                                goods.add(tb1);
                            }
                            //Tablet
                            //T-shirt
                            else if(key8 == 4){
                                System.out.println("Model | Price | Count | Size | Color | isKid | isMan | Material");
                                String model = input.next();
                                int price = input.nextInt();
                                int count = input.nextInt();
                                //int sold = input.nextInt();
                                String size = input.next();
                                String color = input.next();
                                boolean iskid = input.nextBoolean();
                                boolean isMan = input.nextBoolean();
                                String material = input.next();
                                T_shirt ts1 = new T_shirt(model, price, count, 0, size, color, iskid, isMan, material);
                                goods.add(ts1);
                            }
                            //T-shirt
                            //Sneakers
                            else if(key8 == 5){
                                System.out.println("Model | Price | Count | Size | Color | isKid | isMan | Season");
                                String model = input.next();
                                int price = input.nextInt();
                                int count = input.nextInt();
                                //int sold = input.nextInt();
                                String size = input.next();
                                String color = input.next();
                                boolean iskid = input.nextBoolean();
                                boolean isMan = input.nextBoolean();
                                String season = input.next();
                                Sneakers sn1 = new Sneakers(model, price, count, 0, size, color, iskid, isMan, season);
                                goods.add(sn1);
                            }
                            //Sneakers
                            //Exit
                            else if(key8 == 0){
                                status = false;
                            }
                            //Exit
                        }
                    }
                    ///ADD
                    ///DELETE
                    else if(key7 == 3){
                        System.out.print("Enter the model of product: ");
                        String model = input.next();
                        for(int i=0;i<goods.size();i++){
                            if(model.equals(goods.get(i).getModel())){
                                goods.remove(i);
                            }
                        }
                    }
                    ///DELETE
                    ///REPORT
                    else if(key7 == 4){
                        int sum = 0;
                        for(int i=0;i<goods.size();i++){
                            int in = goods.get(i).getPrice() * goods.get(i).getSold();
                            sum += in;
                        }
                        System.out.println("Total Income: " + sum);
                    }
                    ///REPORT
                }
                ///ADMIN
                ///Exit1
                else if(key1 == 0){
                    System.exit(0);
                }
                ///Exit1
            }
            ///Open
            ///Exit0
            else{
                System.exit(0);
            }
            ///Exit0
        }
        ///Menu
    }
}

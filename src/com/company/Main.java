package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Samsung", 8500, 2018, 4600, Fabricator.samsung));
        phoneList.add(new Phone("Sony", 5800, 2016, 3500, Fabricator.sony));
        phoneList.add(new Phone("Xiaomi", 4600, 2017, 4100, Fabricator.xiaomi));
        phoneList.add(new Phone("Lenovo", 4000, 2017, 3900, Fabricator.lenovo));

        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return Integer.compare(o1.getBatteryCapacity(), o2.getBatteryCapacity());
            }
        });

        File file = new File("assortment.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println(phoneList.get(i).toString());
            printWriter.println(phoneList.get(i).toString());
        }
        System.out.println("==============================================================================================================");
        printWriter.println("==============================================================================================================");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Samsung", 14000, 2017, 16, Fabricator.samsung));
        laptopList.add(new Laptop("HP", 15000, 2015, 16, Fabricator.hp));
        laptopList.add(new Laptop("Lenovo", 12000, 2016, 8, Fabricator.lenovo));

        Collections.sort(laptopList, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Double.compare(o1.getRam(), o2.getRam());
            }
        });

        for (int i = 0; i < laptopList.size(); i++) {
            System.out.println(laptopList.get(i).toString());
            printWriter.println(laptopList.get(i).toString());
        }
        System.out.println("==============================================================================================================");
        printWriter.println("==============================================================================================================");

        List<Monitor> monitorList = new ArrayList<>();
        monitorList.add(new Monitor("Samsung", 4300, 2017, 18.5, Fabricator.samsung));
        monitorList.add(new Monitor("HP", 3900, 2016, 17, Fabricator.hp));
        monitorList.add(new Monitor("Sony", 3800, 2015, 21.5, Fabricator.sony));
        monitorList.add(new Monitor("Lenovo", 4500, 2017, 17, Fabricator.lenovo));
        monitorList.add(new Monitor("Xiaomi", 3800, 2018, 23, Fabricator.xiaomi));

        Collections.sort(monitorList, new Comparator<Monitor>() {
            @Override
            public int compare(Monitor o1, Monitor o2) {
                return Double.compare(o1.getDiagonal(), o2.getDiagonal());
            }
        });

        for (int i = 0; i < monitorList.size(); i++) {
            System.out.println(monitorList.get(i).toString());
            printWriter.println(monitorList.get(i).toString());
        }
        System.out.println("==============================================================================================================");
        printWriter.println("==============================================================================================================");

        List<PriceAndYear> assortmentList = new ArrayList<>();
        assortmentList.addAll(phoneList);
        assortmentList.addAll(laptopList);
        assortmentList.addAll(monitorList);

        System.out.println("The assortment of online store:");
        printWriter.println("The assortment of online store:");
        System.out.println();
        printWriter.println();
        for (int i = 0; i < assortmentList.size(); i++) {
            System.out.println(assortmentList.get(i).toString());
            printWriter.println(assortmentList.get(i).toString());
        }
        printWriter.println();

        System.out.println();
        System.out.println("How do you want to sort an assortment?");
        System.out.println("By price (press 1)");
        System.out.println("By price - inverse (press 2)");
        System.out.println("By date of manufacture (press 3)");
        System.out.println("By fabricator (press 4)");
        // test comment

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputString = input.readLine();

            if (Integer.parseInt(inputString) == 1) {
                Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                    @Override
                    public int compare(PriceAndYear o1, PriceAndYear o2) {
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    }
                });
                System.out.println("SORT BY PRICE");
                printWriter.println("SORT BY PRICE");
                for (int i = 0; i < assortmentList.size(); i++) {
                    System.out.println(assortmentList.get(i).toString());
                    printWriter.println(assortmentList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 2) {
                Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                    @Override
                    public int compare(PriceAndYear o1, PriceAndYear o2) {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                });
                System.out.println("SORT BY PRICE - INVERSE");
                printWriter.println("SORT BY PRICE - INVERSE");
                for (int i = 0; i < assortmentList.size(); i++) {
                    System.out.println(assortmentList.get(i).toString());
                    printWriter.println(assortmentList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 3) {
                Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                    @Override
                    public int compare(PriceAndYear o1, PriceAndYear o2) {
                        return Integer.compare(o1.getYearOfManufacture(), o2.getYearOfManufacture());
                    }
                });
                System.out.println("SORT BY DATE OF MANUFACTURE");
                printWriter.println("SORT BY DATE OF MANUFACTURE");
                for (int i = 0; i < assortmentList.size(); i++) {
                    System.out.println(assortmentList.get(i).toString());
                    printWriter.println(assortmentList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 4) {
                System.out.println("Choose the manufacturer");
                System.out.println("Sony (press 1)");
                System.out.println("Lenovo (press 2)");
                System.out.println("Xiaomi (press 3)");
                System.out.println("Samsung (press 4)");
                System.out.println("HP (press 5)");
                String inputStringChoose = input.readLine();
                System.out.println("SORT BY MANUFACTURER");
                printWriter.println("SORT BY MANUFACTURER");
                if (Integer.parseInt(inputStringChoose) == 1) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getFabricator() == Fabricator.sony) {
                            System.out.println(assortmentList.get(i));
                            printWriter.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 2) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getFabricator() == Fabricator.lenovo) {
                            System.out.println(assortmentList.get(i));
                            printWriter.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 3) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getFabricator() == Fabricator.xiaomi) {
                            System.out.println(assortmentList.get(i));
                            printWriter.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 4) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getFabricator() == Fabricator.samsung) {
                            System.out.println(assortmentList.get(i));
                            printWriter.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 5) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getFabricator() == Fabricator.hp) {
                            System.out.println(assortmentList.get(i));
                            printWriter.println(assortmentList.get(i));
                        }
                    }
                } else {
                    System.out.println("You did not make you choose.");
                }
            } else {
                System.out.println("You did not make you choose.");
            }
            printWriter.flush();
            printWriter.close();
            System.out.println();
            System.out.println("Information about the assortment of the store is recorded in a file assortmen.txt");
        } catch (NumberFormatException e) {
            System.out.println("You did not make you choose.");
        }
    }
}
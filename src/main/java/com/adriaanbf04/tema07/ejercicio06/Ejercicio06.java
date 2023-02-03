package com.adriaanbf04.tema07.ejercicio06;

import com.adriaanbf04.tema07.UtillsAdri.Array;
import com.adriaanbf04.tema07.UtillsAdri.IO;
import com.adriaanbf04.tema07.UtillsAdri.Menu;

public class Ejercicio06 {
    public Ejercicio06() {
        Menu menuOne = new Menu("GESTOR DE BICICLETAS",4);
        Menu menuTwo = new Menu("QUERIES",3);
        BycicleShop shop = new BycicleShop(10);
        int optionOne,optionTwo;
        do {
            optionOne = menuOne.executeFourOptions("1. Add bycicle","2. Delete bycicle","3. Search bycicles","4. Stock");
            switch(optionOne) {
                case 1:
                    if(!shop.newBycicle()) {
                        System.out.println("We can't add more bycicles");
                    } else {
                        System.out.println("Bycicle added");
                    }
                    break;
                case 2:
                    String ref = IO.readMessage("Introduce the reference: ",0);
                    if (!shop.deleteBycicle(ref)) {
                        System.out.println("We don't have got this bycicle");
                    } else {
                        System.out.println("Bycicle deleted");
                    }
                    break;
                case 3:
                    do {
                        optionTwo = menuTwo.executeForThree("1. Reference","2. Brand","3. Model");
                        switch(optionTwo) {
                            case 1:
                                String reference = IO.readMessage("Introduce the reference: ",0);
                                Bicycle[] res = shop.searchForReference(reference);
                                Array.showArray(res);
                                break;
                            case 2:
                                String brand = IO.readMessage("Introduce the name of the brand: ",0);
                                Bicycle[] resTwo = shop.searchForBrand(brand);
                                Array.showArray(resTwo);
                                break;
                            case 3:
                                String model = IO.readMessage("Introduce the name of the model: ",0);
                                Bicycle[] resThree = shop.searchForModel(model);
                                if (resThree != null) {
                                    Array.showArray(resThree);
                                } else {
                                    System.out.println("Not results");
                                }
                                break;
                        }
                    } while(optionTwo != 0);
                    break;
                case 4:
                    shop.listOfBycicles();
                    break;
            }
        }while(optionOne != 0);
    }
}

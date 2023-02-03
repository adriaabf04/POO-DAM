package com.adriaanbf04.tema07.ejercicio06;

import com.github.javafaker.Faker;

public class BycicleShop {
    Faker faker = new Faker();
    private Bicycle[] bycicle;

    private int count;

    public BycicleShop(int maxBycicles) {
        bycicle = new Bicycle[maxBycicles];
        count = 0;
    }

    /**
     * This method means is done with the purpose to add new bycicles
     */
    public boolean newBycicle() {
        if (count < bycicle.length) {
            addBycicle();
            return true;
        }
        return false;
    }
    /**
     * This method means is done with the purpose to add random dates in the array of bycicles
     */
    private void addBycicle() {
        String reference = "REF-" + count;
        String brand = faker.company().industry();
        String model = faker.company().name();
        int peso = faker.number().numberBetween(10,220);
        int wheelSize = faker.number().numberBetween(10,60);
        boolean containMotor = faker.bool().bool();
        String dataDone = faker.date().toString();
        int price = faker.number().numberBetween(100,1000);
        int cuantityProduct = faker.number().randomDigitNotZero();
        bycicle[count] = new Bicycle(reference,brand,model,peso,wheelSize,containMotor,dataDone,price,cuantityProduct);
        count++;
    }

    /**
     * This method is done with the purpose to "restar" the stock of the bycicles
     * @param ref (The reference --> REF-0)
     * @return If teh bycicle is deleted or not
     */
    public boolean deleteBycicle(String ref) {
        int posRef = searchPosReference(ref);
        boolean valid = posRef >= 0;
        if (valid) {
            int stock = bycicle[posRef].getCuantityProduct();
            if (stock > 0) {
                stock--;
                bycicle[posRef].setCuantityProduct(stock);
            } else {
                bycicle[posRef] = bycicle[count-1];
                bycicle[posRef] = null;
                count--;
            }
            return true;
        }
        return false;
    }

    /**
     * This method is done with the purpose to search the position of the object with the array
     * @param reference
     * @return The position of the object
     */
    private int searchPosReference(String reference) {
        for (int i = 0; i < count; i ++) {
            if (bycicle[i].getReference().equals(reference)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method is donde with the purpose to print all the bycicles
     */
    public void listOfBycicles() {
        for (int i = 0; i < count; i ++) {
            System.out.println(bycicle[i].toString());
        }
    }

    /**
     * This method id done with the purpose to search all the bycicles that has got the same reference
     * @param reference
     * @return
     */
    public Bicycle[] searchForReference(String reference) {
        int sizeArray = 0;
        int i,j;
        for (i = 0; i < count; i++) {
            String ref = bycicle[i].getReference();
            if (ref.equalsIgnoreCase(reference)) {
                sizeArray++;
            }
        }
        i = 0 ;
        Bicycle[] res = new Bicycle[sizeArray];
        for (j = 0; j < count; j++) {
            String ref = bycicle[j].getReference();
            if (ref.equalsIgnoreCase(reference)) {
                res[i] = bycicle[j];
                i++;
            }
        }
        return res;
    }

    /**
     * This method id done with the purpose to search all the bycicles that has got the same brand
     * @param brand
     * @return
     */
    public Bicycle[] searchForBrand(String brand) {
        int sizeArray = 0;
        int i,j;
        for (i = 0; i < count; i++) {
            String brandSearched = bycicle[i].getBrand();
            if (brandSearched.equalsIgnoreCase(brand)) {
                sizeArray++;
            }
        }
        i = 0;
        Bicycle[] res = new Bicycle[sizeArray];
        for (j = 0; j < sizeArray; j++) {
            String brandSearched = bycicle[j].getBrand();
            if (brandSearched.equalsIgnoreCase(brand)) {
                res[i] = bycicle[j];
                i++;
            }
        }
        return res;
    }

    /**
     * This method id done with the purpose to search all the bycicles that has got the same model
     * @param model
     * @return
     */
    public Bicycle[] searchForModel(String model) {
        int sizeArray = 0;
        int i,j;
        for (i = 0; i < count; i++) {
            String modelSearched = bycicle[i].getModel();
            if (modelSearched.equalsIgnoreCase(model)) {
                sizeArray++;
            }
        }
        i = 0;
        Bicycle[] res = new Bicycle[sizeArray];
        for (j = 0; j < sizeArray; j++) {
            String modelSearched = bycicle[j].getModel();
            if (modelSearched.equalsIgnoreCase(model)) {
                res[i] = bycicle[j];
                i++;
            }
        }
        return res;
    }
}

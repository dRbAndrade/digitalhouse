package main.java.aula1026;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothesFactoryTest {

    static Clothes meia1;
    static Clothes meia2;
    static Clothes meia3;
    static Clothes meia4;
    static Clothes meia5;
    static Clothes camisa1;
    static Clothes camisa2;
    static Clothes camisa3;
    static Clothes camisa4;
    static Clothes camisa5;

    @BeforeAll
    static void initiate(){

        meia1 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.SOCKS,true,true);
        meia2 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.SOCKS,true,true);
        meia3 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.SOCKS,true,true);
        meia4 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.SOCKS,true,true);
        meia5 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.SOCKS,true,true);
        camisa1 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.TSHIRT,true,true);
        camisa2 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.TSHIRT,true,true);
        camisa3 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.TSHIRT,true,true);
        camisa4 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.TSHIRT,true,true);
        camisa5 = ClothesFactory.generateClothes(ClothesSize.S,ClothesType.TSHIRT,true,true);

    }

    @Test
    void testFactorySize(){
        assertEquals(2,ClothesFactory.getClothesMap().size());
    }
    @Test
    void testSameObject(){
        assertEquals(meia1,meia2);
    }
    @Test
    void testDifferentObject(){
        assertNotEquals(meia1,camisa1);
    }
    @Test
    void testClothesQuantity(){
        assertEquals(5,ClothesFactory.getClothesMap().get(meia1));
    }


}
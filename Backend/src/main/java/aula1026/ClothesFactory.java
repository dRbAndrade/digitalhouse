package main.java.aula1026;

import java.util.HashMap;
import java.util.Map;

public class ClothesFactory {

    private static final Map<Clothes, Integer> clothesMap = new HashMap<>();

    public static Clothes generateClothes(ClothesSize size, ClothesType type, boolean isNew, boolean imported){

        Clothes clothes = new Clothes(size,type,isNew,imported);

        if(clothesMap.containsKey(clothes))clothesMap.put(clothes,clothesMap.get(clothes)+1);
        else clothesMap.put(clothes,1);

        return clothesMap.keySet().stream().filter(e->e.equals(clothes)).findAny().get();

    }
    public static Clothes getClothes(Clothes clothes){
        return getClothes(clothes.getSize(),clothes.getType(), clothes.isNew(), clothes.isImported());
    }

    public static Clothes getClothes(ClothesSize size, ClothesType type, boolean isNew, boolean imported){
        Clothes clothes = new Clothes(size, type, isNew, imported);
        return clothesMap.containsKey(clothes) ?
                clothesMap.keySet().stream().filter(e->e.equals(clothes)).findAny().get()
                : null;

    }

    public static Map<Clothes, Integer> getClothesMap() {
        return clothesMap;
    }

}

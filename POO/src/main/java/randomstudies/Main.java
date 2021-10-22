package randomstudies;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Pessoa joao = new Pessoa();
        joao.setNome("João");
        Field[] fields = joao.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
            field.setAccessible(true);
            System.out.println(field.get(joao));
        }

    }

}

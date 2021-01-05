package HomeWork1.HomeWork4;


import java.util.Arrays;

public class DataContainerMain {
    public static <T> void main(String[] args) {


        Number[] array1 = {7,2,3,null,6,null};
        DataContainer<Number> container1 = new DataContainer<>(array1);
        container1.add(777);
        System.out.println("Массив с числом 777: "+Arrays.toString(container1.getItems()));
        System.out.println("Значение ячейки  "+container1.get(2));
        System.out.println(container1.delete(2));
        System.out.println(container1.Delete(6));

        Number[] array2 = {1,2,3,4};
        DataContainer<Number> container2 = new DataContainer<>(array2);
        container2.add(5);
        System.out.println("Массив с числом 5: "+Arrays.toString(container2.getItems()));
        System.out.println("Значение ячейки " + container2.get(3));

        Number[] array3 = {null,2,null,4};
        DataContainer<Number> container3 = new DataContainer<>(array3);
        container3.add(null);
        System.out.println("Массив с числом null : "+Arrays.toString(container3.getItems()));
        System.out.println("Значение ячейки " + container3.get(2));

    }

}

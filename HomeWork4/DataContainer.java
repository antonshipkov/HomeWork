package HomeWork1.HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    //передаем массив чисел в контейнер
    public DataContainer(T[]data){
        this.data = data;
    }


    public int add(T item){

        //проверяем дополнительный элемент на null
        System.out.println("Первоначальный Массив  "+ Arrays.toString(data));
        if (item==null){
            int k = -1;
            //System.out.println("Элемент в массиве: " + k);
            return k;
        }
         //проверяем элементы массива на null, при нахождении первого меняем на новый
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                //System.out.println("Элемент в массиве: " + i);
                return i;
            }
        }
         //прогоняем элементы массива до последнего индекса, добавляем доп ячейку в массиве
        for (int j = 0; j <= data.length; j++) {
            if (j == data.length) {
                T[] newData = Arrays.copyOf(data,data.length+1);
                newData[newData.length - 1]= item;
                int rightborder = data.length;
                data = newData;
                //System.out.println("Элемент в массиве: " + rightborder);

                return rightborder;
            }

        }
        return 0;

    } //возвращаем значение ячейки массива переданного по индексу
    public T get(int index){
        if(index > data.length){
            return null;
        }
        return data[index];

    }
    //возвращаем  сохраненный массив
    public T[] getItems(){
        return this.data;
    }

    public boolean delete(int index){

        if (index<data.length){
            data[index] = null;
            // смещаем значения на один индекс от null ячейки справа,
            // уменьшаем длину массива на одну ячейку
            for (int i = index + 1; i < data.length; i++) {
                data[i-1] = data[i];
            }
            data = Arrays.copyOf(data,data.length-1);
            return true;
        }
        return false;
    }

    public boolean Delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                data[i] = null;
                //если в массиве чисел есть переданное число,
                // делаем его null и справа смещаем все значения
                // на один индекс, уменьшаем длину массива на одну ячейку
                for (int j = i + 1; j < data.length; j++) {
                    data[j - 1] = data[j];
                }
                data = Arrays.copyOf(data, data.length - 1);

                return true;
            }
        }
        return false;
    }
    public void sort(Comparator<T> comparator){
        Arrays.sort(data,comparator);
    }

    public String toString() {
        Arrays.fill(data, null);
        return Arrays.toString(data);
    }


}











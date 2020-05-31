import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SearchNodTest {
    SearchNod arr = new SearchNod();
    @org.junit.jupiter.api.Test
    public void simpleTest(){
        int[] b = {12,18,66,22};//первые три числа имеют нод=6,
        // а с последним нод=2, проверяю качественно ли обрабатывается последний элемент
        int actual = arr.search_nod(b);
        int expected = 2;
        assertEquals(expected,actual);
        int[] c = {10,10,10,10};
        actual = arr.search_nod(c);
        expected = 10;
        assertEquals(expected,actual);
        int[] a = {};//проверка с пустым массивом
        actual = arr.search_nod(a);
        expected = 1001;//result = 1001 изначально
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void stressRandomTest(){//вызывает функцию большое количество раз с различным набором данных
        for (int i=0;i<10001;i=i+100){
        System.out.println(arr.search_nod(generateArrRandom(1000+i)));}
    }
    @org.junit.jupiter.api.Test
    public void stressSimpleTestOne(){
        int actual = arr.search_nod(generateArrSimple(10000));
        int expected = 1;
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void stressSimpleTestTwo(){
            int actual = arr.search_nod(generateArrSimple(100000));
            int expected = 1;
            assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void stressSimpleTestThree(){
            int actual = arr.search_nod(generateArrSimple(1000000));
            int expected = 1;
            assertEquals(expected,actual);
    }
    private int[] generateArrSimple(int length) {//генерирует массив от 1 до n, в котором нод=1
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i+1;
        }
        return arr;
    }
    private int[] generateArrRandom(int length) {//генерирует массив случайных чисел величиной до 1000
 	        int[] arr = new int[length];
 	        Random random = new Random();
 	        for (int i = 0; i < length; i++) {
 	            arr[i] = random.nextInt(1000);
 	        }
 	        return arr;
 	    }
 	}

package Queue_Practise;

import java.util.*;

public class QueuePrac {
    public Queue<Integer> Nums(){
        Queue<Integer> my_numbers = new PriorityQueue<>(Collections.reverseOrder());
        my_numbers.add(1);
        my_numbers.add(11);
        my_numbers.add(41);
        my_numbers.add(-2);
        my_numbers.add(6);
        my_numbers.add(-1);
        System.out.println(my_numbers);
        System.out.println(my_numbers.peek());
        my_numbers.remove();
        System.out.println(my_numbers.peek());
        return my_numbers;

    }

    public Queue<String> City(){
        Queue<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Ahmd");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Banglore");
        cities.remove();
        return cities;

    }

}

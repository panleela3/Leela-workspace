package com.java.lambda;

import java.util.*;

public class ComparatorComparableEx {
    public static void main(String[] args) {
        Employee leela = new Employee(501, "Leela", 10000);
        Employee bala = new Employee(502, "Bala", 11000);
        Employee naga = new Employee(503, "Naga", 12000);
        Employee sai = new Employee(504, "Sai", 13000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(sai);
        employeeList.add(bala);
        employeeList.add(naga);
        employeeList.add(leela);


       /* System.out.println("before sorting the list is:" );

        employeeList.forEach(e-> {
            System.out.println(e);
        });*/

        /*for (Employee employee : employeeList) {
            System.out.println(employee);
        }*/
        /*Iterator<Employee> itr= employeeList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }*/
        // Collections.sort(employeeList, (obj1, obj2) -> obj1.getName().compareTo(obj2.getName())); //no problem, String implements Comparable<String>.
                                                                //That's why Employee doesn't need to implement Comparable.
        // employeeList.sort((obj1,obj2)->obj1.getId()-obj2.getId());-->simillar to comparing which (getId()) returns an (Integer)
        // Java auto-unboxes it to int to perform the subtraction.So the lambda expression returns a primitive int, which is exactly what the Comparator expects.
        //              better safer to use comparingInt()


        // Collections.sort(employeeList, Comparator.comparing(Employee::getName));--> returns String
        //String implements Comparable<String>.

        /*Stream<Employee> filteredStream=employeeList.stream().filter(( name) -> name.getName().length() > 3).sorted((o1, o2) -> o1.getId()-o2.getId());
        filteredStream.forEach(System.out::println);
        //filteredStream.toList();*/
        /* map():
        List<Double> mapResult=employeeList.stream().
                filter((employee) -> employee.getSalary() > 10000).
                map(employee -> employee.getSalary() * 3).toList();
        mapResult.forEach(System.out::println);*/
        //flatMap(Function) simple:

        List<List<Integer>> flatMapNumbers= new ArrayList<>();

        flatMapNumbers.add(Arrays.asList(1,2,3,4));
        flatMapNumbers.add(Arrays.asList(6,7,8,9));
        flatMapNumbers.add(Arrays.asList(2,6,8,1));

        // flatMapNumbers.forEach(list -> list.forEach(System.out::println));
       /* for (List<Integer> list:flatMapNumbers)
        {
            for (int n :list){
                System.out.println(n);
            }
        }*/

       /* int sum=flatMapNumbers.stream().flatMap(list -> list.stream())
                .map(n->n*2).distinct().sorted().reduce(0, (a,b) -> a+b);
        long count=flatMapNumbers.stream().flatMap(list -> list.stream())
                .map(n->n*2).distinct().count();
        System.out.println(count);*/

       Optional<Integer> minResult = flatMapNumbers.stream().flatMap(list -> list.stream())
                .map(n->n*2).peek(System.out::println).min((o1, o2) -> {
                    // System.out.println("min is:");
                    int min=o1-o2;
                    return min;
                });
        System.out.println("Min val is:"+ minResult.get());
        /*Set<Employee> employeeSet = new TreeSet<>(Comparator.comparing(Employee::getId));
        employeeSet.add(naga);
        employeeSet.add(sai);
        employeeSet.add(bala);
        employeeSet.add(leela);*/
//        System.out.println("After sorting the list is:");
//        employeeSet.forEach(System.out::println);


    }
}

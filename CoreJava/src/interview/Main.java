package interview;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Employee leel = new Employee("Leela", 101, 1000);
        Employee jai = new Employee("jai", 102, 2000);
        Employee sai = new Employee("sai", 103, 3000);
        Employee bala = new Employee("bala", 104, 4000);
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("Leela", leel);
        employeeMap.put("jai", jai);
        employeeMap.put("Leela", sai);
        employeeMap.put("bala", bala);*/
        /*employeeMap.entrySet().stream().
                filter(entry->entry.getKey()
                        .equals("Leela")).
                forEach((entry-> System.out.println(entry.getKey()+"" +
                        " "+entry.getValue())));*/
        /*for (Map.Entry<String, Employee> entry:employeeMap.entrySet()){
        if (entry.getKey().equals("Leela")){
            System.out.println(entry.getKey()+ " "+entry.getValue().getSalary());
        }

        }*/
    /*// fetching  values from employeeMap
        for (Employee employeeEntry: employeeMap.values()){
            System.out.println("employeeMap values: " + employeeEntry);
        }*/

        //counting the occurences of letters in a string
        /*String word = "leeelavathi";
        Map<Character, Long> occurences = word.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()));
        System.out.println("Occurances are :" + occurences);
        Optional<Long> maxVal = occurences.values().stream().max(Long::compare);
        //System.out.println(maxVal.get());
        occurences.entrySet().stream().forEach(e-> {
            if (e.getValue()==maxVal.get()){
                System.out.println(e.getKey()+"="+e.getValue());
            }});
*/
        //System.out.println("repeatedFirst:"+res);

        List<Employee> employeeList = Arrays.asList(new Employee("Bala",101,100000, LocalDate.of(2021,3,3)),
                new Employee("Leela", 102 , 60000 , LocalDate.of(2017,3,20)),
                new Employee("Naga",103,40000,LocalDate.of(2019,07,29)),
                new Employee("Sai",104,30000,LocalDate.of(2021,3,3)));
        Map<Integer,List<Employee>> groupedByYear =employeeList.stream().
                collect(Collectors.groupingBy(employee -> employee.getJoiningDate().getYear()));
        for(Map.Entry<Integer,List<Employee>> entry: groupedByYear.entrySet()){
            if (entry.getKey() == 2021){
                System.out.println("Year:"+entry.getKey());
                entry.getValue().forEach(e->System.out.println(" "+e));
            }
        }
        //System.out.println(groupedByYear);
    }
}

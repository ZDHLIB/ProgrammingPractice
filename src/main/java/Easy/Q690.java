package Easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q690 {
    //bfs
    public int getImportance(List<Employee> employees, int id) {
        Queue<Employee> queue = new LinkedList<>();
        HashMap<Integer, Employee> map = new HashMap<>();
        for(Employee employee : employees){
            map.put(employee.id, employee);
        }
        int res = 0;
        queue.offer(map.get(id));
        while(!queue.isEmpty()){
            Employee employee = queue.poll();
            res += employee.importance;
            for(Integer e : employee.subordinates){
                queue.offer(map.get(e));
            }
        }
        return res;
    }

    //dfs
    public int getImportance2(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for(Employee employee : employees){
            map.put(employee.id, employee);
        }
        return dfs(map,id);
    }

    public int dfs(HashMap<Integer, Employee> map, int id){
        Employee employee = map.get(id);
        int res = employee.importance;
        for(int e : employee.subordinates){
            res += dfs(map, e);
        }
        return res;
    }


    class Employee{
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}

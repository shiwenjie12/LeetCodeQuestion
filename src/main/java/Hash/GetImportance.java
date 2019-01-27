package Hash;

import java.util.HashMap;
import java.util.List;

public class GetImportance {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    int res = 0;

    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> hash = new HashMap<>(employees.size());
        for (int i = 0; i < employees.size(); i++) {
            hash.put(employees.get(i).id, employees.get(i));
        }
        computeImportance(hash, id);
        return res;
    }

    private void computeImportance(HashMap<Integer, Employee> hashMap, int id) {
        Employee employee = hashMap.get(id);
        if (employee != null) {
            res += employee.importance;
            for (int i = 0; i < employee.subordinates.size(); i++) {
                computeImportance(hashMap, employee.subordinates.get(i));
            }
        }
    }
}

package problem;

import java.util.HashMap;

public class DepartmentDAO {

    private static HashMap<Integer, Department> departments = new HashMap<Integer, Department>();

    static {
        Department hr = new Department(1, "Human Resources");
        Department rnd = new Department(2, "Research and Development");

        departments.put(hr.getId(), hr);
        departments.put(rnd.getId(), rnd);
    }

    public static Department getDepartment(Integer id) {
        return departments.get(id);
    }
}

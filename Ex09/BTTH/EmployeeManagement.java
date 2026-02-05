package Ex09.BTTH;

public class EmployeeManagement {
        private String id;
        private String name;
        private double basicSalary;
        public EmployeeManagement(String id, String name, double basicSalary) {
            this.id = id;
            this.name = name;
            this.basicSalary = basicSalary;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getBasicSalary() {
            return basicSalary;
        }
        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }
}

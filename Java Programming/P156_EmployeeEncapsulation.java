class Employee {
    public String name; // 누구나 접근 가능
    String department;  // default 접근제어자 (같은 패키지만)
    private int salary = 5000; // 외부에서 직접 접근 불가

    // 부서 getter (외부에서 읽기만 가능)
    public String getDepartment() {
        return department;
    }

    // 급여 getter
    public int getSalary() {
        return salary;
    }

    // 급여 setter
    public void setSalary(int salary) {
        if (salary >= 0 && salary <= 10000) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("급여는 0 이상 10000 이하만 가능합니다.");
        }
    }
}


public class P156_EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "홍길동"; // public이므로 접근 가능
        System.out.println(e.name);

        System.out.println(e.getSalary()); //5000 출력
        e.setSalary(8000); // 급여 수정
        System.out.println(e.getSalary()); // 8000 출력

//        e.setSalary(15000); // 예외 발생
//        e.setSalary(-1000); // 예외 발생
        e.department = "영업팀"; // default 접근 -> 같은 패키지면 가능
        System.out.println(e.getDepartment()); //getter는 public
//        e.setDepartment("개발팀"); //setter 없음 -> 수정 불가
    }
} 
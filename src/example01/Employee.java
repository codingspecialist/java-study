package example01;

public class Employee {
    // 1. 상태만들기 + getter, setter
    // 2. 생성자 만들기 (오버로딩)
    private int empNo; // 사원번호

    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }

    public int getEmpNo(){
        return empNo;
    }
}

package example01;

public class EmpApp {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[10];

        // 1. 직원 3명 생성 (생성자 3개 사용)
        Employee e1 = new Employee("홍길동", "0102222");
        Employee e2 = new Employee("장보고", "0103333", "개발팀");
        Employee e3 = new Employee("임꺽정", "0104444", "인사팀", 1000, 100, "1111", "사원");
        // e4~e10까지 만들기

        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;
        // e4~e10까지 배열에 담기

        // 2. 상태변경
        e1.setDept("개발팀");
        e1.setEmpNo(1001);
        e1.setSalary(500);
        e1.setAccount("5555");
        e1.setPosition("대리");
        
        // e2, ~~ e10 채워넣기
        e2.setPosition("과장");

        // 3. printInfo 호출
        for (int i = 0; i < 3; i++) { // for Each 써보기
            empArr[i].printInfo();
        }

        // 4. 전체직원의 월급
        int totalMonthSalary = 0;
        for (int i = 0; i < 3; i++) {
            totalMonthSalary = totalMonthSalary + empArr[i].getSalary();
        }
        System.out.println("기본 월급 총액 = " + totalMonthSalary + "원");

        // 5. 전체직원의 연봉
        int totalYearSalary = 0;
        for (int i = 0; i < 3; i++) {
            totalYearSalary = totalYearSalary + empArr[i].getSalary()*12;
        }
        System.out.println("기본 월급 총액 = " + totalYearSalary + "원");
        
        // 6. 전체직원의 연봉+보너스
        int totalYearSalaryWithBonus = 0;
        for (int i = 0; i < 3; i++) {
            int 연봉 = empArr[i].getSalary()*12;
            int 연봉과보너스 = 0;
            if(empArr[i].getPosition().equals("사원")){
                연봉과보너스 = (int) (연봉 * 1.1);
            }else if(empArr[i].getPosition().equals("대리")){
                연봉과보너스 = (int) (연봉 * 1.2);
            }else if(empArr[i].getPosition().equals("과장")){
                연봉과보너스 = (int) (연봉 * 1.3);
            }else{
                연봉과보너스 = (int) (연봉 * 1.4);
            }
            totalYearSalaryWithBonus = totalYearSalaryWithBonus + 연봉과보너스;
        }
        System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus + "원");

        // 7. 임꺽정 사원 승진시키기
        for (int i = 0; i < 3; i++) {
            if(empArr[i].getName().equals("임꺽정")){
                // 승진시키기 (대리 -> 과장)
                if(empArr[i].getPosition().equals("사원")){
                    empArr[i].setPosition("대리");
                }else if(empArr[i].getPosition().equals("대리")){
                    empArr[i].setPosition("과장");
                }else if(empArr[i].getPosition().equals("과장")){
                    empArr[i].setPosition("부장");
                }
            }
        }
        for (int i = 0; i < 3; i++) { // for Each 써보기
            empArr[i].printInfo();
        }

        // 8. 월급이체
        for(int i=0; i<3; i++){
            System.out.println("[급여 이체 완료] "+empArr[i].getName()+"님께 3000000원이 "+empArr[i].getAccount()+" 계좌로 지급되었습니다.");
        }
    }
}

package learn_java_3;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月17日 下午4:59:08 
 * 类说明 
 */
public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		for(Employee e: staff){
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
	}
}

package learn_java_4;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��18�� ����4:03:54 
 * ��˵�� 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		for(Person p: people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}
}

package learn_java_2;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��16�� ����10:30:02 
 * ��˵�� 
 */
//public class ParamTest {
//	public static void main(String[] args) {
//		/*
//		 * ����1�����������޸���ֵ����
//		 */
//		System.out.println("Test tripleValue");
//		double percent =10;
//		System.out.println("Before: percent=" + percent);
//		tripleValue(percent);
//		System.out.println("After: percent=" + percent);
//		
//		/*
//		 * ����2�����������޸Ķ��������״̬
//		 */
//		System.out.println("\nTesting tripleSalary:");
//		Employee harry = new Employee("Harry", 50000);
//		System.out.println("Before: salary="+ harry.getSalary());
//		tripleSalary(harry);
//		System.out.println("After: salary=" + harry.getSalary());
//		
//		/*
//		 * ����3���������ܸ��µĶ�����������
//		 */
//		System.out.println("\nTest swap");
//		Employee a = new Employee("Alice", 70000);
//		Employee b = new Employee("Bob", 60000);
//		System.out.println("Before: a=" + a.getName());
//		System.out.println("Before: b=" +b.getName());
//		swap(a, b);
//		System.out.println("After: a=" + a.getName());
//		System.out.println("After: b=" + b.getName());
//	}
//
//	private static void tripleValue(double x) { //not work
//		// TODO Auto-generated method stub
//		x = 3 * x;
//		System.out.println("�������: x=" + x);
//	}
//	
//	public static void tripleSalary(Employee x) //works
//	{
//		x.raiseSalary(200);
//		System.out.println("�������: salary:" + x.getSalary());
//	}
//	
//	public static void swap(Employee x, Employee y) // not waork
//	{
//		Employee temp = x;
//		x = y;
//		y = temp;
//		System.out.println("�������: x=" +x.getName());
//		System.out.println("�������: y=" + y.getName());
//	}
//}


//class Employee
//{
//	private String name;
//	private double salary;
//	
//	public Employee(String n, double s)
//	{
//		name = n;
//		salary = s;
//	}
//	
//	public String getName()
//	{
//		return name;
//	}
//	
//	public double getSalary()
//	{
//		return salary;
//	}
//	
//	public void raiseSalary(double byPercent)
//	{
//		double raise = salary * byPercent /100;
//		salary += raise;
//	}
//	
//}

package learn_java_4;

/**
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月19日 上午10:39:53 类说明
 */
public class TestOrder {

	public static void main(String[] args) {
		Order o1 = new Order(1001, "AA");
		Order o2 = new Order(1001, "AA");
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}
}

class Order {
	private int order;
	private String orderName;

	public Order(int order, String orderName) {
		super();
		this.order = order;
		this.orderName = orderName;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (order != other.order)
			return false;
		if (orderName == null) {
			if (other.orderName != null)
				return false;
		} else if (!orderName.equals(other.orderName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [order=" + order + ", orderName=" + orderName + "]";
	}

	// public boolean equals(Object obj) {
	// if (this == obj) {
	// return true;
	// } else if (obj instanceof Order) {
	// Order o1 = (Order) obj;
	// return this.order == o1.order && this.orderName == o1.orderName;
	// } else {
	// return false;
	// }
	//
	// }
}
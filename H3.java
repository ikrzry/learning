package e2;
//class Book Method updatePrice,实现更改某书价格
//若价格>150，更改为150，>100，更改为100，否则不变
public class H3 {

	public static void main(String[] args) {
		Book a1 = new Book();
		int price1 = a1.updatePrice(110);
		System.out.println(price1);
	}

}

class Book{
	public int updatePrice(int price) {
		if(price > 150) {
			return 150;
		}else if(100 < price && price<= 150) {
			return 100;
		}else {
			return price;
		}
	}
}

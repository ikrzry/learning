package e2;
//class Book Method updatePrice,ʵ�ָ���ĳ��۸�
//���۸�>150������Ϊ150��>100������Ϊ100�����򲻱�
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

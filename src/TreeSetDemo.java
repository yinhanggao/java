import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> test = new TreeSet<>();

		System.out.print("�q����1��100����X10�Ӥ����ƪ��Ʀr");

		for (int i = 0; i <= 10; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 0;
				if(test.add(num)) {
					System.out.print("��"+i+"���X"+num+"\n");
					break;
				}
			}
		}
		
		System.out.print(test);

	}

}

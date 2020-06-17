import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> test = new TreeSet<>();

		System.out.print("電腦游1到100中選出10個不重複的數字");

		for (int i = 0; i <= 10; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 0;
				if(test.add(num)) {
					System.out.print("第"+i+"號碼"+num+"\n");
					break;
				}
			}
		}
		
		System.out.print(test);

	}

}


package Day06Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class ComparatorMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("vishnu",29));
		studentList.add(new Student("ajay",67));
		studentList.add(new Student("tarun",12));
		studentList.add(new Student("diva",74));
		System.out.println(studentList.toString());
		
		Collections.sort(studentList,(s1,s2)->s1.age - s2.age);
		System.out.println(studentList.toString());
//		studentList.sort(Comparator.comparing(s -> s.name).reversed();
		Collections.sort(studentList,(s1,s2)->s2.name.compareTo(s1.name));
		System.out.println(studentList.toString());
		
		
		List<Integer> newlist = new ArrayList<>(Arrays.asList(1,3,5,7,98));
		System.out.println(newlist);
		newlist = newlist.subList(0, 5);
		System.out.println(newlist);
		newlist.replaceAll(n -> n*10);
		System.out.println(newlist);
		newlist.removeIf(n -> n >30);
		System.out.println(newlist);
	}

}

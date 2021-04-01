package p131;

import java.util.Arrays;

public class ReferenceType4 {

	public static void main(String[] args) {
		
		// �迭 ���� ����
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("arr1 == arr2 :	"+(arr1 == arr2));
		// ���� ������, �ּҰ� �ٸ�
		
		int[] arr3 = arr1;
		System.out.println("arr1 == arr3 :	"+(arr1 == arr3));
		
		arr3[0] = 4;
		System.out.println("arr3[0] :	"+arr3[0]);
		System.out.println("arr1[0] :	"+arr1[0]);
		// �ּҰ� ����
		
		int[] arr4 = Arrays.copyOf(arr1, 3);
		
		arr4[0] = 8;
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr4[0] : "+arr4[0]);
		// ���� ��, �ٸ� �ּ� �����ϱ�
	}
}

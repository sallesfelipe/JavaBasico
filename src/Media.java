
public class Media {

	public static void main(String[] args) {

		int[] nums1 = { 8, 9, 7 };
		int[] nums2 = { 4, 5, 6 };
		int sum = 0;
		int sum2 = 0;

		for (int num : nums1) {
			sum += num;
		}

		for (int num : nums2) {
			sum2 += num;
		}
		int media1 = sum / nums1.length;
		int media2 = sum2 / nums2.length;
		double totalMedia = ((double) (media1 + media2) / 2);

		System.out.println(media1);
		System.out.println(media2);
		System.out.println(media1 + media2);
		System.out.println(totalMedia);

	}
}

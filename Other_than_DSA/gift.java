import java.util.PriorityQueue;

class Solution {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        long totalSum = 0;
        for (int gift : gifts) {
            maxHeap.add(gift);
            totalSum += gift;
        }
        
        System.out.println("Total sum" + totalSum);

        while (k > 0 && !maxHeap.isEmpty()) {
            int largest = maxHeap.poll();
            System.out.println("largest:"+largest);
            int reducedGift = (int) Math.sqrt(largest);

            totalSum -= largest;
            totalSum += reducedGift;

            maxHeap.add(reducedGift);
            k--;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] gifts = { 25, 64, 9, 4, 100 };
        int k = 4;

        System.out.println(pickGifts(gifts, k));
    }
}

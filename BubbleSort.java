import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int arrayOfInts[] = {10,3,6,2,8,1,9,5,4};
        System.out.println(Arrays.toString(arrayOfInts));
        int[] sortedArray = bs.sortUsingBubbleSort(arrayOfInts);
        System.out.println(Arrays.toString(sortedArray));

    }

    int[] sortUsingBubbleSort(int[] numbers){
        int placeHolder=0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0; j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    placeHolder = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = placeHolder;
                }
            }
        }
        return numbers;
    }
}
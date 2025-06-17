class Main {
     
     public static void main(String[] args) {
         
        int elements[] = new int[]{2,5,9,8,1};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(Integer element : elements) {
            if(element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            }
            else if(element > secondLargest && element < firstLargest) {
                secondLargest = element;
            }
        }

        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
        
     }
}
    public class Main{

        public static void main(String[] args){
            int[] array = new int[] { 1, 3, 4, 5, 6, 7, 8, 9, 10};

            int minValue = array[0];
                for (int i=1; i<array.length; i++) {
                    if (array[i]< minValue) {
                        minValue = array[i];
                    }
                }
                System.out.println(minValue);
        }
    }
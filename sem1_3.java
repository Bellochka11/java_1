
import java.util.Arrays;

// Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

// [2 4 1 5 3 3 3 3 3]

// Работать разрешается только с 1 массивом.

public class sem1_3 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 4, 3, 3, 1, 5, 3, 3 };
        int value = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                counter += 1;
            }
        }
        for (int i = 0; i < array.length - counter; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = value;
                i--;
            }
        }
        System.out.println(Arrays.toString(array)); //toString перевод к строке
    }
}

// for (int i = 1; i < nums.length; i++) { метод пузырька 2 решение
//     for (int j = i; j < nums.length; j++) {
//         if (nums[j-1] == 3) {
//             swp = nums[j-1];
//             nums[j-1] = nums[j];
//             nums[j] = swp;
//         }
//     }
// System.out.println(Arrays.toString(nums));

// }

// import java.util.Arrays; 2 решение

// public class TaskTwo
// {public static void main(String[] args) {
// int[] array = new int[] {3,2,4,3,3,1,5,3,3};
// int val = 3;
// int counter = 0;
// for (int i = 0; i < array.length; i++) {
// if (array[i] != val) {
// array[counter] = array[i];
// array[i] = val;
// counter += 1;
// }
// }
// System.out.println(Arrays.toString(array));
// }
// }
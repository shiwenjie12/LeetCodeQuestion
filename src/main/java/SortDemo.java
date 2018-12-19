import org.omg.CORBA.INTERNAL;

import javax.swing.plaf.PanelUI;
import javax.swing.text.rtf.RTFEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDemo {
    public static void main(String[] args){
        String[] array = {"1","2","3","4"};
        listAll(Arrays.asList(array),"");
        System.out.println();
    }
    private static void listAll(List<String> strings, String s) {
        System.out.println(s);
        for(int i = 0; i <strings.size() ; i++){
            List temp = new ArrayList(strings);
            listAll(temp , s + temp.remove(i));
        }
    }

    // 冒泡
    public static int[] BubbleSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++){
            for (int y = 0; y < length - 1 - i; y++){
                if (array[y] > array[y + 1]){
                    int temp = array[y + 1];
                    array[y + 1] = array[y];
                    array[y] = temp;
                }
            }
        }
        return array;
    }

    // 选择
    public static int[] SelectionSort(int[] array){
        int length = array.length;
        int minIndex;
        for (int i = 0; i < length -1;i++){
            minIndex = i;
            for (int y = i + 1; y < length; y++){
                if (array[y] < array[minIndex])
                    minIndex = y;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // 插入
    public static int[] InsertionSort(int[] array){
        int length = array.length;
        int perIndex,current;
        for (int i = 0;i < length;i++){
            current = array[i];
            perIndex = i - 1;
            while (perIndex >= 0 && array[perIndex] > current){
                array[perIndex+1] = array[perIndex];
                perIndex--;
            }
            array[perIndex + 1] = current;
        }
        return array;
    }

    public static int[] ShellSort(int[] arr) {
        int len = arr.length,
                temp,
                gap = 1;
        while (gap < len / 3) {          // 动态定义间隔序列
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap = (int)Math.floor(gap / 3)) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                int j;
                for (j = i-gap; j > 0 && arr[j]> temp; j-=gap) {
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
        }
        return arr;
    }
}

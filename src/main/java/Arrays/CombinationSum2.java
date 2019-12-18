package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        generateResult(0, candidates, new ArrayList<>(), 0, target, result);
        return result;
    }

    private void generateResult(int index, int[] candidates, ArrayList<Integer> items, int itemsSum, int target, List<List<Integer>> result) {
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            int addItemSum = itemsSum + candidates[i];
            if (addItemSum > target)
                break;
            else if (addItemSum == target){
                List<Integer> targetItem = new ArrayList<>(items);
                targetItem.add(candidates[i]);
                result.add(targetItem);
                break;
            }else{
                items.add(candidates[i]);
                generateResult(i + 1, candidates, items, addItemSum, target, result);
                items.remove(items.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
}

package String;

import java.util.*;

public class Compress {
    public class Node {
        char ch;
        int count;
    }

    public int compress(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;
        LinkedList<Node> list = new LinkedList();
        Node head = new Node();
        list.addLast(head);
        for (int i = 0; i < chars.length; i++) {
            Node last = list.getLast();
            char ch = chars[i];
            if (ch == last.ch) {
                last.count++;
            } else {
                Node temp = new Node();
                temp.ch = ch;
                temp.count++;
                list.add(temp);
            }
        }
        int index = 0;
        for (Node node : list) {
            if (node == head) {
                continue;
            } else {
                chars[index++] = node.ch;
                if (node.count != 1) {
                    char[] count = String.valueOf(node.count).toCharArray();
                    for (char ch : count) {
                        chars[index++] = ch;
                    }
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String temp1 = "6cd1e7fd-d043-4b07-9ac7-c2a1366cafa0,be39b2cc-7a70-4357-8371-697c4089eb0c,b255b494-dee0-4f20-8908-3c5c743d7cee,5ec03aa5-74d8-4668-923f-5a39cbc4cca1,4fe4761a-a0f9-407e-8f7d-7e762ca9eb6c,c51f03a2-93da-4316-a727-e0653a9af2d7,f53e478e-4eab-4d18-b8e6-471490665f54,0df04582-872d-496c-9b2d-9205467cb9de,83c9a07b-0e47-440d-9635-62d33d794b88,4d2574f7-1fff-4638-bc94-16ccf0f25229,05ddb376-89b8-418b-878b-21fe19168f9b,38162c26-5959-4abe-b6dd-15f96036cdbf,97cf3638-e531-4b8b-98b5-245154bf1aa4,29798d75-23b4-4eab-b05f-4d3c5c79b88a,8895c75c-e91c-4022-8590-8e611f295ab9,6bc0e5aa-3590-4600-843f-c224d39cba84,cf52b83d-2914-474e-b5ed-8220f67ec83d,fe999cb9-be3b-41b8-a5b6-c1638d1ec780,a89765bb-dd65-4146-a371-c537b5606b11,5a2d59ee-a1bc-4b91-b82d-52c29b8dfd93,80ed24a9-e150-4d06-a2d4-035cf58f625c,bea658c4-ef52-49cb-bb24-6bfcc267679b,7f559f5a-827d-4665-89b3-e02636012ee0,4fd3b261-234e-46be-83e6-89ac6a40acf2,658c070d-4b89-4d54-91f1-e13f791c61b0,08685f2c-03c3-4026-a5c5-89a0acac599c,f4f10ecd-dfba-4c2f-ab81-2dda5db6bf88,cba534d3-5cff-4800-9433-fc36fc58bce2,5264d65d-efe1-45df-9ac6-2ffe1e5778a9,de6690cd-1171-4200-8071-8cd6db03d9f9,f98e3f82-1fb3-4a79-8c35-ac7427ead965,44a2ec49-7ef4-46b8-b497-f9733822bec3,1d91b0f2-56aa-465e-a906-ae3a14619f27,a73004df-cadd-46a6-9675-9db34aa3cb73,cf968a03-4298-4c40-b327-eafed400ebd3,924c2cc4-31f3-437f-9c11-4e57e23f5c49,a81f01c5-eefe-4dae-b29c-5f6c19eb43c9,bc2374dd-d255-4505-bd09-4ebf7ddbf114,c5a357f9-e738-4f67-b271-6ba83f71b685,b71eb62d-1dd9-4f0f-9df7-9a3c2d821c22";
        String temp2 = "b255b494-dee0-4f20-8908-3c5c743d7cee,83c9a07b-0e47-440d-9635-62d33d794b88,38162c26-5959-4abe-b6dd-15f96036cdbf,29798d75-23b4-4eab-b05f-4d3c5c79b88a,bea658c4-ef52-49cb-bb24-6bfcc267679b,cba534d3-5cff-4800-9433-fc36fc58bce2,f98e3f82-1fb3-4a79-8c35-ac7427ead965,44a2ec49-7ef4-46b8-b497-f9733822bec3,cf968a03-4298-4c40-b327-eafed400ebd3,bc2374dd-d255-4505-bd09-4ebf7ddbf114|6cd1e7fd-d043-4b07-9ac7-c2a1366cafa0,f53e478e-4eab-4d18-b8e6-471490665f54,6bc0e5aa-3590-4600-843f-c224d39cba84,5a2d59ee-a1bc-4b91-b82d-52c29b8dfd93,80ed24a9-e150-4d06-a2d4-035cf58f625c,7f559f5a-827d-4665-89b3-e02636012ee0,4fd3b261-234e-46be-83e6-89ac6a40acf2,1d91b0f2-56aa-465e-a906-ae3a14619f27,924c2cc4-31f3-437f-9c11-4e57e23f5c49,a81f01c5-eefe-4dae-b29c-5f6c19eb43c9|5ec03aa5-74d8-4668-923f-5a39cbc4cca1,4d2574f7-1fff-4638-bc94-16ccf0f25229,97cf3638-e531-4b8b-98b5-245154bf1aa4,8895c75c-e91c-4022-8590-8e611f295ab9,fe999cb9-be3b-41b8-a5b6-c1638d1ec780,a89765bb-dd65-4146-a371-c537b5606b11,658c070d-4b89-4d54-91f1-e13f791c61b0,de6690cd-1171-4200-8071-8cd6db03d9f9,a73004df-cadd-46a6-9675-9db34aa3cb73,c5a357f9-e738-4f67-b271-6ba83f71b685|be39b2cc-7a70-4357-8371-697c4089eb0c,4fe4761a-a0f9-407e-8f7d-7e762ca9eb6c,c51f03a2-93da-4316-a727-e0653a9af2d7,0df04582-872d-496c-9b2d-9205467cb9de,05ddb376-89b8-418b-878b-21fe19168f9b,cf52b83d-2914-474e-b5ed-8220f67ec83d,08685f2c-03c3-4026-a5c5-89a0acac599c,f4f10ecd-dfba-4c2f-ab81-2dda5db6bf88,5264d65d-efe1-45df-9ac6-2ffe1e5778a9,b71eb62d-1dd9-4f0f-9df7-9a3c2d821c22";
        List<String> list1 = Arrays.asList(temp1.split(","));
        list1 .sort(Comparator.naturalOrder());
        List<String> list2 = Arrays.asList(temp2.split(","));
        list2 .sort((o1, o2) -> o1.compareTo(o2));

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))){
                System.out.println("saasas");
                break;
            }
        }
        System.out.println("wdqwd");
        new Compress().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c', 'a'});
    }
}

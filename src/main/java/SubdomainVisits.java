import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String str = cpdomains[i];
            String[] temp = str.split(" ");
            int count = Integer.valueOf(temp[0]);
            String[] yu = getyu(temp[1]);

            for (int j = 0; j < yu.length; j++) {
                if (map.get(yu[j]) == null){
                    map.put(yu[j],count);
                }else{
                    int counttemp = count + Integer.valueOf(map.get(yu[j]));
                    map.put(yu[j],counttemp);
                }
            }
        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    private String[] getyu(String str){
        String[] yu = str.split("\\.");
        int length = yu.length;
        for (int i = 0; i < length; i++) {
            String temp = "";
            for (int j = i; j < length; j++) {
                temp = temp + yu[j] + ".";
            }
            yu[i] = temp.substring(0,temp.length() - 1);
        }
        return yu;
    }

    public static void main(String[] args) {
        String cc = "discuss.leetcode.com";
        String[] ccc = cc.split("\\.");

        new SubdomainVisits().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }
}

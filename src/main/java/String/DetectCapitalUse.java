package String;

public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int flag = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (i == 0) {
                if (Character.isUpperCase(ch)) {
                    flag = 1;// 首字母大写
                } else {
                    flag = 2;// 首字母小写
                }
                continue;
            } else {
                if (flag == 1) {
                    if (Character.isUpperCase(ch)) {
                        flag = 3; // 全部大写
                    } else {
                        flag = 4; // 首字母大写，其余小写
                    }
                } else if (flag == 2) {
                    if (Character.isUpperCase(ch)){
                        return false;
                    }
                }else if (flag == 3){
                    if (!Character.isUpperCase(ch)){
                        return false;
                    }
                }else if (flag == 4){
                    if (Character.isUpperCase(ch)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

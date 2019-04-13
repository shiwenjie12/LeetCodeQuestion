import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVConvert {
    /**
     * 读取txt文件的内容
     *
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public void csv2Output(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            StringBuilder sb = new StringBuilder();
            while ((s = br.readLine()) != null) {
                String temp = s.replaceAll("\"\"", "\"");
                char[] chars = temp.toCharArray();
                List<String> tempsArr = new ArrayList<>();
                int first = 0;
                boolean flag = false;
                for (int i = 1; i < chars.length; i++) {
                    if (flag == false && chars[i] == '"') {
                        flag = true;
                        first = i + 1;
                    }
                    if (chars[i] == ',') {
                        if (flag == false) {
                            tempsArr.add(new String(chars, first, i - first));
                            first = i + 1;
                        } else if (chars[i - 1] == '"') {
                            tempsArr.add(new String(chars, first, i - first - 1));
                            flag = false;
                            first = i + 1;
                        }
                    }
                }
                tempsArr.add(new String(chars, first, chars.length - 1 - first));
                for (int i = 0; i < tempsArr.size(); i++) {
                    if (i == 0) {
                        sb.append(tempsArr.get(i) + "\t");
                    }
                    if (i == 1 || i == 2) {
                        sb.append("'" + tempsArr.get(i) + "'" + "\t");
                    }
                    if (i == 3) {
                        sb.append(Float.valueOf(tempsArr.get(i)) + "\t");
                    }
                    if (i == 4) {
                        sb.append(tempsArr.get(i).replace("-", "/") + "\t");
                    }
                }
                sb.append(System.lineSeparator());
            }
            br.close();
            System.out.println(sb.toString());
            Write2Output(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("D:/csv.txt");
        new CSVConvert().csv2Output(file);
    }

    private void Write2Output(String str) {
        try {
            File writename = new File("D:/output.txt");
            writename.createNewFile();
            try (
                    FileWriter fileWriter = new FileWriter(writename);
                    BufferedWriter out = new BufferedWriter(fileWriter)) {
                out.write(str);
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

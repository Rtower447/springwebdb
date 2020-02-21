package tools;

public class Tool {
    public static void out(String info, Object val){
        System.out.printf("\033[31m%sFF %s\n%s\n%s\033[0m", "\n", info, val, "\n");
    }
}

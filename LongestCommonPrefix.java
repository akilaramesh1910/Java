public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
        String value=longestCommonPrefix(str);
        System.out.println(value);
    }
    public static String longestCommonPrefix(String[] strs) {
        String s1="";
        int length=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(length>strs[i].length()){
                length=strs[i].length();
            }
        }
        for(int i=0;i<length;i++){
            char c1=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=c1){
                    return s1;
                }
            }
            s1+=strs[0].charAt(i);
        }
        return s1;
    }
}



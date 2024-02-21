public class WordPattern{
    public static void main(String[] args){
        String pattern="abba";
        String s="dog cat cat dog";
        boolean result=isPattern(pattern,s);
        System.out.println(result);
    }
    public static boolean isPattern(String pattern,String s){
        char c[]=new char[pattern.length()];
        String str[]=s.split(" ");
        for(int i=0;i<c.length;i++){
            c[i]=pattern.charAt(i);
        }
        if (c.length!=str.length) {
            return false;
        }
        else{
            for(int i=0;i<c.length;i++){
                for(int j=i+1;j<c.length;j++){
                    if(c[i]==c[j] && str[i].equals(str[j])){
                        continue;
                    }
                    if(c[i]!=c[j] && !str[i].equals(str[j])){
                        continue;
                    }
                    if(c[i]!=c[j] && str[i].equals(str[j])){
                        return false;
                    }
                    if(c[i]==c[j] && !str[i].equals(str[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

    public class Main {
        static void LongestSubstring(String s){

            char[] charArray = s.toCharArray();

            String longestsub = null;
            int length = 0;

            Map<Character,Integer> map = new LinkedHashMap<>();

            for( int i = 0; i < charArray.length; i++){
                char ch = charArray[i];
                if(!map.containsKey(ch)){
                    map.put(ch,i);

                }else{
                    i = map.get(ch);
                    map.clear();
                }
                if(map.size() > length){
                    length = map.size();
                    longestsub = map.keySet().toString();
                }


            }

            System.out.println("Longest Substring: "+longestsub);
            System.out.println("Length: "+length);
        }
        public static void main(String[] args) {

            LongestSubstring("GeeksForGeeks");

        }
}
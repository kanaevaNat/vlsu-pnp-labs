public class SearchNod{
    public static int gcd(int a,int b) {//находит нод двух чисел
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public int search_nod (int[] arr){//находит минимальный нод среди всех пар чисел
        int nod;
        int result=1001;
        for (int i = 0;i<=(arr.length-2);i++){
            for (int j=i+1;i<=arr.length-1;i++){
                nod=gcd(arr[i],arr[j]);
                if (nod<result) result=nod;
            }
        }
        return result;
    }
}
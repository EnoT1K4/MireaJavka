public class Pr8 {

    public static int Summa(int a){
        if(a<10) return a;
        return a%10 + Summa(a/10);
    }

    public static boolean isSimple(int num,int i){
        if(num == 1) return false;
        if (num == 2) return true;
        if (num %i ==0) return false;
        if (i <= Math.sqrt(num)){
            return isSimple(num,i+1);
        }
        return true;
    }

    public static void mnoz(int n, int k){
        if(k>n/2){
            System.out.println(n);
            return;
        }
        if((n%k)==0){
            System.out.println(k);
            mnoz(n/k, k);
        }
        else{
            mnoz(n,k+=1);
        }
    }



    public static void main(String[] args) {
        System.out.println(Summa(145793));
        System.out.println(isSimple(13,2));
        mnoz(568,2);

    }




}


public class Runner {

    public static void main(String[] args) {
        System.out.println(nearHundred(150));
        System.out.println(nonStart("hello", "yes"));
        System.out.println(alarmClock(1, false));
        int[] a = {1,2,3};
        int[] b = {6,7,8};
        System.out.println(front11(a,b));
        System.out.println(has271(a));
        System.out.println(noTeenSum(15, 7, 9));
        System.out.println(prefixAgain("yes", 3));
        System.out.println(gHappy("eliot"));
        System.out.println(matchUp(a, b));
        System.out.println(fix34(a));
    }


    public static boolean nearHundred(int n) {
        if((n+10>=100 && n+10<=110) || (n-10>=90 && n-10<=100) || (n+10>=200 && n+10<=210) || (n-10>=190 && n-10<=200)){
            return true;
        } else {
            return false;
        }
    }

    public static String nonStart(String a, String b) {
        String c = a.substring(1, a.length());
        String d = b.substring(1, b.length());
        String e = c + d;
        return e;
    }

    public static String alarmClock(int day, boolean vacation) {
        String a = "";
        if(day!=0 && day!=6) {
            if(vacation==true) {
                a = "10:00";
            }else{
                a = "7:00";
            }
        }else{
            if(vacation==true) {
                a = "off";
            }else{
                a = "10:00";
            }
        }
        return a;
    }

    public static int[] front11(int[] a, int[] b) {
        if(a.length>0&&b.length>0){
            int[] c = new int[2];
            c[0] = a[0];
            c[1] = b[0];
            return c;
        }else{
            if(a.length==0&&b.length==0){
                int[] d = new int[0];
                return d;
            }else{
                int[] e = new int[1];
                if(a.length==0){
                    e[0] = b[0];
                    return e;
                }else{
                    e[0] = a[0];
                    return e;
                }
            }
        }
    }

    public static boolean has271(int[] nums) {
        boolean x = true;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i+1]==nums[i]+5 && (nums[i]-1>=nums[i+2]-2 && nums[i]-1<=nums[i+2]+2)){
                x= true;
            }else{
                x= false;
            }
        }
        return x;
    }

    public static int noTeenSum(int a, int b, int c) {
        int na = fixTeen(a);
        int nb = fixTeen(b);
        int nc = fixTeen(c);
        int x = na + nb + nc;
        return x;
    }

    public static int fixTeen(int n) {
        if(n>12&&n<20&&n!=15&&n!=16) {
            return 0;
        }else {
            return n;
        }
    }

    public static boolean prefixAgain(String str, int n) {
        String x = str.substring(0,n);
        String y = str.substring(n);
        if(y.contains(x)){
            return true;
        }
        if(!y.contains(x)){
            return false;
        }
        return false;
    }

    public static boolean gHappy(String str) {
        if(str.length()>2) {
            for(int i=1; i<str.length()-1; i++) {
                String x = str.substring(i, i+1);
                if(x.equals("g")) {
                    String y = str.substring(i+1, i+2);
                    String z = str.substring(i-1, i);
                    if(!y.equals("g") && !z.equals("g")) {
                        return false;
                    }
                }
            }
            if(str.substring(str.length()-1).equals("g")){
                if(!str.substring(str.length()-2,str.length()-1).equals("g")){
                    return false;
                }
            }
        }else{
            if(str.length()==1){
                return false;
            }
            if(str.length()==2){
                if(!str.substring(0,1).equals("g")||!str.substring(1).equals("g")){
                    return false;
                }
            }
        }
        return true;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]-nums2[i]>=-2 && nums1[i]-nums2[i]<=2 && nums1[i] != nums2[i]) {
                count +=1;
            }
        }
        return count;
    }

    public static int[] fix34(int[] nums) {
        int three = 0;
        int afterthree = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==3) {
                three = i;
                afterthree = nums[i+1];
                for(int e=0; e<nums.length; e++) {
                    if(nums[e]==4) {
                        nums[e] = afterthree;
                    }
                }
                nums[i+1] = 4;
            }
        }

        return nums;
    }






}

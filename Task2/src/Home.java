import java.util.Locale;

public class Home {
    public static int oppositeHouse(int number, int lenght) {
        return ((2 * lenght + 1) - number);
    }

    public static String nameShuffle(String str) {
        String[] parts = str.split(" ");
        return parts[1] + " " + parts[0];
    }

    public static int discount(int price, int percent) {
        return (price - (price * (percent / 100)));
    }

    public static int differenceMaxMin(int[] sample) {
        int max = sample[0];
        int min = sample[0];
        for (int i = 1; i < sample.length - 1; i++) {
            if (sample[i] < sample[i + 1]) {
                min = sample[i];
            }
            if (sample[i] > sample[i + 1]) {
                max = sample[i];
            }
        }
        return max - min;
    }
    public static int equal (int a, int b, int c){
        int k = 1;
      if ( a == b){
           k = k+1;
       }
       if (a==c){
           k = k+1;
       }
       if (b==c){
       k  = k+1;
       }
if (k==4){
    k = k-1;
}
return k;
    }
    public static String reverse(String str){
        String result = "";
  for (int i = 0; i< str.length(); i++){
      result = str.charAt(i) + result;
    }
  return result;
    }
public static int programmers (int programmer1, int programmer2, int programmer3){
    int maximum = Math.max(programmer1, programmer2);
 if (programmer3 > maximum){
   maximum = programmer3;
 }
 int minimum = Math.min(programmer1, programmer2);
if (programmer3 < minimum){
   minimum = programmer3;
 }
int difference  = maximum - minimum;
    return difference;
  }
  public static boolean getXO(String str){
      int x = 0;
   int o = 0;
      String str1=str.toLowerCase(Locale.ROOT);

      for (int i = 0; i<str.length(); i++){

    if (str1.charAt(i) == 'x'){
       x = x+1;
    }
    if (str1.charAt(i) == 'o') {
        o = o + 1;
    }
  }
      return x==o;
  }
  public static String bomb( String str){
         String str1=str.toLowerCase(Locale.ROOT);
      int word = str1.indexOf("bomb");
    if(word == - 1) {
      return("Relax, there's no bomb.");
    }
    else{
      return ("DUCK!");
    }
  }

public static boolean sameAscii(String as, String bs){
    int a,b;
      a=0;b=0;
     for (int i=0;i<as.length();i++){
          a+=as.charAt(i);
      }
    for (int i=0;i<bs.length();i++){
         b+=bs.charAt(i);
     }
   return (a==b);

 }

    public static void main(String[] args) {
        System.out.println(oppositeHouse(11, 6) + " дом");
        System.out.println(nameShuffle("Денис Бурдак"));
        System.out.println(discount(89, 20));
        int []sample = {10, 4, 66, -4, 21, 90, -21};
        System.out.println(differenceMaxMin(sample));
        System.out.println(equal(1,1,1));
        System.out.println(reverse("Hello world"));
        System.out.println(programmers(147,33,526));
        System.out.println(getXO("ooXX"));
        System.out.println(bomb("There is a BOOMB."));
        System.out.println(sameAscii("AA", "B@"));

    }
}



//
//
//
//
//
//
//
//
//
//
//



//public class Home{
//    public static void main(String[] args){
//        String str = "Денис Бурдак";
//        String[] parts = str.split(" ");
//
//        System.out.println(parts[1] + " " + parts[0]);
//    }
//}


//public class Home{
//    public static void main(String[] args){
//        int sample [] = {10, 4, 66, -4, 21, 90, -21};
//        int max = sample[0];
//        int min = sample[0];
//        for (int i = 1; i<sample.length-1; i++){
//            if (sample[i]<sample[i+1]){
//                min = sample[i];
//            }
//            if (sample[i]>sample[i+1]){
//                max = sample[i];
//            }
//        }
//
//        int difference = max - min;
//        System.out.println(difference);


//
//    }
//}

//public class Home{
//   public static void main(String[] args){
//       int a = 1;
//       int b = 1;
//       int c = 1;
//       int k = 1;
//       if ( a == b){
//           k = k+1;
//       }
//       if (a==c){
//           k = k+1;
//       }
//       if (b==c){
//       k  = k+1;
//       }
//if (k==4){
//    k = k-1;
//}
//       System.out.println(k);
//
//
//    }
//    }


//public class Home{
//  public static void main(String[] args){
//    String str = "Hello world";
//    String result = "";
//    for (int i = 0; i< str.length(); i++){
//      result = str.charAt(i) + result;
//    }
//    System.out.println(result);
//
//
//  }
//}

//import static java.lang.Math.*;
//public class Home{
//  public static void main(String[] args){
//int programmer1 = 147;
//int programmer2 = 33;
//int programmer3 = 526;
// int maximum = Math.max(programmer1, programmer2);
// if (programmer3 > maximum){
//   maximum = programmer3;
// }
// int minimum = Math.min(programmer1, programmer2);
// if (programmer3 < minimum){
//   minimum = programmer3;
// }
// int difference  = maximum - minimum;
//    System.out.println(difference);
//  }
//}


//public class Home{
//  public static void main(String[] args){
//    String str = "xoo";
//    int x = 0;
//    int o = 0;
//    for (int i = 0; i<str.length(); i++){
//    if (str.charAt(i) == 'x'){
//       x = x+1;
//    }
//    if (str.charAt(i) == 'o'){
//       o = o +1;
//    }
//  }
//if (x == o){
//  System.out.println(true);
//}
//else
//  System.out.println(false);
//  }
//}


//public class Home {
//  public static void main(String[] args) {
//    String str = "There is a boom.";
//    int word = str.indexOf("bomb");
//    if(word == - 1) {
//      System.out.println("Relax, there's no bomb.");
//    }
//    else
//      System.out.println("DUCK!");
//
//  }
//}

//}

//public class Home {
// public static void main(String[] args) {
//      int a,b;
//      a=0;b=0;
//      String as="AA";
//      String bs="B@";
//      for (int i=0;i<as.length();i++){
//          a+=as.charAt(i);
//      }
//     for (int i=0;i<bs.length();i++){
//         b+=bs.charAt(i);
//     }
//     System.out.println(a==b);
//
// }
//}
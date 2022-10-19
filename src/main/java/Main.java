import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//reverse a string and number
        String name = "rajib";
        int num = 12345;

        List<StringBuilder> collect = Stream.of(name)
                .map(string -> new StringBuilder(string).reverse()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(Stream.of(num)
                .map(string -> new StringBuilder(num).append(num)
                        .reverse()).collect(Collectors.toList()));


// find the highest salary
        List<Person> personList = Arrays.asList(new Person("Rajib", 1000, "rajib@gmail.com"),
                new Person("Saroj", 2000, "saroj@gmail.com"),
                new Person("Niraj", 3000, "niraj@gmail.com"));

        System.out.println(personList.stream().mapToInt(x -> x.salary).summaryStatistics().getMax());

// swap two numbers w/o using 3rd variable

        int num1 = 10;
        int num2 = 20;
        System.out.println("Number before swapping: Number 1: "+num1+" Number 2: "+num2);
        num1=num1-num2;//-10
        num2=num1+num2;//10
        num1=num2-num1;//10-(-10)=20
        System.out.println("Number after swapping: Number 1: "+num1+" Number 2: "+num2);
//check palindrome

        String palindrom = "radar";
        String rev="";
        for (int i=palindrom.length()-1;i>=0;i--){
            rev=rev+palindrom.charAt(i);
        }
        if(palindrom.equals(rev)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

        int orginal_num = 131;
        int original_copy=orginal_num;
        int reverse=0;
        while (orginal_num!=0){
            reverse = reverse*10+orginal_num%10;
            orginal_num=orginal_num/10;
        }
        if(original_copy==reverse){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
//count the number of digits in a number
        int aa = 123456789;
        int count=0;
        while (aa>0){
            aa=aa/10;
            count=count+1;
        }
        System.out.println("The number of digits are: "+count);

//count the number of odd and even numbers in a digit

        int bb = 123456789;
        int even_count =0;
        int odd_count = 0;
        while (bb>0){
            if(bb%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }
            bb=bb/10;
        }
        System.out.println("Even number count: "+even_count);
        System.out.println("Odd number count: "+odd_count);

// sum of all digits in a number
        int cc = 12345;
        int rem=0;

        while (cc>0){
            rem=rem+cc%10;
            cc=cc/10;
        }
        System.out.println("the sum of digits of the number is: "+rem);

// generate fibnocci series
        // 0 1 1 2 3 5 8 13 21 34
        int fibbo1 =0;
        int fibbo2=1;
        int fibbo_sum=0;
        System.out.print(fibbo1+" "+fibbo2);
        for(int i=2;i<10;i++){
            fibbo_sum=fibbo1+fibbo2;
            System.out.print(" "+fibbo_sum);
            fibbo1=fibbo2;
            fibbo2=fibbo_sum;
        }

// check if a number is prime or not
        int check_prime = 11;
        int count_prime=0;
        if (check_prime>1){
            for (int i=1; i<=check_prime;i++){
                if (check_prime%2==0){
                    count_prime++;
                }
            }
            if(count_prime>2){
                System.out.println("Not a prime number");
            }
            else {
                System.out.println("Prime number");
            }
        }
// print random numbers
        System.out.println("Random numbers: "+Math.random());

// write a program of factorial
        int input_factorial=6;
        int start_factorial=1;
        for(int i=1;i<=input_factorial;i++){
            start_factorial=start_factorial*i;
        }
        System.out.println("Factorial of "+input_factorial+" is: "+start_factorial);

//Find Sum of Elements in Array, find even and odd numbers

      List<Integer> arrayList = Arrays.asList(1,2,4,3,8,9);
      System.out.println(arrayList.stream().reduce((a, b) -> (a + b)));
      System.out.println(arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
      System.out.println(arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));

//How To Check The Equality Of Two Arrays
         int a1[] = {1,2,3,4,5};
         int a2[] = {1,2,3,4,5,6};
        boolean equals = Arrays.equals(a1, a2);
        if (equals==true) {
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
// find missing number in an array
        int missing[]={1,2,3,5,6};
        int missing_sum=0;
        int actual_sum=0;
        for (int i =0; i<missing.length;i++){
            missing_sum=missing_sum+missing[i];
        }
        for(int i=0;i<=6;i++){
            actual_sum=actual_sum+i;
        }
        System.out.println("Missing element is :"+(actual_sum-missing_sum));

// How To Find Maximum & Minimum Values in Array
        int findMax[]={1,2,3,4,5,6,7,8,8};
        System.out.println(Arrays.stream(findMax).summaryStatistics().getMax());
        System.out.println(Arrays.stream(findMax).summaryStatistics().getMin());
// find duplicate eleement in arrray
        String arr[]={"rajib","rajib","amrit","rupam"};
        for (int i=0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("the duplicate element is:"+arr[i]);
                }
            }
        }
        Arrays.stream(arr).distinct().forEach(i-> System.out.println(i));
// find an element in array

        String arre[]={"One","Two","Three","Four","Five"};
        String find="Two";
        boolean flag = false;
        for(int i=0;i< arre.length;i++) {
            if (arre[i] == find) {
                System.out.println("elenet is found at" + i);
                flag = true;
                break;
            }
        }
        if (flag==false){
            System.out.println("element not found");
        }

// sort elements in array
        int sortTest[]={45,87,10,2,9,5,65,21};
        System.out.println(Arrays.toString(Arrays.stream(sortTest).sorted().toArray()));

// remove all the spaaces
        String spaces = "Java Programming Is Cool";
        System.out.println(spaces.replaceAll("\\s", ""));
//How To Count Occurrences of a Character in a String
        String occurances = "Java Programming with java coding practice";
        int actualLength = occurances.length();
        String afterReplace = occurances.replace("a", "");
        int lengthAfterReplace = afterReplace.length();
        System.out.println("No of a's in the statement: "+(actualLength-lengthAfterReplace));

//How To Count Words in a String
        String countingWords= "Welcome to the interview";
        System.out.println(Arrays.stream(countingWords.split(" ")).count());
        //another way
        int wordCount=1;
        for (int i =0; i<countingWords.length();i++){
            if ((countingWords.charAt(i)==' ') && (countingWords.charAt(i+1)!=' ')){
                wordCount++;
            }
        }
        System.out.println("The number of words is: "+wordCount);

//How To Reverse Each Word in a String

        String reverseAll = "Welcome to Java Programming";
        String[] s = reverseAll.split(" ");
        String reversedString="";
        for(String w:s){
            String reverseWord="";
            for(int i = w.length()-1;i>=0;i--){
                reverseWord=reverseWord+w.charAt(i);
            }
            reversedString=reversedString+reverseWord+" ";
        }
        System.out.println(reversedString);


    }
}

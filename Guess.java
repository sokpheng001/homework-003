import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        char [] name = new char[20];
        System.out.print("Insert your name: ");
        String name_ = new Scanner(System.in).nextLine();
        String name1 = name_.toUpperCase();
        int sum = 0,sum1=0,sum2=0;
        for(int i=0;i<name1.length();i++){
                switch ((name1.charAt(i))){
                    case 'A':
                        sum+=1;
                        break;
                    case 'B':
                        sum+=2;
                        break;
                    case 'C':
                        sum+=3;
                        break;
                    case 'D':
                        sum+=4;
                        break;
                    case 'E':
                        sum+=5;
                        break;
                    case 'F':
                        sum+=6;
                        break;
                    case 'G':
                        sum+=7;
                        break;
                    case 'H':
                        sum+=8;
                        break;
                    case 'I':
                        sum+=9;
                        break;
                    case 'J':
                        sum+=1;
                        break;
                    case 'K':
                        sum+=2;
                        break;
                    case 'L':
                        sum+=3;
                        break;
                    case 'M':
                        sum+=4;
                        break;
                    case 'N':
                        sum+=5;
                        break;
                    case 'O':
                        sum+=6;
                        break;
                    case 'P':
                        sum+=7;//P
                        break;
                    case 'Q':
                        sum+=8;
                        break;
                    case 'R':
                        sum+=9;
                        break;
                    case 'S':
                        sum+=1;
                        break;
                    case 'T':
                        sum+=2;
                        break;
                    case 'U':
                        sum+=3;
                        break;
                    case 'V':
                        sum+=4;
                        break;
                    case 'W':
                        sum+=5;
                        break;
                    case 'X':
                        sum+=6;
                        break;
                    case 'Y':
                        sum+=7;//P
                        break;
                    case 'Z':
                        sum+=8;
                        break;
                    case ' ':
                        sum+=0;
                        break;
                    default:
                        sum+=0;
                        break;
            }
        }
        int result;
        while (true){
            result = sum/10;
            sum = sum%10;
            sum1 = sum + result;
            if(sum1>9){
                result = sum1/10;
                sum1 = sum1%10;
                sum2 = result + sum1;
                System.out.println("You are in number: " + sum2);
            }else {
                System.out.println("You are in number: " + sum1);
            }
            break;
        }
    }
}

public class Robot
{
    public void ejercicio1(int n){
        int num = 1;
        System.out.println(1);
        int incr = 1;
        int cont = 1;
        while(cont < n){
            if (incr == 1 && cont < n){
                while (incr < 3 && cont < n){
                    num = num + incr;
                    System.out.println(num);
                    incr ++;
                    cont ++;
                }
            }
            if(incr == 3 && cont < n){
                while (incr > 1 && cont <= n){
                    num = num + incr;
                    System.out.println(num);
                    incr--;
                    cont ++;
                }
            }
        }
    }
    public void ejercicio2(int n){
        int a1 = 1;
        int a2 = 1;
        int a3 = 1;
        int an;
        int cont = 1;
        while (cont <= n){
            if (cont <= 3){
                System.out.println(1);
                cont ++;
            }else if(cont > 3){
                an = a2 + a1;
                System.out.println(an);
                a1 = a2;
                a2 = a3;
                a3 = an;
                cont ++;
            }
        }
    }
}

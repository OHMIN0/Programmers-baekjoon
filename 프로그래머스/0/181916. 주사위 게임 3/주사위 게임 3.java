import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if (a==b && b==c && c==d) 
            answer = 1111*a;
        
        else if (a==b&&b==c&&c!=d)
            answer = (int)Math.pow(10*a+d, 2);
        else if (b==c&&c==d&&d!=a) 
            answer = (int)Math.pow(10*b+a, 2);
        else if (c==d&&d==a&&a!=b) 
            answer = (int)Math.pow(10*c+b, 2);
        else if (d==a&&a==b&&b!=c) 
            answer = (int)Math.pow(10*d+c, 2);
        
        else if (a==b && b!=c && c==d)
            answer = (a+d)*Math.abs(a-d);
        else if (a==c && a!=d && b==d)
            answer = (a+b)*Math.abs(a-b);
        else if (a==d && a!=b && b==c)
            answer = (a+c)*Math.abs(a-c);
                        
        else if (a==b && a!=c && a!=d && c!=d)
            answer = c*d;
        else if (a==c && a!=b && a!=d && b!=d)
            answer = b*d;
        else if (b==c && b!=d && b!=a && d!=a)
            answer = d*a;
        else if (b==d && b!=a && b!=c && c!=a)
            answer = c*a;
        else if (c==d && c!=a && c!=b && a!=b)
            answer = a*b;
        else if (d==a && d!=b && d!=c && b!=c)
            answer = b*c;
        
        else {
            if (a<b && a<c && a<d)
                answer=a;
            else if (b<a&&b<c&&b<d)
                answer=b;
            else if (c<a&&c<b&&c<d)
                answer=c;
            else 
                answer = d;
        }
            
        
        
        return answer;
    }
}
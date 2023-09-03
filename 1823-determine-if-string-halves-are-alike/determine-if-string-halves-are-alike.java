// class Solution {
//     public boolean halvesAreAlike(String s) {
//         int n=s.length();
//         int j=n/2;
//         int count1 = 0,count2 = 0;
//         String vowels ="aeiouAEIOU";
//         for(int i=0;i<n/2;i++) 
//         {
//             char ch1 =s.charAt(i);
//             char ch2 =s.charAt(j+i);
//             if(vowels.indexOf(ch1)!=-1)
//             count1++;
//             if(vowels.indexOf(ch1)!=-1)
//             count2++;
//         }

//         return count1==count2;
//     }
// }

class Solution {
    public boolean halvesAreAlike(String s) {
        
int c = s.length();
//System.out.println(c);

int d = c/2;

char [] a = new char[d];
char [] b = new char[d];
int f=0;
int g=0;
for (int i = 0; i < d; i++) {
a[i] = s.charAt(i);
//System.out.print(a);

if (a[i] == 'a'){

f+=1;

}
else if (a[i] == 'e'){

f+=1;

}
else if (a[i] == 'i'){

f+=1;

}
else if (a[i] == 'o'){

f+=1;

}
else if (a[i] == 'u'){

f+=1;

}
else if (a[i] == 'A'){

f+=1;

}
else if (a[i] == 'E'){

f+=1;

}
else if (a[i] == 'I'){

f+=1;

}
else if (a[i] == 'O'){

f+=1;

}
else if (a[i] == 'U'){

f+=1;

}
else{
    //System.out.print("hi");
}
}
for (int i = d; i < c; i++) {
    int r = i-d;
b[r] = s.charAt(i);
//System.out.print(b);

if (b[r] == 'a'){

g+=1;

}
else if (b[r] == 'e'){

g+=1;

}
else if (b[r] == 'i'){

g+=1;

}
else if (b[r] == 'o'){

g+=1;

}
else if (b[r] == 'u'){

g+=1;

}
else if (b[r] == 'A'){

g+=1;

}
else if (b[r] == 'E'){

g+=1;

}
else if (b[r] == 'I'){

g+=1;

}
else if (b[r] == 'O'){

g+=1;

}
else if (b[r] == 'U'){

g+=1;

}
else{
    //System.out.print("hi");
}
}
System.out.println(f);
System.out.println(g);
if (f == g){
    return true;
}
else {
    return false;
}



    }
}
package OOPS;


class ComplexNmbr{

    
    int real;
    int imaginary;

    // constructor
        ComplexNmbr(int real, int imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }

    ComplexNmbr add(ComplexNmbr y){
        int sumReal = real+y.real;
        int sumImag = imaginary+y.imaginary;
        ComplexNmbr res = new ComplexNmbr(sumReal, sumImag);
        return res;
    }
    

    void print(){
        // 2 + 3i
        System.out.println("this = "+this);
        System.out.println(this.real+" + "+this.imaginary+"i");
    }

    public String toString(){
        return this.real + " + "+ this.imaginary+"i";
        // return "This is a complex Number";
    }

}

public class toStringMethod {
    public static void main(String[] args) {
        ComplexNmbr z1 = new ComplexNmbr(2,3);
        z1.print();
        ComplexNmbr z2 = new ComplexNmbr(-5,4);
        z2.print();
        ComplexNmbr z = z1.add(z2);
        z.print();

        System.out.println(""+z); // z.toString() methid will be   automatically called and return a string 
        System.out.println(z); 
    }
}
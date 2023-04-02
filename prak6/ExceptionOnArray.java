/*File: ExceptionOnArray.java
Dhiya Ulhaq 24060121140134
* Deskripsi : Program penggunaan eksepsi menggunakan class library Java
*/
public class ExceptionOnArray{
    public static void main(string[] args){
    //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4]; 
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexoutofBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}